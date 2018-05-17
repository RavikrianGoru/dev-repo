package happiestminds;

public class TwoThreadsToPrintData {
	
	
	/*
		There are two threads, One for printing 1,2,3.....10 and second one for printing A,B,C,.....S
		
		required output:
		1,A,2,B.......10,J,K,L,M,N,O,P,Q,R,S
	*/

	public static void main(String[] args) {
		
		Object lock = new Object();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10; ++i) {
				synchronized (lock) {
					System.out.println(i);
					lock.notify();
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 'A'; i <= 'S'; ++i) {
				synchronized (lock) {
					System.out.println((char) i);
					if (i >= 'A' + 9) {
						continue;
					} else {
						lock.notify();
						try {
							lock.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}

			}
		});

		t1.start();
		t2.start();
	}

}
