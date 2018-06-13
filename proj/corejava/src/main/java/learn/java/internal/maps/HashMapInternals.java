package learn.java.internal.maps;

import java.util.HashMap;

import learn.java.internal.EmpAsKeyComparable;
import learn.java.internal.EmpPojo;
import learn.java.internal.EmpPojoAsKey;

public class HashMapInternals
{

    public static void main(String[] args)
    {
        /*
        HashMap---> Map implementation & Hashing principle 
        Hash function & Hash value------ hashCode() returns an integer value is Hash value.
        Bucket--- It can have multiple key-value pairs (use simple linked list data structure).
        
        Not synchronized
        Iterator retured by iterator() : fail-fast behavior
        Fail-fast iterators throws ConcurrentModificationException.

        * Map usually acts as a binned (bucketed) hash table, but when bins get too large, they are transformed into bins of TreeNodes
        each structured similarly to those in java.util.TreeMap.
        
        Default capacity=16 
        load factor=0.75
        
        The next size value at which to resize (capacity * load factor)
        
        transient int modCount;
            The number of times HashMap has been structurally modified & modCount is used in iterators on Collection-views of the HashMap fail-fast.
        
        * When two or more keys have same hashcode then equals() method will identify the uniqueness.
          Comparing keys in each entries using keys.equals() until it return true.  Then the corresponding entry object Value is returned.
          
          
        * HashMap performance depends on two factors
             1) Initial capacity 
             2) load factor
             
         The capacity is the number of buckets in the hash table.
         The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
         The hash collisions have disastrous impact on HashMap performance.
         When multiple hashCode() values end up in the same bucket, values are placed in an ad-hoc linked list. 
         In worst case, when all keys are mapped to the same bucket, thus degenerating hash map to linked list - from O(1) to O(n) lookup time.
         
         HashMap<K, V> is fast,  it uses hashCode() and equals() method of keys to split values between buckets. 
         
        static class Node<K,V> implements Map.Entry<K,V> 
        {
            final int hash;
            final K key;
            V value;
            Node<K,V> next;
            .....
        }
        
        ------------------get(-)------------------
        
        public V get(Object key) 
        {
            Node<K,V> e;
            return (e = getNode(hash(key), key)) == null ? null : e.value;
        }
        
        static final int hash(Object key) 
        {
            int h;
            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
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
        
        ------------------put(-,-)------------------    
        put(key,value)------ return old value for the given key, if not old value for given key it returns null.                
        
        
        public V put(K key, V value) 
        {
            return putVal(hash(key), key, value, false, true);
        }
    
    
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) 
        {
            Node<K,V>[] tab; Node<K,V> p; int n, i;
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k;
                if (p.hash == hash &&((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
    
    Problem1: Custom Class does not override hashCode() and equals(-) methods. Then each object will have different hash code for same input objects.
    Duplicate keys will be present.
    
    Problem2: Custom Class is mutable. when we change the object after putting into map. key hashCode will be different. map will return null for updated key object.
    
    */
        populateIntStringHashMap();
        populateEmpPojoStringMap();
        populateEmpPojoAsKeyStringMap();
        populateEmpAsKeyComparableStringMap();
        populatingMapWithMutableProblem();
    }

    public static void populatingMapWithMutableProblem()
    {
        System.out.println("===========================mutable obj as key in HashMap===========================");
        HashMap<EmpPojoAsKey,String> hm=new HashMap<>();
        EmpPojoAsKey e1=new EmpPojoAsKey(1,"Ravi",20000);
        System.out.println(e1.hashCode()+"---hm.put(e1, \"RavikiranGoru\")---"+hm.put(e1, "RavikiranGoru"));
        System.out.println(e1.hashCode()+"========="+hm.get(e1));

        e1.setName("RAVIKIRAN");
        System.out.println(e1.hashCode()+"========="+hm.get(e1));
        
        e1.setName("Ravi");
        System.out.println(e1.hashCode()+"========="+hm.get(e1));
    }

