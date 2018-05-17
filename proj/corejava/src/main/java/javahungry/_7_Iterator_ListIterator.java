package javahungry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/*

Iterator:
1) forward direction only: hasNext(), next()....
2) It can iterates Set, List and map implemented Objects.
3) Iterator can not add the element during traversal but they can remove the element from the underlying collection during the iteration as they only consist of remove() method. There is no add(E e) and set(E e) method in Iterator. 
4) we can not get the current position during traversing.
ListIterator:
1) Both Directions, Forward and backward: hasNext(),next() hasPrevious(), previous().... previousIndex(), and nextIndex()
2) It can iterates List implemented Object.
3) ListIterator can modify the list  during iteration using add(E e) , remove() or set(E e).
4) we can get the current position during traversing.



Both are interfaces. and ListIterator extends Iterator
Both are belong to Collection Framework.
Both are used to iterate on collection of objects.
Both are added in jdk 1.2

*/
public class _7_Iterator_ListIterator {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println(hs);
		System.out.println("Iterator:---------------------");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println("ListIterator:-----------------");
		ListIterator lItr=al.listIterator();
		
		while(lItr.hasNext())
		{
			System.err.println(lItr.next());
			System.out.println("Next index:"+lItr.nextIndex());
		}
		
		while(lItr.hasPrevious())
		{
			System.out.println(lItr.previous());
			System.out.println("Previous Index:"+lItr.previousIndex());
		}
	}

}
