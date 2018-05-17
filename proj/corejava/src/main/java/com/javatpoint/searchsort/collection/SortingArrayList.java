package com.javatpoint.searchsort.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {


		public static void main(String[] args) {

			ArrayList<String> strList=new ArrayList<String>();
			strList.add("Ravi");
			strList.add("Anitha");
			strList.add("Devi");
			strList.add("Chinna");
			strList.add("Laskhmi");
			strList.add("Surya");
			strList.add("Ravali");
			strList.add("Manju");
			strList.add("Sai");
			System.out.println("Insertion order:"+strList);
			Collections.shuffle(strList);
			System.out.println("Shuffle order:"+strList);
			Collections.sort(strList);
			System.out.println("Sorted order:"+strList);
			
			ArrayList<Integer> intlist=new ArrayList<Integer>();
			intlist.add(123);
			intlist.add(13);
			intlist.add(59);
			intlist.add(3);
			intlist.add(51);
			intlist.add(43);
			intlist.add(523);
			System.out.println("Insertion order:"+intlist);
			Collections.sort(intlist);
			System.out.println("Shuffle order:"+intlist);
			Collections.sort(intlist,Collections.reverseOrder());
			System.out.println("Sorted order:"+intlist);
			
			
	}

}
