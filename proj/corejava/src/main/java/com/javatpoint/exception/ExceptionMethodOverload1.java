package com.javatpoint.exception;

import java.io.FileNotFoundException;

class SuperClass
{
	void method1() throws ArithmeticException
	{
		//System.out.println(10/0);
	}
	void method2()
	{
		System.out.println("dummy");
	}
	void method3()
	{
		System.out.println(10/0);
	}
}

public class ExceptionMethodOverload1 extends SuperClass{
//	void method1() throws Exception
//	{
//		System.out.println(10/0);
//	}
	
//	void method2() throws FileNotFoundException
//	{
//		System.out.println(10/0);
//	}

//	void method2() throws Exception
//	{
//		System.out.println("dummy");
//	}

	void method3() throws ArithmeticException
	{
		System.out.println(10/0);
		
	}

	public static void main(String[] args) throws Exception{
		
		System.out.println("Exception overloading Demo-----------------------");
		
		System.out.println("if method() is overrided in sub class. it can throw Unchecked Exception(ArithmeticException)");
		System.out.println("if method() is overrided in sub class. it can not throw checked Exception(FileNotFoundException)\n");
		
		System.out.println("if method() throws AnyException is overrided in sub class. it can throw SameException or LowerLevelException of declared Exception in super class.)");
		System.out.println("if method() throws AnyException is overrided in sub class. it can not throw HigherLevelException of declared Exception in super class.)");
		
		ExceptionMethodOverload1 obj=new ExceptionMethodOverload1();
		obj.method1();
		obj.method2();
		obj.method3();

	}

}
