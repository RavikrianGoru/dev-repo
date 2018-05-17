package com.ragoru.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListArrayList {

	public static void main(String[] args) {

		ArrayList< String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Kiran");
		al.add(null);
		al.add("Ravi");
		al.add(null);
		al.add(null);
		al.add("");
		al.add("Manju");
		
		System.out.println(al);

		
		ArrayList< String> al1=new ArrayList<String>();
		al1.add("Ravi");
		al1.add("Kiran");
		al1.add(null);
		al1.add("Goru");
		al1.add("Ravi");
		al1.add(null);
		al1.add("Ravali");
		al1.add(null);
		al1.add("");
		al1.add("Manju");
		al1.add("Devi");
		al1.add("Chinna");
		
		System.out.println(al1);
		
		ArrayList<Integer> al3=new ArrayList<Integer>(Collections.nCopies(10, 0));
		System.out.println(al3);
		
		System.out.println("for looP:");
		for(Integer i=0;i<al3.size();i++)
			System.out.println(al3.get(i));
		System.out.println("forEach:");
		for(Integer i:al3)
			System.out.println(i);
		
		
		
		
		System.out.println("retainAllal:"+al.retainAll(al1));
		System.out.println(al);
		
		Student s111=new Student();
		s111.getAge();
		
/*		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------------Iterator---------------------------");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------ListIterator---------------------------");
		ListIterator listItr=al.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
*/
	}

}
