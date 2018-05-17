package com.javatpoint.threads;

class ThreadCreationByThread extends Thread
{
	
}

class ThreadCreationByThread1 extends Thread
{
	public ThreadCreationByThread1(String string) {
		this.setName(string);
	}

	public ThreadCreationByThread1() {
		// TODO Auto-generated constructor stub
	}

	public void run()
	{
		System.out.println(this.getName()+"Running run()........");
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Thread:"+this.getName()+":"+i);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class ThreadClassByThread {

	public static void main(String[] args){
		ThreadCreationByThread objT=new ThreadCreationByThread();
		objT.start();
		System.out.println(objT.isAlive());
		System.out.println(objT.isAlive());
		System.out.println(objT.isAlive());
	
		ThreadCreationByThread1 objT1=new ThreadCreationByThread1();
		ThreadCreationByThread1 objT2=new ThreadCreationByThread1("SecondThread");
		try{
		objT1.start();
		objT2.start();
		objT2.run();
		}catch(IllegalThreadStateException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
