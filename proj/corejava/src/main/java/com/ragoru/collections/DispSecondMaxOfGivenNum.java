package com.ragoru.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class DispSecondMaxOfGivenNum {

	public static void main(String[] args) {

		int intAry[]={101,334,324,4,211,5454,6565,500,4233,345,656,767,34,654,677344,656,3542,6726,2234,23234,123,451,345,56,344};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i:intAry)
		{
			ts.add(i);
		}
		System.out.println("All numbers: "+ts);
		System.out.println("headSet of 500 (<500): "+ts.headSet(500));
		System.out.println("secod Max of 500: "+ts.headSet(500).last());
		System.out.println("tailSet of 500 (>=500): "+ts.tailSet(500));
		Student s111=new Student();
		s111.getAge();

	}

}
