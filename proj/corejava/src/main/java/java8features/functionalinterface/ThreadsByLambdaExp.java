package java8features.functionalinterface;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Generic<T1,T2,T3>
{
	
}
class C implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		System.out.println("Called Callable interface call() method");
		return 1;
	}
	
}

public class ThreadsByLambdaExp {

	public static void main(String[] args){

		HashMap hm=null;
		ConcurrentSkipListSet<Integer> cls=null;
		
		
/*		Thread threadWithAnonymous=new Thread(new Runnable(){
			@Override
			public void run()
			{
				System.out.println("Thread is running....");
					try{
					Thread.sleep(1000*5);
					}catch(InterruptedException e)
					{
						e.getMessage();
					}
				System.out.println("Thread is about to end");
					
			}
		});
		
		threadWithAnonymous.start();
		
		
		Thread threadWithLambda=new Thread(
				()->{System.out.println("This is a thread which is implemented by lambda Expression");}
				);
		threadWithLambda.start();
*/		
		Executor ex=Executors.newFixedThreadPool(5);// will not allow Callable
//		ex.execute(new C()); //Compile time Error
		ExecutorService es1=Executors.newFixedThreadPool(5);
		ArrayList<Future<Integer>> al=new ArrayList<>();
		for(int i=1;i<=100;i++)
		{
			Future<Integer> f=es1.submit(new C());
			al.add(f);
		}
		System.out.println("============================="+al.size()+"=============================");
		
		/*
		C obj=new C();
		try {
			System.out.println(""+obj.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		
		}
}
