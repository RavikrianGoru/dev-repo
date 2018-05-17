package com.javatpoint.threads;

class ThreadForThreadGroup implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getThreadGroup().getName());
	}

}

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		ThreadForThreadGroup ti=new ThreadForThreadGroup();
		ThreadGroup tg1=new ThreadGroup("ThreadGroup143");
		
		Thread t1=new Thread(tg1, ti, "Thread1");
		Thread t2=new Thread(tg1, ti, "Thread2");
		Thread t3=new Thread(tg1, ti, "Thread3");
		Thread t4=new Thread(tg1, ti, "Thread4");

		System.out.println(tg1.getName());

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		tg1.list();
		
		
	}

}
