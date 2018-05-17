package com.javatpoint.exception;
/*
	An Exception is thrown from the top of the stack and it is not caught ,
	it drops down the call stack to the previous method/caller method.
	it not caught there, the exception again drops down to the previous method and so on until they are caught
	or reach the very bottom of the call stack.
	This is called exception propagation.


*/
public class ExceptionPropagation {

	void m1()
	{
		try{
		n1();
		}catch(Exception e)
		{
			System.out.println("Exception propagation:"+e.getMessage());
		}
	}
	void n1()
	{
		o1();
		System.out.println("n1():");
	}
	void o1()
	{
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
	
		System.out.println("Exception Propagation: When method1() calls method2(), method2() calls method3().....");
		System.out.println("if any exception occures in method3() that exception is propagates in method2() then method1()");
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.m1();
	}

}
