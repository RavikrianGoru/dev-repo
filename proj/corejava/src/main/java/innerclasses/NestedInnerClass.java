package innerclasses;

public class NestedInnerClass {
	static int sa=20;
	private int a=100;
	public static void sMethod()
	{
		System.out.println("static method()");
	}
	class InnerClass
	{
		void method()
		{
			System.out.println("Inner method(): outer private variable:"+a);
			System.out.println("Inner method(): outer private variable:"+sa);
			sMethod();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("any class defined inside a class is called local inner class");
		NestedInnerClass obj=new NestedInnerClass();
		
		System.out.println("Way to create obj of inner class:-------- InnerClass inClass=obj.new InnerClass();");
		InnerClass inClass=obj.new InnerClass();
		inClass.method();
		System.out.println("Way to create obj of inner class:-------- InnerClass inClass1 =new MemberInnerClass().new InnerClass();");
		InnerClass inClass1 =new NestedInnerClass().new InnerClass();
		inClass1.method();
	}

}
