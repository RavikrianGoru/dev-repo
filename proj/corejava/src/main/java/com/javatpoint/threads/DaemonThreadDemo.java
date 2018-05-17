package com.javatpoint.threads;

import java.util.ArrayList;

class DaemonThreadClass extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread is running.....");
		} else {
			System.out.println("User Thread is running.....");
		}
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		DaemonThreadClass obj1 = new DaemonThreadClass();
		DaemonThreadClass obj2 = new DaemonThreadClass();
		DaemonThreadClass obj3 = new DaemonThreadClass();
		DaemonThreadClass obj4 = new DaemonThreadClass();
		
		//we need to set thread as daemon before calling start method. else (Exception)
		
		obj1.setDaemon(true);
		obj1.start();
		obj2.setDaemon(true);
		obj2.start();
		
		obj3.start();
		obj4.start();
		
		ArrayList al=new ArrayList();
		al.contains("ravi");
		al.remove("ravi");
		
	}

}
