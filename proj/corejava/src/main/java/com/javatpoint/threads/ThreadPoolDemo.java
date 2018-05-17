package com.javatpoint.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class WorkerThread implements Runnable
{
	private String message="";
	public WorkerThread()
	{
		
	}
	public WorkerThread(String message)
	{
		this.message=message;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+": (Start):"+message);
		processSleep();
		System.out.println(Thread.currentThread().getName()+": (End):"+message);
	}

	private void processSleep()
	{
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=1;i<=10;++i)
		{
			Runnable worker=new WorkerThread("msg:"+i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()){}
		System.out.println("Finished all threads.");
		
	}

}
