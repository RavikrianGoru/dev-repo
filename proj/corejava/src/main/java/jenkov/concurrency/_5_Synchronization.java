package jenkov.concurrency;

/*

A synchronized block in Java is synchronized on some object. 
All synchronized blocks synchronized on the same object can only have one thread executing inside them at the same time. 
All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block. 


 The synchronized keyword can be used to mark four different types of blocks:

   1) Instance methods(object level or per object)
   2) Static methods
   3) Code blocks inside instance methods(object level or per object)
   4) Code blocks inside static methods

1) Instance method: A synchronized instance method in Java is synchronized on the instance (object) owning the method.
   Only one thread can execute inside a synchronized instance method.
2) Static method: Synchronized static methods are synchronized on the class object of the class the synchronized static method belongs to.
3) Synchronized Blocks in Instance Methods: we can synchronized a piece of code inside an instance method. by using synchronized block.
	synchronized(this)				synchronized(obj)						synchronized(new CustomeClass())		
	{								{										{
	......							......									.........
	}								}										}
The object taken in the parentheses by the synchronized construct is called a monitor object. The code is said to be synchronized on the monitor object.
A synchronized instance method uses the object it belongs to as monitor object.
Only one thread can execute inside a Java code block synchronized on the same monitor object. 
4) Synchronized Blocks in static Methods:

*/
class SyndronizedMethodDemo implements Runnable {
	int intVal = 0;

	public synchronized void add(int val) {
		this.intVal += val;
		System.out.println("Updated value:" + intVal);
	}

	@Override
	public void run() {
		add(1);
	}
}

class SyndronizedBlockInInstanceMethodDemo implements Runnable {
	int intVal = 0;
	String monitorObj=new String();
	SyndronizedBlockInInstanceMethodDemo(){}
	SyndronizedBlockInInstanceMethodDemo(String str){
		this.monitorObj=str;
	}
	public void add(int val) {
		synchronized(this)
		{
		this.intVal += val;
		System.out.println("Updated value:" + intVal);
		}
	}
	public void add1(int val) {
		synchronized(monitorObj)
		{
		this.intVal += val;
		System.out.println("Updated value:" + intVal);
		}
	}

	@Override
	public void run() {
		add(1);
	}
}

class StaticSynchronizedMethodDemo implements Runnable
{
	public static int intVal=0;
	public static synchronized void add(int val)
	{
		intVal+=val;
		System.out.println("Update static value:"+intVal);
	}
	
	@Override
	public void run() {
		add(1);
	}
}
class StaticSynchronizedBlockStaticMethodDemo implements Runnable
{
	public static int intVal=0;
	public static void add(int val)
	{
		synchronized(StaticSynchronizedBlockStaticMethodDemo.class)
		{
		intVal+=val;
		System.out.println("Update static value:"+intVal);
		}
	}
	
	@Override
	public void run() {
		add(1);
	}
}

public class _5_Synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Synchronized method:");
		SyndronizedMethodDemo obj=new SyndronizedMethodDemo();
		for (int i = 1; i <= 10; ++i) {
			Thread t = new Thread(obj);
			t.start();
		}
		
		
		Thread.sleep(5000);
		
		
		
		System.out.println("Synchronized static method:");
		StaticSynchronizedMethodDemo obj1=new StaticSynchronizedMethodDemo();
		for (int i = 1; i <= 10; ++i) {
			Thread t = new Thread(obj1);
			t.start();
		}
		
		
		Thread.sleep(5000);
		
		
		System.out.println("Synchronized block in instance method:");
		SyndronizedBlockInInstanceMethodDemo obj2=new SyndronizedBlockInInstanceMethodDemo();
		for (int i = 1; i <= 10; ++i) {
			Thread t = new Thread(obj2);
			t.start();
		}

		
		Thread.sleep(5000);
		
		System.out.println("static Synchronized block in static method:");
		StaticSynchronizedBlockStaticMethodDemo obj3=new StaticSynchronizedBlockStaticMethodDemo();
		for (int i = 1; i <= 10; ++i) {
			Thread t = new Thread(obj3);
			t.start();
		}
		
	}

}
