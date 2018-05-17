package com.javatpoint.threads;

public class ShutDownHookByAnonymousClass {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		
		
		r.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("shutdownhook logic by anonymous Thread class");
			}
		});
		
		
		System.exit(0);
	}

}
