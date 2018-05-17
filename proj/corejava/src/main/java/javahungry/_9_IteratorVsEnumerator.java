package javahungry;
/*

Iterator:
1) Iterator is interface, available in java.util package.
	hasNext()
	next()
	remove()----- allows removing element while traversing
2) applicable to Set, Map, List.


Enumerator:
1) Enumerator is interface, available in java.util package.
	hasmoreElements()
	nextElement()
	-----no remove()---- so, can not delete element while traversing
	
2) applicable to Vector and Hashtable.


Why not use for(int i=0; i< v.size();i++){}?

For loops are expensive to the processor when the collection reaches large sizes,
as many operations are done just to compute the first line:

int i = 0 is an assignment and creation (2 operations)
i get size, check value of i, and compare (3 operations)
i++ gets i then adds 1 to it [++i is only 2 operations] this one (3 operations)
*7/8 operations in total, each time the loop runs through

where an enumeration or iterator uses a while(){}
while(v.hasNext()) has next true or false (1 operation)
while(v.hasMoreElements()) has more true or false (1 operation)
Only one operation per repeat of this loop

*/

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class _9_IteratorVsEnumerator {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.add("Ravi");
		v.add("Devi");
		v.add("Chinna");
		v.add("Surya");
		v.add("Laskhmi");
		
		Enumeration<String> em=v.elements();
		System.out.println("Enumerating............");
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		
		Iterator<String>itr=v.iterator();
		System.out.println("Iterating..............");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
