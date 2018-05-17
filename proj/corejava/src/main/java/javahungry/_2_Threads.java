package javahungry;
/*
Thread: single flow of execution.
Thread creation: by extending Thread class and by implementing Runnable interface

Note:using thread in the program does not make the program to execute faster.

States:
1) new
2) Runnable
			sleep done/resume/notify
			________________
		   /				\	3) Non-Runnable/Blocked
		   \________________/
		   wait/sleep/for lock/suspend
4) Running
5) Terminated

[new]-----start()----> [Runnable]------->[Running]----run() method ends---->[Terminated]



sleep() vs wait():
-----------------

1) wait() method belong to Object class. So, we call this method on any object.
2) we can call this method on synchronized context. i.e using synchronized block/ method 
3) it releases the lock on object and gives others chance to execute.
4) A waiting thread can be awake by notify() or notifyAll()  
5) Each object has each wait() method for inter-communication between threads.

1) sleep() method belong to Thread class. So, we call this method on Thread class object.
2) sleep() method can called from any context.
3) The sleep() method does not releases the lock of an object for specified time or until interrupt.
4) A sleeping can be awaked by interrupt or time expires.
5) The sleep() method is static method belonging to Thread class.

Both the method wait() and sleep() makes the running thread into Not Runnable state.

Both the method wait() and sleep() takes total execution time in milliseconds as an argument, after that it will be expired.


extending Thread vs implementing Interface
------------------------------------------

1) Does not support multiple inheritance: "ClassA extends Thread"   
2) It is not a good Object Oriented practice.
3) "extends Thread" makes the code tightly-coupled and easier to read .

1) Supports multiple inheritance: "ClassA implements Runnable extends ClassB"
2) It is a good Object Oriented practice.
3) "implements Runnable" makes the code loosely-coupled and easier to read .


yield() vs sleep():
------------------
1)	yield():
	Yield method temporarily pauses the currently executing thread to give a chance to the remaining waiting threads of the same priority to execute.
	If there is no waiting thread or all the waiting threads of low priority then the current thread will continue its execution.
2) yield() does not throw InterruptedException
3) yield() method causes currently executing thread togive up the monitors.

1)	sleep()---------->sleep(long), sleep(long,long)
	Sleep  method causes the currently executing thread to sleep for the number of milliseconds or the  nanoseconds specified in the argument.
2) sleep() method throws the InterruptedException if another thread interrupts the sleeping thread.
3) Thread.sleep() method does not cause currently executing thread to give up any monitors.

Both are static methods.
Both are available in Thread class.

How do we know howmany threads are running ?
Thread.activeCount()---- will gives the count of active Threads.



*/



public class _2_Threads {

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(()->{
			for(int i='a';i<='s';++i)
			{
				System.out.println((char)i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Thread.yield();
			}
		});
		Thread t2=new Thread(()->{
			for(int i=1;i<=10;++i)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Thread.yield();
			}
		});

		
		
		System.out.println("Current Thread:"+Thread.currentThread().getName());
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Total number of active threads :"+Thread.currentThread().activeCount());
		System.out.println("main Thread has enough sleep");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Get ID:"+t1.getId());
		System.out.println("Get ID:"+t2.getId());
		
		t1.start();
		t2.start();
		

	}

}
