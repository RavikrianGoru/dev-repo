package jse8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterForEachOnList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("ravi");
		list.add("raj");
		list.add("ram");
		list.add("ravali");
		list.add("Devi");
		list.add("chinna");
		list.add("meena");
		list.add("surya");
		list.add("lakshmi");
		list.add("roja");
		list.add("kavitha");
		System.out.println("Geting all elements start with \"r\" from List---- by calling -----list.stream().filter((s)->s.startsWith(\"r\")).forEach((s)->System.out.println(s));");
		list.stream().filter((s)->s.startsWith("r")).forEach((s)->System.out.println(s));

		System.out.println("Geting all elements start with \"r\" from List---- by calling -----list.forEach((s)->{if(s.startsWith(\"r\")) System.out.println(s);});");
		list.forEach((s)->{if(s.startsWith("r")) System.out.println(s);});
		
		System.out.println(list);
		System.out.println("stream.forEach()----------------");
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		
		System.out.println("--------------------");
		list.stream().filter((s)->s.startsWith("r")).forEach(System.out::println);; 

	}

}
