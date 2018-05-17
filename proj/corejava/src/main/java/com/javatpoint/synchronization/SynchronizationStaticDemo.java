package com.javatpoint.synchronization;


class MultiplicationClas
{
	//static method
	synchronized public static void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
}

class MulThread1 extends Thread
{
	public void run()
	{
		MultiplicationClas.printTable(5);
	}
}

class MulThread2 extends Thread
{
	public void run()
	{
		MultiplicationClas.printTable(10);
	}
}

class MulThread3 extends Thread
{
	public void run()
	{
		MultiplicationClas.printTable(50);
	}
}

class MulThread4 extends Thread
{
	public void run()
	{
		MultiplicationClas.printTable(100);
	}
}

public class SynchronizationStaticDemo {

	public static void main(String[] args) throws InterruptedException {
		MulThread1 t1=new MulThread1();
		MulThread2 t2=new MulThread2();
		MulThread3 t3=new MulThread3();
		MulThread4 t4=new MulThread4();
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		
		
		
		
	}

}
