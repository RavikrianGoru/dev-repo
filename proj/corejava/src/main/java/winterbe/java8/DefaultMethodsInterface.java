package winterbe.java8;

/*
 Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword. 
 This feature is also known as Extension Methods.
 

*/

interface InterfaceDefaultMethod
{
	public void sysOut();

	default public void  printOut()
	{
		System.out.println("Print out-Default method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main() method in InterfaceDefaultMethod");
	}
	public static void staticMethod()
	{
		System.out.println("staticMethod in InterfaceDefaultMethod");
	}
}

interface SubInterfaceWithDefaultMethod extends InterfaceDefaultMethod
{
	public static void main(String[] args)
	{
		System.out.println("This is main() method in SubInterfaceWithDefaultMethod");
	}
	public static void staticMethod()
	{
		System.out.println("staticMethod in InterfaceDefaultMethod");
	}

}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

public class DefaultMethodsInterface {

	public static void main(String[] args) {

		InterfaceDefaultMethod obj=new SubInterfaceWithDefaultMethod(){

			@Override
			public void sysOut() {
				System.out.println("sysOut- abstract/unimplemented method.");
			}
			
		};
		obj.sysOut();
		InterfaceDefaultMethod.staticMethod();
	}

}
