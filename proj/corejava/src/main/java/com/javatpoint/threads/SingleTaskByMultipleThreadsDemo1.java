package com.javatpoint.threads;

class SingleTaskThread extends Thread {
	public void run() {
		System.out.println("TaskOne");
	}
}

public class SingleTaskByMultipleThreadsDemo1 {

	public static void main(String[] args) {

		SingleTaskThread t1 = new SingleTaskThread();
		SingleTaskThread t2 = new SingleTaskThread();
		SingleTaskThread t3 = new SingleTaskThread();
		t1.start();
		t2.start();
		t3.start();

		try
		{
			Thread.sleep(2000);
		System.out.println("Anonymous Thread implementation");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		Thread tt1 = new Thread() {
			public void run() {
				System.out.println("task Two");
			}
		};
		Thread tt2 = new Thread() {
			public void run() {
				System.out.println("task Two");
			}
		};
		
		tt1.start();
		tt2.start();
	}

}
