
public abstract class AbstractDemo {

	public AbstractDemo()
	{
		System.out.println("AbstractDemo()---constructor");
	}
	abstract void method1();
	void method2()
	{
		System.out.println("This is normal variables");
	}
	static void method3()
	{
		System.out.println("Static method in abstarct class");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is anabstract class and having main() method and constructor.");
		method3();
	}

}
