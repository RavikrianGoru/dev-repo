package jenkov.concurrency;
/*
The Java volatile Visibility Guarantee:
---------------------------------------
In a multithreaded application where the threads operate on non-volatile variables, each thread may copy variables from main memory into a CPU cache while working on them, for performance reasons. 
If your computer contains more than one CPU, each thread may run on a different CPU. That means, that each thread may copy the variables into the CPU cache of different CPUs.

With non-volatile variables there are no guarantees about when the Java Virtual Machine (JVM) reads data from main memory into CPU caches, or writes data from CPU caches to main memory. 

The problem with threads not seeing the latest value of a variable because it has not yet been written back to main memory by another thread, is called a "visibility" problem.

By declaring the counter variable volatile all writes to the counter variable will be written back to main memory immediately. Also, all reads of the counter variable will be read directly from main memory. 

public class SharedObject 
{
    public volatile int counter = 0;
}

volatile is Not Always Enough:
------------------------------
 A volatile variable is no longer enough to guarantee correct visibility. 
 The short time gap in between the reading of the volatile variable and the writing of its new value, 
 creates an race condition where multiple threads might read the same value of the volatile variable, generate a new value for the variable, and when writing the value back to main memory - overwrite each other's values


*/

class SharedResource
{
	int nonVolatileVal=0;
	volatile int  volatileVal=0;
	public int getNonVolatileVal() {
		return nonVolatileVal;
	}
	public int getVolatileVal() {
		return volatileVal;
	}
	public void incrementVals()
	{
		this.nonVolatileVal+=1;
		this.volatileVal+=1;
	}
}

class VolatileThread extends Thread
{
	SharedResource sResource=null;
	
	VolatileThread(SharedResource sResource)
	{
		this.sResource=sResource;
	}
	@Override
	public void run()
	{
		sResource.incrementVals();
		System.out.println(Thread.currentThread().getName()+": ("+sResource.getNonVolatileVal()+","+sResource.getVolatileVal()+")");
	}
	
}

public class _7_VolatileDemo {

	public static void main(String[] args) {
		System.out.println("The Java volatile keyword is used to mark a Java variable as being stored in main memory.");
		System.out.println("Every read of a volatile variable will be read from the computer's main memory, and not from the CPU cache,\nand that every write to a volatile variable will be written to main memory, and not just to the CPU cache. ");
		
		SharedResource sRsc=new SharedResource();
		
		Thread t1=new VolatileThread(sRsc);
		Thread t2=new VolatileThread(sRsc);
		Thread t3=new VolatileThread(sRsc);
		Thread t4=new VolatileThread(sRsc);
		Thread t5=new VolatileThread(sRsc);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		ThreadLocal o=null;
		
		
	}

}