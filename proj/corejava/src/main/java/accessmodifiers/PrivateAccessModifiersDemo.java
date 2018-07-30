package accessmodifiers;

class A
{
	private  A()
	{
	}
	private int a=10;
	private void method1()
	{
		System.out.println("private method");
	}
	public static  A getInstance()
	{
		return new A();
	}
	
}

public class PrivateAccessModifiersDemo{

	public static void main(String[] args) {
		System.out.println("Access modifiers specifies scop of variables, methods, constructors and classes");
		System.out.println("A class cannot be private or protected except nested class.");
		System.out.println(A.getInstance().toString());
	}
}
