package com.singleton;

class SingletonClass
{
	private static SingletonClass single=null;
	
	private SingletonClass()
	{
	}
	
	//Lazzy Singleton design pattern or clasic singleton
	public static SingletonClass  getInstance()
	{
		if(single==null){
			single=new SingletonClass();
		}
		return single;
	}
	
	protected void dispMethod()
	{
		System.out.println("dispMethod()");
	}
	
}


public class ClassicOrLazzySingletonDisignPattern {

	public static void main(String args[])
	{
		SingletonClass single=SingletonClass.getInstance();
		single.dispMethod();
	}
}
