package jenkov.concurrency;
/*

The terms concurrency and parallelism are often used in relation to multithreaded programs.
Concurrency:
	Concurrency means that an application is making progress on more than one task at the same time (concurrently). 
	Well, if the computer only has one CPU the application may not make progress on more than one task at exactly the same time, but more than one task is being processed at a time inside the application. 
	It does not completely finish one task before it begins the next.

Parallelism:
Parallelism means that an application splits its tasks up into smaller subtasks which can be processed in parallel, for instance on multiple CPUs at the exact same time
 
As you can see, an application can be concurrent, but not parallel. This means that it processes more than one task at the same time, but the tasks are not broken down into subtasks.

An application can also be parallel but not concurrent. This means that the application only works on one task at a time, and this task is broken down into subtasks which can be processed in parallel. 


Java threads are objects like any other Java objects. Threads are instances of class java.lang.Thread, or instances of subclasses of this class. 
In addition to being objects, java threads can also execute code.


Subclass or Runnable?
There are no rules about which of the two methods that is the best.
I prefer implementing Runnable, and handing an instance of the implementation to a Thread instance
	+) When having the Runnable's executed by a thread pool it is easy to queue up the Runnable instances until a thread from the pool is idle. This is a little harder to do with Thread subclasses.  
	+) Multiple inheritance through interface(Runnable).
	

MyRunnable runnable = new MyRunnable();
Thread thread = new Thread(runnable, "New Thread");
thread.start();
System.out.println(thread.getName());

Notice however, that since the MyRunnable class is not a subclass of Thread, it does not have access to the getName() method of the thread executing it. 


 the threads are in principle executing in parallel and not sequentially. The JVM and/or operating system determines the order in which the threads are executed. 
 This order does not have to be the same order in which they were started. 


A race condition is a special condition that may occur inside a critical section. 
A critical section is a section of code that is executed by multiple threads.
 

Critical section:
Running more than one thread inside the same application does not by itself cause problems. 
The problems arise when multiple threads access the same resources. For instance the same memory (variables, arrays, or objects), systems (databases, web services etc.) or files. 

Race condition:
The situation where two threads compete for the same resource, where the sequence in which the resource is accessed is significant, is called race conditions
A code section that leads to race conditions is called a critical section. 

Preventing Race Condition:
To prevent race conditions from occurring you must make sure that the critical section is executed as an atomic instruction. 
That means that once a single thread is executing it, no other threads can execute it until the first thread has left the critical section. 
we can use synchronization or locks or atomic variables  like java.util.concurrent.atomic.AtomicInteger.

 I)
  Thread safe: Code that is safe to call by multiple threads simultaneously is called thread safe.
 If a piece of code is thread safe, then it contains no race conditions.
 Race condition only occur when multiple threads update shared resources.
 
 i)Local variables:
 	All the local variables are stored in each Thread's own stack. That means that local variables are never shared between threads. 
 	That also means that all local primitive variables are thread safe. 
 	Ex:
 	
 	public void someMethod()
 	{
 		int threadSafeInt =10;// local variables stored in each thread's own stact. so, it is thread safe.
 		threadSafeInt++;
 	}
 		
 	
 ii)Local Onject references:
 	Local references to objects are a bit different. The reference itself is not shared. 
 	The object referenced however, is not stored in each threads's local stack. All objects are stored in the shared heap. 
  	Ex:
  	public void someMethod()
  	{
  		LocalObject locObj=new LocalObject();// this object is not shared, so thread safe.
  		locObj.doSome();
  		.....
  		...
  	}
 iii) Object Member Variables
 	Object member variables (fields) are stored on the heap along with the object. 
 	Therefore, if two threads call a method on the same object instance and this method updates object member variables, the method is not thread safe. 
 	Ex:
 	public class NotThreadSafe
 	{
    	StringBuilder builder = new StringBuilder();
    	public add(String text)// this add(-) is not thread safe.
    	{
        	this.builder.append(text);
    	}
	}
	
Note: Resources can be any shared resource like an object, array, file, database connection, socket etc. 
	  In Java you do not always explicitly dispose objects, so "disposed" means losing or null'ing the reference to the object. 	

Note: Race conditions occur only if multiple threads are accessing the same resource, and one or more of the threads write to the resource.
	  If multiple threads read the same resource race conditions do not occur. 
	  
Note: We can make sure that objects shared between threads are never updated by any of the threads by making the shared objects immutable, and thereby thread safe.

Note: Immutable object's reference is not thread safe.




*/


class MyThreadSubClass extends Thread
{
	MyThreadSubClass(String name)
	{
		super(name);
	}
	public MyThreadSubClass() {
		super();
	}
	public void run()
	{
		System.out.println(getName()+"::"+getId());
		System.out.println("MyThreadSubClass::Run()-method stated:Thread is running");
	}
}
class MyThreadRunnableImpl implements Runnable
{
	@Override
	public void run() {
		System.out.println("MyThreadRunnableImpl::Run()-method stated:Thread is running");
	}
	
}
public class _3_ConcurrencyParallelism {

	public static void main(String[] args) {
		System.out.println("Concurrency: Multiplr tasks makes progress at the same time.\nAs you can see, an application can be concurrent, but not parallel. This means that it processes more than one task at the same time, but the tasks are not broken down into subtasks.\n");
		System.out.println("Parallelism: Each task is broken into subtasks which can be processed in parallel.\nAn application can also be parallel but not concurrent. This means that the application only works on one task at a time, and this task is broken down into subtasks which can be processed in parallel. ");
		
		System.out.println("Thread:");
		System.out.println("Java threads are objects like any other Java objects. Threads are instances of class java.lang.Thread, or instances of subclasses of this class.");
		System.out.println("In addition to being objects, java threads can also execute code.");
		
		System.out.println("============================================");
		
		System.out.println("Main() method Thread.currentThread().getName():-"+ Thread.currentThread().getName());
		MyThreadSubClass t=new MyThreadSubClass();
		t.start();
		MyThreadSubClass t1=new MyThreadSubClass("Rk-Thread:");
		t1.start();
		Thread rThread=new Thread(new MyThreadRunnableImpl());
		rThread.start();
		
		
		//Follwoing Example: if the threads are started in sequence (1, 2, 3 etc.) they may not execute sequentially, meaning thread 1 may not be the first thread to write its name to System.out. This is because the threads are in principle executing in parallel and not sequentially.
		
		for(int i=0; i<10;++i)
		{
			new Thread(""+i){
				@Override 
				public void run()
				{
				System.out.println(getName()+" is running");
				}
				}.start();
		}
				
	}

}
