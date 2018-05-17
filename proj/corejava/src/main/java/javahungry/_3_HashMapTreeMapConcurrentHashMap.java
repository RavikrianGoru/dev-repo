package javahungry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/*
HashMap:
1) No order in HashMap
2) Internal HashMap implementation uses Hashing
3) HashMap allows one null for Key and Many nulls for Value
4) get/put takes O(1)----(performance high compare to TreeMap)
5) not having rich functionality
6) HashMap uses equals() method for comparing. 
7) implements Map interface

TreeMap:
1) Natural Ordering in TreeMap, if not override compareTo()
2) TreeMap internally uses Red-Black tree 
3) TreeMap can not contains null Key but allows many nulls for Value.
4) get/put takes O(log n)----(performance low compare to HashMap)
5) having rich functionality such as pollFirstEntry(),tailMap(),FirstKey(),lastKey()
6) TreeMap uses compareTo() method for comparing. 
7) implements NavigableMap interface


1. Fail-fast iterators : The iterator's returned by the both class are fail-fast . 
	Hence , if the object is modified after the iterator is created , in any way except through the iterator's own remove() method , the iterator will throw the ConcurrentModificationException.
2. Clone() method  : Both HashMap and TreeMap uses shallow copy technique to create clone of their objects.
3. Not Thread Safe :  Both HashMap and TreeMap class are unsynchronized . In other words , multiple threads can access the same object at a given time.
Although you can externally make both the classes synchronized :
HashMap :      Map m = Collections.synchronizedMap(new HashMap (...));
TreeMap :       Map m = Collections.synchronizedSortedMap(new TreeMap (...));
4. Package :  Both classes belong to the same package java.util and both are the members of the Java Collections Framework.

When to Prefer TreeMap over HashMap 
1. Sorted elements are required instead of unordered  elements. The sorted list return by TreeMap is always in ascending order.
2. TreeMap uses Red-Black algorithm underneath  to sort out the elements . When one need to perform read/write operations frequently , then TreeMap is a good choice
----------------------------------------------------------
How HashMap works / internal implementation of get() and put(key,value) in HashMap?


*) HashMap works on the principle of Hashing. (  i.e  Hash Function , Hash Value and Bucket .)
*) hashCode() returns int value(hash value). this method available in Object class.
*) A bucket is used to store key value pairs . A bucket can have multiple key-value pairs . In hash map, bucket used simple linked list to store objects.
*) HashMap Default Capacity:16
*) Load factor: .75f
   
   get() method:
   public V get(Object key) 
   {
        Node<K,V> e;
        return (e = getNode(hash(key), key)) == null ? null : e.value;
   }

   
   final Node<K,V> getNode(int hash, Object key) 
    {
        Node<K,V>[] tab; Node<K,V> first, e; int n; K k;
        if ((tab = table) != null && (n = tab.length) > 0 &&
            (first = tab[(n - 1) & hash]) != null) {
            if (first.hash == hash && // always check first node
                ((k = first.key) == key || (key != null && key.equals(k))))
                return first;
            if ((e = first.next) != null) {
                if (first instanceof TreeNode)
                    return ((TreeNode<K,V>)first).getTreeNode(hash, key);
                do {
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        return e;
                } while ((e = e.next) != null);
            }
        }
        return null;
    }


  static final int hash(Object key) 
  {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
  }
  
   put-,-) method:
   public V put(K key, V value) 
   {
        return putVal(hash(key), key, value, false, true);
   }


*) Whenever we call get( Key k )  method on the HashMap object . First it checks that whether key is null or not .  Note that there can only be one null key in HashMap . 
*) hash(-) ---> internally uses hashCode() due to poor quality of hash function
*) if two hash Codes are same then equals(-) method comes into picture. bucket is implemented LinkedList or similar to linkedList. 
*) if two keys hashCode and reference by equals() for two keys are same: it overrides.
*) if we want to use any custom class as key in HashMap, we must override equals() and hashCode() methods.
*) the complexity of get() and put() is O(1)
*) 	

 How will you measure the performance of HashMap?
 	An instance of HashMap has two parameters
 	1) Capacity---(16)----> Number of buckets
 	2) Load factor------(0.75)----> is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
 	   When the number of entries in the hash table exceeds the product of the load factor and the current capacity 
 	   the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.
 	 
   
Difference between HashMap and ConcurrentHashMap?

HashMap is not Thread-Safe------ConcurrentHashMap is Thread-Safe(one Thread at a time)
new HashMap()-------------------new ConcurrentHashMap() or Collections.synchronizedMap( hashMapObject);
no synchronized------------------- synchronizedMap(-) creates HashMap which is equivalent to HashTable.
Allows one null key------------ does not allows null key
In multiple threaded environment HashMap is usually faster than ConcurrentHashMap.


Why we need ConcurrentHashMap when we already had Hashtable ?
Hashtable provides concurrent access to the Map.Entries objects by locking the entire map to perform any sort of operation (update,delete,read,create). 
Suppose we have a web application , the overhead created by Hashtable  (locking the entire map) can be ignored under normal load. 
But under heavy load , the overhead of locking the entire map may prove fatal and may lead to delay response time and   overtaxing of the server.

public ConcurrentHashMap (int initialCapacity, float loadFactor, int concurrencyLevel)  

initialCapacity - the initial capacity. The implementation performs internal sizing to accommodate this many elements.
concurrencyLevel - the estimated number of concurrently updating threads. The implementation performs internal sizing to try to accommodate this many threads.

static final int DEFAULT_INITIAL_CAPACITY = 16;
static final int DEFAULT_CONCURRENCY_LEVEL = 16;

initial capacity parameter and concurrency level parameters of ConcurrentHashMap constructor (or Object) are  set to 16 by default.
 ConcurrentHashMap maintains  a list of 16 locks by default ( number of locks equal to the initial capacity , which is by default  16) each of which is used to lock on a single bucket of the Map.This indicates that 16 threads (number of threads equal to the concurrency level , which is by  default 16) can modify the collection at the same time , given ,each thread works on different bucket. 
 So unlike hashtable, we perform any sort of operation ( update ,delete ,read ,create) without locking on entire map in ConcurrentHashMap.

Why ConcurrentHashMap does not allow null keys and null values ?
The main one is that if map.get(key) returns null, you can't detect whether the key explicitly maps to null vs the key isn't mapped. 

Can multiple threads read from the Hashtable concurrently ?
No multiple threads can not read simultaneously from Hashtable. Reason, the get() method of  Hashtable is synchronized. As a result , at a time only one thread can access the get() method .
It is possible to achieve full  concurrency for reads (all the threads read at the same time) in  ConcurrentHashMap by using volatile keyword.

Does ConcurrentHashMap Iterator behaves like fail fast iterator or fail safe Iterator?
ConcurrentHashMap iterator behaves like fail safe iterator. It will not throw ConcurrentModificationException . We have already discussed Fail Fast Iterator vs Fail Safe Iterator.


*/
public class _3_HashMapTreeMapConcurrentHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap=new HashMap<>();
		ConcurrentHashMap<Integer, String> conHashMap2=new ConcurrentHashMap<>();
		Map conHashMap1=Collections.synchronizedMap(hashMap);
		
		hashMap.put(1, "abc");
		hashMap.put(3, "bbc");
		hashMap.put(5, "cbc");
		hashMap.put(7, "dbc");
		hashMap.put(9, "ebc");
		hashMap.put(11, "fbc");
		hashMap.put(2, "gbc");
		hashMap.put(4, "hbc");
		hashMap.put(6, "ibc");
		hashMap.put(8, "jbc");
		hashMap.put(10, "kbc");
		hashMap.get(null);
		
		hashMap.put(null, null);
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(10));
		System.out.println(hashMap.get(10));
		for(String s:hashMap.values())
		{
			System.out.println(s);
		}
		
		
		conHashMap1.put(1, "abc");
		conHashMap1.put(3, "bbc");
		conHashMap1.put(5, "cbc");
		conHashMap1.put(7, "dbc");
		conHashMap1.put(9, "ebc");
		conHashMap1.put(11, "fbc");
		conHashMap1.put(2, "gbc");
		conHashMap1.put(4, "hbc");
		conHashMap1.put(6, "ibc");
		conHashMap1.put(8, "jbc");
		conHashMap1.put(10, "kbc");
		conHashMap1.put(null, null);
		System.out.println(conHashMap1);
		
		TreeMap tm=new TreeMap();
		tm.put(1, 222);
		tm.put(3, 222);
		tm.put(2, 222);
		tm.put(6, 222);
		tm.put(123, 222);
		tm.put(20, 222);
		System.out.println(tm);

		Map tm1=Collections.synchronizedSortedMap(tm);
		System.out.println(tm1);
		
		
	}

}
