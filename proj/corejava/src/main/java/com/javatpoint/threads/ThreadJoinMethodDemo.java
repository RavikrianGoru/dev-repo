package com.javatpoint.threads;

class ThreadClass1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; ++i) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Priority:"+this.getPriority() + ", ID:" + this.getId() + ", Name:"
					+ this.currentThread().getName());
		}
	}
}

public class ThreadJoinMethodDemo {

	public static void main(String[] args) {
		ThreadClass1 obj1 = new ThreadClass1();
		ThreadClass1 obj2 = new ThreadClass1();
		ThreadClass1 obj3 = new ThreadClass1();
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
		try {
			obj2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		obj3.start();


		ThreadClass1 obj4 = new ThreadClass1();
		ThreadClass1 obj5 = new ThreadClass1();
		ThreadClass1 obj6 = new ThreadClass1();
		obj4.start();
		try {
			obj4.join(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj5.start();
		obj6.start();
	}

}
