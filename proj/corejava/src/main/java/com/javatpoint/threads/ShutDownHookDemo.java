package com.javatpoint.threads;

class ShutDownThread extends Thread{

	@Override
	public void run() {
System.out.println("ShutDownHook logic in this Thread. JVM/Runtime uses this thread before JVM shuts Down.");		
	}
	
}
public class ShutDownHookDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new ShutDownThread());

//		System.exit(0);
//		System.out.println("Now, Main is sleeping press ctrl+c");
		try{
		Thread.sleep(60000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");

		
		
	}

}
