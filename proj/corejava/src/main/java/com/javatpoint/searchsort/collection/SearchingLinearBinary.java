package com.javatpoint.searchsort.collection;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingLinearBinary {

	public static void linearSearch(int searchItem, int[] intArray)
	{
		int index=-1;
		if(intArray!=null && intArray.length!=0)
		{
			for(int i=0;i<intArray.length;++i)
			{
				if(searchItem==intArray[i])
				{
					index=i;
					break;
				}
			}
				
		}
		if(index!=-1)
			System.out.println(searchItem +" found at "+index+" possition(strting form 0).");
		else
			System.out.println(searchItem +" is not found.");
	}
	
	
	public static void binarySearch(int searchItem,int[] intArray)
	{
		int index=-1;
		
		int low=0;
		int high=intArray.length;
		int mid;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(searchItem==intArray[mid])
			{
				index=mid;
				break;
			}else if(searchItem<intArray[mid])
			{
				high=mid-1;;
			}else
			{
				low=mid+1;
			}
		}
		if(index!=-1)
			System.out.println(searchItem +" found at "+index+" possition(strting form 0).");
		else
			System.out.println(searchItem +" is not found.");
	}
	
	public static void main(String[] args) {
		int intArray[]={1,4,76,89,4,3,55,56,7,3,5,247,734,783,552,45,56,2,45,5,3,5,6356,45654,676,6,7676,453,2,2,6568,88783,26266}; 
		int searchKey;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Linear or Sequential Search:(Enter number for searching):");
		searchKey=sc.nextInt();
		long startTime=System.currentTimeMillis();
		linearSearch(searchKey,intArray);
		long endTime=System.currentTimeMillis();
		System.out.println("Linear Time:"+(endTime-startTime));
		

		startTime=System.currentTimeMillis();
		Arrays.sort(intArray);
		for(int i=0;i<intArray.length;++i)
			System.out.print(intArray[i]+",");
		binarySearch(searchKey,intArray);
		endTime=System.currentTimeMillis();
		System.out.println("Linear Time:"+(endTime-startTime));
		
		
		
	}

}
