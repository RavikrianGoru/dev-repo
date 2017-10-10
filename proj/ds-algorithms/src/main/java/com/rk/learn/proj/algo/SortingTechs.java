package com.rk.learn.proj.algo;

import com.rk.learn.proj.algo.utils.SortingUtils;

public class SortingTechs {

	public static void main(String[] args) 
	{
		System.out.println("***SortingTechs***");
		System.out.println("------------------------\n\tInsertion Sort");
		int a[]= {10,4,3,2,4};
		System.out.print("Input Data:");
		SortingUtils.showArrayElements(a);
		System.out.print("Sorted Data:");
		SortingUtils.showArrayElements(SortingUtils.doInsertionSort(a));
		System.out.println("Time Complexity :");
		System.out.println("Space Complexity:");
		System.out.println("------------------------");
		
	}

}
