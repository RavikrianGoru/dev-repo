package com.javatpoint.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Exception is an abnormal condition that disrupts the flow of executing program and throws a runtime exception object.");
		
		
		System.out.println("Starting of Program:");
		int a=10;
		System.out.println("a:"+a);
		int b=20;
		System.out.println("b:"+b);
		for(int i=1;i<=10;++i)
			System.out.println("i:"+i);
		System.out.println(a/10);
		
		System.out.println("Divisible by Zero------------");
		try{
		System.out.println(a/0);
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
			//System.exit(0);
		}
		finally{
			System.out.println("Finally block");
		}
		System.out.println(a+10);
		System.out.println(a*2);
	}

}
