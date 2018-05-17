package jenkov.concurrency;


class ThreadImpl implements Runnable
{
	private ThreadLocal<Integer> threadLocl=new ThreadLocal<>();

	@Override
	public void run() {
		threadLocl.set((int)(Math.random() * 100)); 
		try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
		}
		System.out.println(threadLocl.get());
	}
	
}
public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadImpl obj=new ThreadImpl();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		Thread t5=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		
	}

}
