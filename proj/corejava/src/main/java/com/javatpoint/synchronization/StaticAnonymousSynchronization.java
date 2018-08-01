package com.javatpoint.synchronization;

class Multiplication
{
//	synchronized static void printTable(int n)
	static void printTable(int n)
	{
		synchronized (Multiplication.class) {
		for(int i=1;i<=5;++i)
		{
			System.out.println(Thread.currentThread().getName()+"- "+(i*n));
			try{
			Thread.sleep(500);
			}catch(InterruptedException e)
			{
				
			}
		}
		}
	}
}
public class StaticAnonymousSynchronization {

	public static void main(String[] args) {

		Thread t1=new Thread(){public void run(){Multiplication.printTable(10);}};
		Thread t2=new Thread(){public void run(){Multiplication.printTable(50);}};
		Thread t3=new Thread(){public void run(){Multiplication.printTable(100);}};
		Thread t4=new Thread(){public void run(){Multiplication.printTable(500);}};
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
