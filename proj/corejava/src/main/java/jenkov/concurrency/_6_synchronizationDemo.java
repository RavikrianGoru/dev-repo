package jenkov.concurrency;

class Counter
{
	int counter=0;
	public int get()
	{
		return counter;
	}
	public synchronized void add(int val)
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
