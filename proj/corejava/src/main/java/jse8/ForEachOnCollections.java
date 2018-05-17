package jse8;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachOnCollections {

	public static void main(String[] args) {
		System.out.println("java8----->default void forEach(Consumer<? super T> action)------> added in Iterable interface");
		System.out.println("so,we can call forEach(-) method on any collection class for iterating.");
		
		List list1=new ArrayList();
		list1.add("Ravi");
		list1.add("Kiran");
		list1.add("Goru");
		list1.add("123");
		list1.add(1234);
		System.out.println("-----forEach(-) on List---------------list1.forEach((s)->{System.out.println(s);});");
		list1.forEach((s)->{System.out.println(s);});
		System.out.println("---------------------------------------------");
		
		Set set1=new HashSet();
		set1.add("Ravi");
		set1.add("Kiran");
		set1.add("Goru");
		set1.add("Ravi");
		set1.add("123");
		set1.add(123);
		set1.add(234);
		System.out.println("-----forEach(-) on Set----------------set1.forEach((s)->{System.out.println(s);});");
		set1.forEach((s)->{System.out.println(s);});
		System.out.println("---------------------------------------------");
		
		
		

		Hashtable<Integer,Object> ht=new Hashtable<>();
		ht.put(1, "rAvI");
		ht.put(1, "RAVI");
		ht.put(2, "KIRAN");
		ht.put(3, "");
		
		ht.forEach((k,v)->{});
		
		System.out.println("Get all keys of Hashtable-------by calling Enumeration<Object> en=ht.elements();-----hasMoreElemenets()-----nextElement()");
		Enumeration<Object> en=ht.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("Get all keys of Hashtable-------by calling------ht.keySet().forEach((s)->System.out.println(ht.get(s)));");
		ht.keySet().forEach((s)->System.out.println(ht.get(s)));

		System.out.println("Get all keys of Hashtable-------by calling-------ht.keySet().stream().map((s)->ht.get(s)).collect(Collectors.toCollection(()->valueList));");
		List valueList=new ArrayList();
		ht.keySet().stream().map((s)->ht.get(s)).collect(Collectors.toCollection(()->valueList));
		System.out.println(valueList);
		System.err.println("\n---------null key or null value are not allowed in Hashtable---------\nht.put(4, null);\nht.put(null, \"RAVI\");\nht.put(null, null);");
		
		
		
	}
}
