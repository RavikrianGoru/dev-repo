package com.javatpoint.string;

import java.util.Arrays;
import java.util.List;

public class JoinMethodDemo {

	public static void main(String[] args) {

		System.out.println(String.join("-", "Hi","Hey","Ravi","Kiran","Goru"));
		String [] sArray={"ravi","kiran","goru","ram","raj","anil"};
		System.out.println(String.join(",", sArray));
		List<String> list=(List) Arrays.asList(sArray);
		System.out.println(list);
		System.out.println(String.join("--", list));
	}
	

}
