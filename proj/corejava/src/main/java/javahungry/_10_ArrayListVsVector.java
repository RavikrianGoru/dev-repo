package javahungry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/*


Vector, ArrayList classes are implemented using dynamically re-sizable array providing fast random access
and fast list traversal very much like using an ordinary array.

ArrayList:-----default size 10---Collection 
1) Not synchronized.
2) faster than Vector
3) ArralyList increases 50% of size while resizing its array.
4) ArrayList does not define the increment size.
5) AraayList uses Iterator and ListIterator for traversing.

Vector: -------default size 10 ---Legacy Data structure.
1) Synchronized
2) slower due to synchronization
3) Vector by default doubles the size of its array.
4) public synchronized void setSize(int i) ------ defined the increment size.
5) Vector and Hashtable uses both Enumerator and Iterator.
*/

public class _10_ArrayListVsVector {

	public static void main(String[] args) {
//	    Vector<E> = null;
		ArrayList<String > al=new ArrayList<>();
		al.add(new String("Ravi"));
		al.add("Ravi");
		al.add(null);
		al.add(null);
		al.add("kiran");
		System.out.println(al);

		System.out.println("for each on Collection--->for(String a: al)");
		for(String a: al)
		{
			System.out.println(a);
		}
		
		Iterator itr1=al.iterator();
		System.out.println("while--->itr.hasNext() and itr.next()");
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		Iterator itr2=al.iterator();
		System.out.println("Iterator:----->forEachRemaining((s)->{System.out.println(s);})");
		itr2.forEachRemaining((s)->{System.out.println(s);});
		
		al.forEach((s)->System.out.println(s));

	}

}
