package com.javatpoint.threads;

public class DemoYeildSleepMethods {

	public static void main(String[] args) {

		System.out.println("Main Thread......");
		try{
		Thread.currentThread().sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		Thread t1=new Thread(()->{
			System.out.println("This is Producer Thread.....");
			for(int i=1;i<=3;++i)
			{
				System.out.println("Producer"+i);
				Thread.yield();
			}
		});
		
		Thread t2=new Thread(()->{
			System.out.println("This is Consumer Thread.....");
			for(int i=1;i<=3;++i)
			{
				System.out.println("Consumer"+i);
				Thread.yield();
			}
		});
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
	}
}
