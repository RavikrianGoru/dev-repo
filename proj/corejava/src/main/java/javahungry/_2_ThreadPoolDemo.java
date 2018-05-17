package javahungry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	private String cmd;
	WorkerThread(String name)
	{
		this.cmd=name;
		
	}
	

	@Override
	public void run() {
		System.out.println("Active Thread count:"+Thread.activeCount());
		System.out.println(Thread.currentThread().getName()+" : Command : "+cmd+" Started");
		processCmd(cmd);
		System.out.println(Thread.currentThread().getName()+" : Command : "+cmd+" Completed");
	}
	public void processCmd(String cmd)
	{
		System.out.println(cmd+" is processing............. in "+Thread.currentThread().getName());
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class _2_ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor =Executors.newFixedThreadPool(2);
		for(int i=1;i<=10;++i)
		{
			executor.execute(new WorkerThread("::"+i));
		}

		System.out.println("1. Active Thread count:"+Thread.activeCount());
		executor.shutdown();
		System.out.println("2. Active Thread count:"+Thread.activeCount());
		while(!executor.isTerminated())
		{
			
		}
		System.out.println("Finished All threads");
	}

}
