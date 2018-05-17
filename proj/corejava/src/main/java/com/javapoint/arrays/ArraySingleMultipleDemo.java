package com.javapoint.arrays;


public class ArraySingleMultipleDemo {

	
	public static void min(int[] ary)
	{
		int min=ary[0];
		for(int i=1;i<ary.length;++i)
			if(min>ary[i])
				min=ary[i];
		System.out.println("min:"+min);
		
	}
	public static void main(String[] args) {
		
		int intArray[]={100,30,4,210,5};
		System.out.println("All array elements.....");
		for(int x: intArray)
			System.out.println(x);

		System.out.println("-----");
		int intArray1[] =new int[5];
		for(int i=0;i<5;++i)
		{
			intArray1[i]=i+20;
		}
		for(int x:intArray1)
			System.out.println(x);
		
		min(intArray);
		
		Class c=intArray.getClass();
		System.out.println("Array class Name:"+c.getName());
		
		int ar[]=new int[3];
		
		System.arraycopy(intArray, 1, ar, 0, 3);
		
		for(int x:ar)
			System.out.println(x);
	}

}
