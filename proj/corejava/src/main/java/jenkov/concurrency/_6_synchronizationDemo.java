package jenkov.concurrency;

class Counter
{
	volatile int  counter=0;//volatile : any operation on this variable reflect directly in main memory
	public int get()
	{
		return counter;
	}
	public synchronized void add(int val)//this is synchronized so, only one thread can execute this method at a time.
	{
		counter+=val;
	}
}

class ThreadDemoThread implements Runnable
{
	Counter ctr=null;

	ThreadDemoThread(Counter ctr)
	{
		this.ctr=ctr;
	}

	@Override
	public void run() {
		for(int i=1;i<=5;++i)
		{
			ctr.add(i);
		}
		System.out.println(ctr.get());
	}
}

class ThreadDemoRunnable implements Runnable
{
	Counter ctr=null;

	ThreadDemoRunnable(Counter ctr)
	{
		this.ctr=ctr;
	}

	@Override
	public void run() {
		for(int i=1;i<=5;++i)
		{
			ctr.add(i);
		}
		System.out.println(ctr.get());	
	}
}

public class _6_synchronizationDemo {

	public static void main(String[] args) {
	    
		
		System.out.println("The synchronized mechanism was Java's first mechanism for synchronizing access to objects shared by multiple threads. \nThe synchronized mechanism isn't very advanced though.\nThat is why Java 5 got a whole set of concurrency utility classes to help developers implement more fine grained concurrency control than what you get with synchronized.");
		System.out.println("synchronized key word allows only one thread execution at a time.(locks on object or class");
		System.out.println("synchronized method(static or instance methods) & synchronized blocks");
		System.out.println("* Java synchronized keyword is re-entrant in nature \nit means if a java synchronized method calls another synchronized method which requires the same lock then the current thread which is holding lock can enter into that method without acquiring the lock.");
		System.out.println("Java Synchronization will throw NullPointerException if object used in java synchronized block is null.");
		System.out.println("* One Major disadvantage of Java synchronized keyword is that it doesn't allow concurrent read.");
		System.out.println("By using the concept of lock stripping and using different locks for reading and writing, you can overcome this limitation of synchronized in Java.");
		System.out.println("---- java.util.concurrent.locks.ReentrantReadWriteLock");
		System.out.println("---- ReadWriteLock");
		System.out.println("* One more limitation of java synchronized keyword is that it can only be used to control access to a shared object within the same JVM");
		System.out.println(" If you have more than one JVM and need to synchronize access to a shared file system or database, the Java synchronized keyword is not at all sufficient. You need to implement a kind of global lock for that");

		System.out.println("* It's possible that both static synchronized and non-static synchronized method can run simultaneously or concurrently because they lock on the different object.");
		
		System.out.println("* From java 5 after a change in Java memory model reads and writes are atomic for all variables declared using the volatile keyword (including long and double variables) and simple atomic variable access is more efficient instead of accessing these variables via synchronized java code.");
		
		System.out.println("According to the Java language specification you can not use Java synchronized keyword with constructor it’s illegal and result in compilation error.");
		
		System.out.println("Do not synchronize on the non-final field on synchronized block in Java. because the reference of the non-final field may change anytime and then different thread might synchronizing on different objects.");
		
		System.out.println("It's not recommended to use String object as a lock in java synchronized block because a string is an immutable object and literal string and interned string gets stored in String pool.");
		
		System.out.println("java.util.concurrent package different locking mechanism than provided by synchronized keyword, they mostly used ReentrantLock, which internally use CAS operations, volatile variables and atomic variables to get better performance.");
		
		Counter ctr=new Counter();
		ThreadDemoRunnable tdr=new ThreadDemoRunnable(ctr);
		Thread t1=new Thread(tdr);
		Thread t2=new Thread(tdr);
		Thread t3=new Thread(tdr);
		t1.start();
		t2.start();
		t3.start();
		
		ThreadDemoThread tdt=new ThreadDemoThread(ctr);
		Thread tt1=new Thread(tdt);
		Thread tt2=new Thread(tdt);
		Thread tt3=new Thread(tdt);
		tt1.start();
		tt2.start();
		tt3.start();
		
		
	}

}
