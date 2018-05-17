package com.javatpoint.threads;

class OneThread extends Thread
{
	public void run()
	{
		System.out.println("One Task");
	}
}
class TwoThread extends Thread
{
	public void run()
	{
		System.out.println("Two Task");
	}
}

public class MutliTaskingByMultipleThreads {

	public static void main(String[] args) {

		OneThread t1=new OneThread();
		TwoThread t2=new TwoThread();
		t1.start();
		t2.start();
	}

}