    public static void populateEmpAsKeyComparableStringMap()
    {
        System.out.println("==========HashMap<EmpAsKeyComparable,String>======== EmpAsKeyComparable is has overridden  hashCode() & equals(-) am implements Comparable interface");
        HashMap<EmpAsKeyComparable,String> hm2=new HashMap<>();
        EmpAsKeyComparable ek1=new EmpAsKeyComparable(1,"Ravi",20000);
        EmpAsKeyComparable ek2=new EmpAsKeyComparable(2,"Kiran",40000);
        EmpAsKeyComparable ek3=new EmpAsKeyComparable(3,"Ram",20000);
        EmpAsKeyComparable ek4=new EmpAsKeyComparable(1,"Ravi",20000);
        System.out.println("EmpAsKeyComparable ek1=new EmpAsKeyComparable(1,\"Ravi\",20000);\r\n" + 
                "EmpAsKeyComparable ek2=new EmpAsKeyComparable(2,\"Kiran\",40000);\r\n" + 
                "EmpAsKeyComparable ek3=new EmpAsKeyComparable(3,\"Ram\",20000);\r\n" + 
                "EmpAsKeyComparable ek4=new EmpAsKeyComparable(1,\"Ravi\",20000);\n");
        
        System.out.println(ek1.hashCode()+"---hm1.put(ek1,\"Ravi\")--------> "+hm2.put(ek1,"Ravi"));
        System.out.println(ek1.hashCode()+"---hm1.put(ek1,\"RAVI\")--------> "+hm2.put(ek1,"RAVI"));
        System.out.println(ek2.hashCode()+"---hm1.put(ek2,\"kiran\")--------> "+hm2.put(ek2,"kiran"));
        System.out.println(ek3.hashCode()+"---hm1.put(ek3,\"Ram\")--------> "+hm2.put(ek3, "Ram"));
        System.out.println(ek4.hashCode()+"---hm1.put(ek4,\"Ravi\")--------> "+hm2.put(ek4, "Ravi"));
        
        for(EmpAsKeyComparable each:hm2.keySet())
        {
            System.out.println(each+"-------"+hm2.get(each));
        }
    }
    public static void populateEmpPojoAsKeyStringMap()
    {
        System.out.println("==========HashMap<EmpPojoAsKey,String>======== EmpPojoAsKey is has overridden  hashCode() & equals(-)");
        HashMap<EmpPojoAsKey,String> hm2=new HashMap<>();
        EmpPojoAsKey ek1=new EmpPojoAsKey(1,"Ravi",20000);
        EmpPojoAsKey ek2=new EmpPojoAsKey(2,"Kiran",40000);
        EmpPojoAsKey ek3=new EmpPojoAsKey(3,"Ram",20000);
        EmpPojoAsKey ek4=new EmpPojoAsKey(1,"Ravi",20000);
        System.out.println("EmpPojoAsKey ek1=new EmpPojoAsKey(1,\"Ravi\",20000);\r\n" + 
                "EmpPojoAsKey ek2=new EmpPojoAsKey(2,\"Kiran\",40000);\r\n" + 
                "EmpPojoAsKey ek3=new EmpPojoAsKey(3,\"Ram\",20000);\r\n" + 
                "EmpPojoAsKey ek4=new EmpPojoAsKey(1,\"Ravi\",20000);\n");
        
        System.out.println(ek1.hashCode()+"---hm1.put(ek1,\"Ravi\")--------> "+hm2.put(ek1,"Ravi"));
        System.out.println(ek1.hashCode()+"---hm1.put(ek1,\"RAVI\")--------> "+hm2.put(ek1,"RAVI"));
        System.out.println(ek2.hashCode()+"---hm1.put(ek2,\"kiran\")--------> "+hm2.put(ek2,"kiran"));
        System.out.println(ek3.hashCode()+"---hm1.put(ek3,\"Ram\")--------> "+hm2.put(ek3, "Ram"));
        System.out.println(ek4.hashCode()+"---hm1.put(ek4,\"Ravi\")--------> "+hm2.put(ek4, "Ravi"));
        
        for(EmpPojoAsKey each:hm2.keySet())
        {
            System.out.println(each+"-------"+hm2.get(each));
        }
    }

    public static void populateEmpPojoStringMap()
    {
        System.out.println("==========HashMap<EmpPojo,String>======== EmpPojo is not override  hashCode() & equals(-)");
        HashMap<EmpPojo,String> hm1=new HashMap<>();
        EmpPojo e1=new EmpPojo(1,"Ravi",20000);
        EmpPojo e2=new EmpPojo(2,"Kiran",40000);
        EmpPojo e3=new EmpPojo(3,"Ram",20000);
        EmpPojo e4=new EmpPojo(1,"Ravi",20000);
        System.out.println("EmpPojo e1=new EmpPojo(1,\"Ravi\",20000);\r\n" + 
                "EmpPojo e2=new EmpPojo(2,\"Kiran\",40000);\r\n" + 
                "EmpPojo e3=new EmpPojo(3,\"Ram\",20000);\r\n" + 
                "EmpPojo e4=new EmpPojo(1,\"Ravi\",20000);\n");
        
        System.out.println(e1.hashCode()+"---hm1.put(e1,\"Ravi\")--------> "+hm1.put(e1,"Ravi"));
        System.out.println(e1.hashCode()+"---hm1.put(e1,\"RAVI\")--------> "+hm1.put(e1,"RAVI"));
        System.out.println(e2.hashCode()+"---hm1.put(e2,\"kiran\")--------> "+hm1.put(e2,"kiran"));
        System.out.println(e3.hashCode()+"---hm1.put(e3,\"Ram\")--------> "+hm1.put(e3, "Ram"));
        System.out.println(e4.hashCode()+"---hm1.put(e4,\"Ravi\")--------> "+hm1.put(e4, "Ravi"));
        
        for(EmpPojo each:hm1.keySet())
        {
            System.out.println(each+"-------"+hm1.get(each));
        }
        System.out.println("Above, Two duplicate keys are there due to different hashcode. solution for the above problem is override hashCode() and equals(-) methods\n");
    }

    public static void populateIntStringHashMap()
    {
        System.out.println("==========HashMap<Integer,String>======== Wrappers have hashCode() & equals(-) implementation");
        HashMap<Integer,String> hm=new HashMap<>();
        hm.get(1);
        System.out.println("Put (key,value) in Map--------- put(-,-) returns the old value for given key.");
        System.out.println("hm.put(1, \"Ravi\"): "+hm.put(1, "Ravi"));
        System.out.println("hm.put(2,\"Kiran\"): "+hm.put(2,"Kiran"));
        System.out.println("hm.put(1,\"Ram\"): "+hm.put(1,"Ram"));
        System.out.println("hm.put(4,\"Goru\"): "+hm.put(4,"Goru"));
        System.out.println("Entire Map:"+hm);
    }
    
}
