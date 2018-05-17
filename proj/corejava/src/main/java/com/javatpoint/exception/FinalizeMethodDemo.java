package com.javatpoint.exception;

public class FinalizeMethodDemo 
{
	@Override
	public void finalize()
	{
		System.out.println("finalized() is exectuted.");
	}

	public void testMethod()
	{
		System.out.println("testMethod()");
	}
	
	public static void main(String[] args) 
	{
		FinalizeMethodDemo obj1=new FinalizeMethodDemo();
		FinalizeMethodDemo obj2=new FinalizeMethodDemo();
		obj1.testMethod();
		obj2.testMethod();
		obj1=null;
		obj2=null;
	
		System.out.println("Create any class which overrides finalize() method from Object class.");
		System.out.println("create n-number of objects for above mentioned class, if any of these objects are not having reference.");
		System.out.println("if we call System.gc()  or Runtime.getRuntime.gc()...... Garbage collector will get executed and it internally calls finilize() method before destroying that obj.");
		
		System.gc();
		Runtime.getRuntime().gc();
	}

}
