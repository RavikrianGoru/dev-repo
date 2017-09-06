package com.rk.learn.proj.algo.utils;

public class SortingUtils {

	public static void showArrayElements(int[] inputArray)
	{
		if(inputArray==null)
		{
			System.out.print("\n"+inputArray);
			return;
		}
		System.out.print("[");
		if(inputArray.length!=0)
		{
			for(int i=0;i<inputArray.length;i++)
			{
				if(i==inputArray.length-1)
				{
					System.out.print(inputArray[i]);
				}
				else
				{
					System.out.print(inputArray[i]+",");	
				}
			}
		}
		System.out.print("]\n");
	}
	public static int[] doInsertionSort(int[] inputArray)
	{
		if(inputArray!=null && inputArray.length!=0 && inputArray.length!=1)
		{
			int j,key;
			for(int i=1;i<inputArray.length;i++)
			{
				j=i-1;
				key=inputArray[i];
				while(j>=0 && inputArray[j]>key)
				{
					inputArray[j+1]=inputArray[j];
					j--;
				}
				inputArray[j+1]=key;
			}
		}
		return inputArray;
	}
}
