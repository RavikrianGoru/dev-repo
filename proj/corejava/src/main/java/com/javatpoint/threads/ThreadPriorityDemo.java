package com.javatpoint.threads;

class ThreadPriorityClass extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriorityDemo {

	public static void main(String[] args) {

		ThreadPriorityClass obj1=new ThreadPriorityClass();
		ThreadPriorityClass obj2=new ThreadPriorityClass();
		ThreadPriorityClass obj3=new ThreadPriorityClass();
		ThreadPriorityClass obj4=new ThreadPriorityClass();
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj3.setPriority(Thread.MAX_PRIORITY);
		obj4.setPriority(Thread.NORM_PRIORITY);
		
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		
		
	}

}
