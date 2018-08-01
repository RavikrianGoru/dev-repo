package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListLinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Ravi");
		linkedList.add("Kiran");
		linkedList.add("Goru");
		linkedList.add("Devi");
		linkedList.add("Lakshmi");
		linkedList.add("Chinna");
		linkedList.add("Surya");
		linkedList.add("Meena");
		linkedList.add("Shabana");
		linkedList.add("Jhansi");
		linkedList.add("Anitha");
		linkedList.add("Manju");
		linkedList.add("Ravali");
		linkedList.add("Nimisha");
		linkedList.add("Durga");
		linkedList.add("Lalitha");

		
		Student s111=new Student();
		s111.getAge();
		System.out.println(linkedList);
		
//		System.out.println("ForEach:-----------------------");
//		for(String s:linkedList)
//			System.out.println(s);
//
//		System.out.println("Iterator:-----------------------");
//		Iterator itr=linkedList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//	
//		System.out.println("ListIterator:-----------------------");
//		ListIterator listItr=linkedList.listIterator();
//		while(listItr.hasNext())
//			System.out.println(listItr.next());
	
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
	}

}
