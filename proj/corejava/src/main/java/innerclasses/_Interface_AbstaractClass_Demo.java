package innerclasses;

abstract class Abs
{
	Abs()
	{
	}
	static void m1(){
		System.out.println("static methods");
	}
	public static void main(String args[])
	{
		System.out.println("main method in abstract class");
	}
}

interface In
{
	public static void main(String args[])
	{
		System.out.println("main method in interface");
	}
	default void m1()
	{
		System.out.println("default method m1()");
	}
	default void m2()
	{
		System.out.println("default method m1()");
	}
}

public class _Interface_AbstaractClass_Demo{

	public static void main(String[] args) {
		System.out.println("Interface -------------");
		System.out.println("100% abstraction, \nmutiple inheritance support, \npublic static final variables, \npublic unimplemented methods, \ninterface keyword \ndefault methods,\nstatic methods and main method");
		System.out.println("Abstract class -------------");
		System.out.println("Not 100% abstraction, \n No mutiple inheritance support, \ninplemented and unimplemented \nabstarct  keyword,\nNodefault methods, \nstatic methods and main method");
		
	}

}
