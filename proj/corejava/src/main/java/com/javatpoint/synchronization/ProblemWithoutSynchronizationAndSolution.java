package com.javatpoint.synchronization;

class Table
{
//	public void printTable(int n)
//	synchronized public void printTable(int n)
	public void printTable(int n)
	{
		synchronized(this)
		{
		for(int i=1;i<=5;++i)
		{
			System.out.println(i*n);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		}
	}
}

class Thread1 extends Thread
{
	Table t;
	public Thread1()
	{
		
	}
	public Thread1(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}
}

class Thread2 extends Thread
{
	Table t;
	public Thread2()
	{
		
	}
	public Thread2(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(100);
	}
}

public class ProblemWithoutSynchronizationAndSolution {

	public static void main(String[] args) {
		Table obj=new Table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		
		t1.start();
		t2.start();
		
		
		System.out.println("Anonymous thread implementation.");
		Thread t3=new Thread(){public void run(){obj.printTable(10);}};
		Thread t4=new Thread(){public void run(){obj.printTable(50);}};
		t3.start();
		t4.start();
	}

}
