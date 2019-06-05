package innerclasses;

public class StaticInnerClass {

	int a=100;
	static int b=200;
	
	static void methodStaticOuter()
	{
		System.out.println("methodStaticOuter(): Outer class");
	}
	void methodOuter()
	{
		System.out.println("methodOuter: Outer class");
	}
	class InnerClass
	{
		static final int statiFinalInt=9;
		//static int staticVariable=8;//compile time Error
	}
	static class Inner{
		static int aa=10;
		int bb=20;
		static void methosStatic()
		{
			System.out.println("methosStatic(): Inner class");
			methodStaticOuter();
			//methodOuter();// C.T Error can not access instance method from static context.
			System.out.println("Outer static variables: "+b);
			System.out.println("Inner static variables:"+aa);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Defining a static class inside a class:--------Inner obj=new StaticInnerClass.Inner();");
		Inner obj=new StaticInnerClass.Inner();
		obj.methosStatic();
		System.out.println("Defining a static class inside a class:--------StaticInnerClass.Inner.methosStatic();---- no need to create obj for static inner class");
		StaticInnerClass.Inner.methosStatic();//No need to create Inner class Object
	}

}
