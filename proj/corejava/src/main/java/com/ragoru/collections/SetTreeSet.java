package com.ragoru.collections;

import java.awt.event.TextEvent;
import java.util.Comparator;
import java.util.TreeSet;


class DescComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (-1)*(o1-o2);
	}
}

class InsertionOrderComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return +1;
	}
	
}
class ReverseInsertionOrderComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -1;
	}
	
}
class ReverseAlphabeticComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		return (-1)*(o1.compareTo(o2));
	}
	
}
class StringBufferComparator implements Comparator<StringBuffer>
{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o1.toString().compareTo(o2.toString());
	}
	
}
class ReverseStringBufferComparator implements Comparator<StringBuffer>
{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return -o1.toString().compareTo(o2.toString());
	}
	
}

class HeterogeneousComaparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		if(s1.length()<s2.length()){
			return -1;
		}
		else if(s1.length()>s2.length()){
			return 1;
		}
		else{
			return s1.compareTo(s2);
		}
		
	}
	
}
public class SetTreeSet {

	public static void main(String[] args) {
		TreeSet<String > lhs=new TreeSet<String>();
		
		System.out.println("unique, sorted in assending order, Does not allows \'null\'.");
		System.out.println(lhs.add("Ravi"));
		lhs.add("Devi");
		lhs.add("Chinna");
		lhs.add("Lakshmi");
		lhs.add("Surya");
		System.out.println(lhs.add("Ravi"));
		lhs.add("Manju");
		lhs.add("Meena");
		lhs.add("Anu");
		System.out.println(lhs.add(""));
		System.out.println(lhs.add(""));
//		System.out.println(lhs.add(null));
//		System.out.println(lhs.add(null));
		lhs.add("Shabana");
		lhs.add("Rekha");
		System.out.println(lhs);

		System.out.println("-----------------------------------------");
		TreeSet<String > lhs1=new TreeSet<String>(new ReverseAlphabeticComparator());
		
		System.out.println("unique, sorted in assending order, Does not allows \'null\'.");
		System.out.println(lhs1.add("Ravi"));
		lhs1.add("Devi");
		lhs1.add("Chinna");
		lhs1.add("Lakshmi");
		lhs1.add("Surya");
		System.out.println(lhs1.add("Ravi"));
		lhs1.add("Manju");
		lhs1.add("Meena");
		lhs1.add("Anu");
		System.out.println(lhs1.add(""));
		System.out.println(lhs1.add(""));
//		System.out.println(lhs.add(null));
//		System.out.println(lhs.add(null));
		lhs1.add("Shabana");
		lhs1.add("Rekha");
		System.out.println(lhs1);
		
		System.out.println("-----------------------------------------");
		
		TreeSet ts1=new TreeSet();
		ts1.add("a");
		ts1.add("A");
		ts1.add("F");
		ts1.add("K");
		ts1.add("z");
		ts1.add("D");
		ts1.add("h");
		ts1.add("c");
		ts1.add("a");
		System.out.println(ts1);
		
		System.out.println("-----------------------------------------");
		
		TreeSet ts2=new TreeSet();
//		ts1.add(new StringBuffer("a"));
//		ts1.add(new StringBuffer("A"));
//		ts1.add(new StringBuffer("F"));
//		ts1.add(new StringBuffer("K"));
//		ts1.add(new StringBuffer("z"));
//		ts1.add(new StringBuffer("D"));
//		ts1.add(new StringBuffer("h"));
//		ts1.add(new StringBuffer("c"));
//		ts1.add(new StringBuffer("a"));
//		System.out.println(ts1);
		
		TreeSet<Integer> ts3=new TreeSet<Integer>();
		ts3.add(10);
		ts3.add(0);
		ts3.add(20);
		ts3.add(50);
		ts3.add(10);
		ts3.add(30);
		ts3.add(90);
		ts3.add(30);
		ts3.add(60);
		System.out.println(ts3);
		System.out.println("-----------------------------------------");
		
		
		TreeSet<Integer> ts4=new TreeSet<Integer>(new DescComparator() );
		ts4.add(10);
		ts4.add(0);
		ts4.add(20);
		ts4.add(50);
		ts4.add(10);
		ts4.add(30);
		ts4.add(90);
		ts4.add(30);
		ts4.add(60);
		System.out.println(ts4);
		System.out.println("-----------------------------------------");
		
		
		TreeSet<Integer> ts5=new TreeSet<Integer>(new InsertionOrderComparator() );
		ts5.add(10);
		ts5.add(0);
		ts5.add(20);
		ts5.add(50);
		ts5.add(10);
		ts5.add(30);
		ts5.add(90);
		ts5.add(30);
		ts5.add(60);
		System.out.println(ts5);
		
		
		System.out.println("-----------------------------------------");
		
		
		TreeSet<Integer> ts6=new TreeSet<Integer>(new ReverseInsertionOrderComparator() );
		ts6.add(10);
		ts6.add(0);
		ts6.add(20);
		ts6.add(50);
		ts6.add(10);
		ts6.add(30);
		ts6.add(90);
		ts6.add(30);
		ts6.add(60);
		System.out.println(ts6);
		
		System.out.println("-----------------------------------------");
		
		TreeSet<StringBuffer> ts7=new TreeSet<StringBuffer>(new StringBufferComparator());
		ts7.add(new StringBuffer("Ravi"));
		ts7.add(new StringBuffer("Kiran"));
		ts7.add(new StringBuffer("Devi"));
		ts7.add(new StringBuffer("Raj"));
		ts7.add(new StringBuffer("Rani"));
		ts7.add(new StringBuffer("Ravali"));
		ts7.add(new StringBuffer("Manju"));
		System.out.println(ts7);
		
		System.out.println("-----------------------------------------");
		
		TreeSet<StringBuffer> ts8=new TreeSet<StringBuffer>(new ReverseStringBufferComparator());
		ts8.add(new StringBuffer("Ravi"));
		ts8.add(new StringBuffer("Kiran"));
		ts8.add(new StringBuffer("Devi"));
		ts8.add(new StringBuffer("Raj"));
		ts8.add(new StringBuffer("Rani"));
		ts8.add(new StringBuffer("Ravali"));
		ts8.add(new StringBuffer("Manju"));
		System.out.println(ts8);
	
		
		System.out.println("-----------------------------------------");
		
		TreeSet ts9=new TreeSet(new HeterogeneousComaparator());
		ts9.add(new StringBuffer("Ravi"));
		ts9.add(new StringBuffer("Kiran"));
		ts9.add("Devi");
		ts9.add(new StringBuffer("Raj"));
		ts9.add("Rani");
		ts9.add(new StringBuffer("li"));
		ts9.add(new StringBuffer("M"));
		System.out.println(ts9);
		
		System.out.println("-----------------------------------------");
		
		
		Student s111=new Student();
		s111.getAge();
	}

}
