package com.javatpoint;

public class VarArgsMethods {

	public static void sum(int x)
	{
		System.out.println("General Sum : "+x);
	}
	public static void sum(int... a)
	{
		int total=0;
		for(int i=0;i<a.length;++i)
			total+=a[i];
		System.out.println("Sum : "+total);
	}

	public static void total(int a)
	{
		System.out.println("General Total : "+a);
	}
	public static void total(int ...a)
	{
		int total=0;
		for(int i=0;i<a.length;++i)
			total+=a[i];
		System.out.println("Total : "+total);
	}
	
	public static void main(String[] args) {
		sum();
		sum(1);
		sum(1,2);
		sum(1,2,3);
		sum(1,2,3,4);
		sum(1,2,3,4,5);
		
		total();
		total(1);
		total(1,2);
		total(1,2,3);
		total(1,2,3,4);
		total(1,2,3,4,5);
		
		System.out.println("Valid var-arg method declarations:");
		System.out.println("method(int x, int... y)");
		System.out.println("method(int x, String... y)");
		System.out.println("method(int x, int... y)");
		System.out.println("method(int x, int... y)");
		
	}

}
