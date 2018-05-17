package com.singleton;
class Singleton
{
	
	private static final Singleton singleton=new Singleton();
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstansce()
	{
		return singleton;
	}
	
	protected void dispMethod()
	{
		System.out.println("This is dispMathod()");
	}
}




public class SingletoneClassTest {

	public static void main(String[] args) {

		Singleton singleton=Singleton.getInstansce();
		System.out.println("hash code:"+singleton.hashCode());
		System.out.println(singleton.toString());
		singleton.dispMethod();
		
		Singleton singleton1=Singleton.getInstansce();
		System.out.println("hash code1:"+singleton.hashCode());
		System.out.println(singleton.toString());
		singleton.dispMethod();
		
		
	}

}
