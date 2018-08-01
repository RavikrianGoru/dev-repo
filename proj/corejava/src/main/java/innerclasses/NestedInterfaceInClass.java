package innerclasses;

abstract class OuterClass
{
	abstract void outerAbsMethod();
	interface InnerInterface{
		void innerInterfaceMethod();
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
