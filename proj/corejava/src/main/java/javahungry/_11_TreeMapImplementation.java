package javahungry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
TreeMap: it is like HashMap, store data in the form of (Key,Value) pair and Keys are in sorted form(ascending).
TreeMap is sorted according to natural ordering of its keys or by a Comparator provided at map creation time, depending on which constructor is used.
This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations.


How TreeMap works in Java?
TreeMap is a Red-Black tree based NavigableMap implementation.In other words , it sorts the TreeMap object keys using Red-Black tree algorithm.

Red Black tree has the following properties :http://www.csanimated.com/animation.php?t=Red-black_tree
1. As the name of the algorithm suggests ,color of every node in the tree is either red or black.
2. Root node must be Black in color.
3. Red node can not have a red color neighbor node.
4. All paths from root node to the null should consist the same number of black nodes 


Why and when we use TreeMap ?
We need TreeMap  to get the sorted list of keys in ascending order.

What is the runtime performance of the get() method in TreeMap and HashMap  ,where n represents the number of elements ?
TreeMap implementation provides guaranteed log(n) time cost for the containsKey,get,put and remove operations.
HashMap implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets.


What is "natural ordering" in TreeMap ?
"Natural" ordering is the ordering implied by the implementation of the Comparable interface by the objects used as keys in the TreeMap. 
Essentially, RBTree must be able to tell which key is smaller than the other key, and there are two ways to supply that logic to the RBTree implementation:
1.Implement Comparable interface in the class(es) used as keys to TreeMap, or
2.Supply an implementation of the Comparator that would do comparing outside the key class itself.


Why do we need TreeMap when we have sortedMap ?
sortedMap is a interface and TreeMap is the class implementing it .As we know one can not create objects of the interface . 
Interface tells us which methods a sortedMap implementation should provide .TreeMap is such an implementation.

Which data structure you will prefer in your code : HashMap or TreeMap ?
HashMap is faster while  TreeMap is sorted .Thus we choose them according to their advantage.
If you do not want to sort the elements but just to insert and retrieve the elements then use HashMap .
But if you want to maintain the  order of the elements then TreeMap should be preferred because the result is alphabetically sorted .While iterating HashMap there is no ordering of the elements ,
on the other hand , TreeMap iterates in the natural key order.

What happens if the TreeMap is concurrently modified while iterating the elements ? 
The iterator fails fast and quickly if structurally modified at any time after the iterator is created (in any way except through the iterator's own remove method ). 



Fail Fast Vs Fail Safe
---------------------
if we try to modify the structure of collection while iterating collection it throws ConcurrentModificationException.

Single Threaded Environment:
After the creation of the iterator , structure is modified at any time by any method other than iterator's own remove method.
Multiple Threaded Environment:
If one thread is modifying the structure of the collection while other thread is iterating over it . 

How  Fail  Fast Iterator  come to know that the internal structure is modified ?

Iterator read internal data structure (object array) directly . The internal data structure(i.e object array) should not be modified while iterating through the collection.
To ensure this it maintains an internal  flag "mods" .Iterator checks the "mods" flag whenever it gets the next value (using hasNext() method and next() method). 
Value of mods flag changes whenever there is an structural modification. Thus indicating iterator to throw ConcurrentModificationException.


Fail Safe Iterator :
Fail Safe Iterator makes copy of the internal data structure (object array) and iterates over the copied data structure.Any structural modification done to the iterator affects the copied data structure.  
So , original data structure remains  structurally unchanged .Hence , no ConcurrentModificationException throws by the fail safe iterator.

Two  issues associated with Fail Safe Iterator are :
1. Overhead of maintaining the copied data structure i.e memory.
2. Fail safe iterator does not guarantee that the data being read is the data currently in the original data structure. 

Which copy technique (deep or shallow ) is used by the TreeMap clone() method ?
According to docjar , clone() method returns the shallow copy of the TreeMap instance . In shallow copy object B points to object A location in memory .
In other words , both object A and B are sharing the same elements .The keys and values  themselves are not cloned .



*/

class Emp2 {
	private int empId;
	private String empName;
	private double sal;

	public Emp2() {

	}

	public Emp2(int empId, String empName, double sal) {
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}

public class _11_TreeMapImplementation {

	public static void main(String[] args) {

		TreeMap<Emp2, String> tm1 = new TreeMap<Emp2, String>((e1, e2) -> {
			return e1.getEmpId() - e2.getEmpId();
		});
		tm1.put(new Emp2(105, "ravi", 30000), "Ravi");
		tm1.put(new Emp2(102, "devi", 60000), "Devi");
		tm1.put(new Emp2(104, "chinna", 40000), "Chinna");
		tm1.put(new Emp2(106, "raju", 50000), "Raju");
		tm1.put(new Emp2(108, "surya", 20000), "Surya");
		System.out.println(tm1);

		TreeMap<Emp2, String> tm2 = new TreeMap<Emp2, String>((e1, e2) -> {
			return e1.getEmpName().compareTo(e2.getEmpName());
		});
		tm2.put(new Emp2(105, "ravi", 30000), "Ravi");
		tm2.put(new Emp2(102, "devi", 60000), "Devi");
		tm2.put(new Emp2(104, "chinna", 40000), "Chinna");
		tm2.put(new Emp2(106, "raju", 50000), "Raju");
		tm2.put(new Emp2(108, "surya", 20000), "Surya");
		System.out.println(tm2);

		TreeMap<Integer, Integer> t1 = new TreeMap<>((o1,o2)->{return o2.compareTo(o1);});
		t1.put(1, 2);
		t1.put(100, 101);
		t1.put(50, 51);
		t1.put(100, 101);
		
		System.out.println("Different ways to iterate data from Map");
		System.out.println("--------sort by key----new TreeMap<>((o1,o2)->{return o2.compareTo(o1);});-----------");
		System.out.println(t1.entrySet());
		System.out.println(t1.keySet());
		System.out.println(t1.values());
		System.out.println("-------------------");
		t1.entrySet().forEach((s)->{System.out.println(s.getKey()+"-----"+s.getValue());});
		System.out.println("-------------------");
		t1.keySet().forEach((s)->{System.out.println(s);});
		System.out.println("-------------------");
		t1.values().forEach((s)->{System.out.println(s);});
		

		
		System.out.println("---------sort by value----------");
		ArrayList<Map.Entry<Integer,Integer>> l1=new ArrayList<>(t1.entrySet());
		Collections.sort(l1,(s1,s2)->{return s2.getValue().compareTo(s1.getValue());});
		System.out.println(l1);

	}
}
