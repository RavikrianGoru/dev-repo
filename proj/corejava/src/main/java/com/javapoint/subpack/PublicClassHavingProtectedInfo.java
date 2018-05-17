package com.javapoint.subpack;

public class PublicClassHavingProtectedInfo 
{

	public int pubInt=10;
		   int defInt=20;
	protected int protInt=30;
	private int priInt=40;
	public void pubM()
	{
		System.out.println("public method");
	}
	void defM()
	{
		System.out.println("default method");
	}
	
	protected void protM()
	{
		System.out.println("protected method");
	}
	
	private void priM()
	{
		System.out.println("private method");
	}
	
}
