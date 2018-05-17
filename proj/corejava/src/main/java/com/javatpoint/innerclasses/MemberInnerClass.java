package com.javatpoint.innerclasses;

public class MemberInnerClass {

	private int a=100;
	class InnerClass
	{
		void method()
		{
			System.out.println("Inner method(): outer private variable:"+a);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("any class defined inside a class is called local inner class");
		MemberInnerClass obj=new MemberInnerClass();
		
		System.out.println("Way to create obj of inner class:-------- InnerClass inClass=obj.new InnerClass();");
		InnerClass inClass=obj.new InnerClass();
		inClass.method();
		System.out.println("Way to create obj of inner class:-------- InnerClass inClass1 =new MemberInnerClass().new InnerClass();");
		InnerClass inClass1 =new MemberInnerClass().new InnerClass();
		inClass1.method();
	}

}
