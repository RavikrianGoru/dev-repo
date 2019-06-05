package innerclasses;

interface OuterIterface
{
	void outerMethod();
	interface InnerInterface
	{
		void innerMethod();
	}
	class innerClassInter
	{
		public static void main(String... args)
		{
			System.out.println("Hi");
		}
	}
}


public class NestedInterfaceInInterface implements OuterIterface.InnerInterface{

	public void innerMethod()
	{
		System.out.println("Implementation if innerMethd()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Defining an interface inside an interface");
		NestedInterfaceInInterface obj=new NestedInterfaceInInterface();
		obj.innerMethod();
	}

}
