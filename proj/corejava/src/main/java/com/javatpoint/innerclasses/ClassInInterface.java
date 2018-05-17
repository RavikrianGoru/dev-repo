package com.javatpoint.innerclasses;

interface OuterInterface
{
	void interfaceMethod();
	class InnerClass{
		void innerMethod()
		{
			System.out.println("innerMethod() in InnerClass which is in OuterInterface");
		}
	}
	
}
public class ClassInInterface extends OuterInterface.InnerClass{
	
	OuterInterface.InnerClass innerObj=new OuterInterface.InnerClass();
	
	public static void main(String[] args) {
		ClassInInterface obj=new ClassInInterface();
		obj.innerMethod();
		obj.innerObj.innerMethod();

	}
}
