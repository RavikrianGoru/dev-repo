package com.javatpoint.threads;

class ThreadClassByRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; ++i) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}

public class ThreadByRunnable {

	public static void main(String[] args) {
		ThreadClassByRunnable obj1=new ThreadClassByRunnable();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();
	}

}
