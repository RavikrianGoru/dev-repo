package innerclasses;

import innerclasses.AbstractOuterClass.InnerClassAbs;

class OuterClass
{
	void outerAbsMethod()
	{
		
	}
	
	interface InnerInterface{
		void innerInterfaceMethod();
	}
}

abstract class AbstractOuterClass
{
	abstract void outerAbsMethod();
	interface InnerInterface{
		void innerInterfaceMethod();
	}
	class InnerClassAbs
	{
		void m1()
		{
			System.out.println("hi");
		}
	}
}

public class NestedInterfaceInClass implements OuterClass.InnerInterface{

	
	@Override
	public void innerInterfaceMethod() {
		System.out.println("implementation of innerInterfaceMethod()");
	}

	public static void main(String[] args) {
		System.out.println("Defining an interface inside a class.");
		NestedInterfaceInClass obj=new NestedInterfaceInClass();
		obj.innerInterfaceMethod();
		
	}

}
