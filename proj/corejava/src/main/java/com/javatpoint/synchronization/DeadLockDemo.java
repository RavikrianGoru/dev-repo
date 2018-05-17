package com.javatpoint.synchronization;

public class DeadLockDemo {

	public static void main(String[] args) {

		final String resource1 = new String("resouce1:RavikiranGoru");
		final String resource2 = new String("resouce2:RavikiranGoru");

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println(resource1 + " : (Locked) at Thread1");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {

					}
					
					synchronized (resource2) {
						System.out.println(resource2 + " : (Locked) at Thread1");
					}

				}

			}
		};

		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println(resource2 + " : (Locked) at Thread2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
					synchronized (resource1) {
						System.out.println(resource1 + " : (Locked) at Thread2");
					}

				}

			}
		};

		t1.start();
		t2.start();
	}

}
