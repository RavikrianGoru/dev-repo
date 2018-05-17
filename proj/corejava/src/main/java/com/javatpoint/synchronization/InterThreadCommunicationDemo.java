package com.javatpoint.synchronization;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("withdrawing amount.............");
		if (this.amount < amount) {
			System.out.println("Less balance: waiting for deposit.......");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed.........");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit.");
		this.amount += amount;
		System.out.println("Deposited successfully");
		notify();
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
	
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}

}
