package basics;

class A
{
	int a=100;
	int b=200;
	public void m1()
	{
		System.out.println("A:(m1)"+a+" "+b);
	}
	public void m2()
	{
		System.out.println("A:m2()");
	}
	public static void mm()
	{
		System.out.println("A:static:mm()");
	}
}

class B extends A
{
	int a=1000;
	int c=3000;
	public void m1()
	{
		System.out.println("B:(m1)"+a+" "+b);
	}
	
	public void m3()
	{
		System.out.println("B:m3()");
	}
	public static void mm()
	{
		System.out.println("B:static:mm()");
	}
}


public class RuntimePolymorphism {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		A obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c); C.T Error
		obj.m1();
		obj.m2();
		obj.mm();
		//obj.m3(); C.T Error
		System.out.println("----------------------------");
	}

}
