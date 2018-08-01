package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Vector;

public class EnumarationIteratorListIterator {

	public static void main(String[] args) {

		//Stack<String> v=new Stack<String>();
		Vector<String> v=new Vector<String>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("E");
		v.addElement("F");
		v.addElement("G");
		System.out.println("Vector: "+v);

		Enumeration<String> en=v.elements();
		System.out.println("Enumaration is applicable for legacy collections(Vector, Stack.....etc) :(fwd directions) can not remove or add or replace. only read operation");
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

		Student s111=new Student();
		s111.getAge();
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		al.add("FF");
		al.add("GG");
		System.out.println("ArrayList elements: "+al);		
		
		Iterator<String> itr=al.iterator();
		System.out.println("Iterator is applicable for all collections :(fwd directions) can not add or replace. only read and remove operations");
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(temp.equalsIgnoreCase("DD"))
				itr.remove();
		}
 		System.out.println(al);
		
 		ArrayList<String> al1=new ArrayList<String>();
 		al1.add("AAA");
 		al1.add("BBB");
 		al1.add("CCC");
 		al1.add("DDD");
 		al1.add("EEE");
 		al1.add("FFF");
 		al1.add("GGG");
 		al1.add("HHH");
 		al1.add("III");
 		al1.add("JJJ");
 		al1.add("KKK");
 		
 		System.out.println("ArrayList elements: "+al1);
 		
 		ListIterator<String> listItr=al1.listIterator();
 		System.out.println("ListIterator is applicable for only List implemented classes :(fwd and bkwd directions) all read,remove, add and set operations");
 		while(listItr.hasNext())
 		{
 			String temp=listItr.next();
 			if(temp.equalsIgnoreCase("CCC"))
 			{
 				listItr.remove();
 			}
 			if(temp.equals("FFF"))
 			{
 				listItr.set("fff");
 			}
 			if(temp.equals("III"))
 			{
 				listItr.add("iii");
 			}
 			System.out.println(temp);
 		}
 		System.out.println(al1);
 		while(listItr.hasPrevious())
 		{
 			System.out.println(listItr.previous());
 		}
 		
 		
 		System.out.println("Enumaration, Iterator, ListIterator:-------from Vector");
 		System.out.println(v.elements().getClass().getName());
 		System.out.println(v.iterator().getClass().getName());
 		System.out.println(v.listIterator().getClass().getName());
 		
 		
	}

}
