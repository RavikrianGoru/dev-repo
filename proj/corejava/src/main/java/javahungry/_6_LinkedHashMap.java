package javahungry;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
LinkedHashMap: It is a HashMap with LinkedList implementation with predictable iteration order.

*) Why do we need LinkedHashMap when we already had TreeMap and HashMap ?

HashMap elements are not ordered. is not synchronized(not Thread Safe).
took constant time for basic operations.O(1)

TreeMap elements are sorted naturally. is not synchronized(not Thread Safe).
took O(log n) time for basic operations.

LinkedHashMap is preserves insertion order. removes the cost associated with TreeMap.
Time complexity of the add, remove and contains operations is constant time i.e O(1) .
LinkedHashMap iterator behaves like fail-fast iterator. As expected it will  throw ConcurrentModificationException.


HashMap maintains a simple linked list while running through all of its entries.

*) How LinkedHashMap insertion order is maintained ?
The order is maintained based on the keys were inserted into the map .

*) What happens if we insert a key which is already present in the LinkedHashMap ? Does the order change ?
Insertion order of the LinkedHashMap does not get affected if a key is re-inserted into the LinkedHashMap object.
It first checks containsKey() method  before invoking put() method . 
If containsKey(K) returns true then the key is not added to the LinkedHashMap.




*/public class _6_LinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap <Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "ravi");
		lhm.put(4, "ravi");
		
		lhm.put(null, "ravi");
		
		lhm.put(2,"kiran");
		Iterator itr=lhm.keySet().iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
//			lhm.put(3,"Goru");//java.util.ConcurrentModificationException
		}
		
		System.out.println(lhm);
		System.out.println("Making LinkedHashMap synchronized by Collections.synchronizedMap(-):");
		System.out.println(Collections.synchronizedMap(lhm));
		
		
	}

}
