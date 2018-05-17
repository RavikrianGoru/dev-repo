package jenkov.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ExecutorServiceDemo1 {

	public static void main(String[] args) {

		//1
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		es.execute(()->{
			for(int i=1;i<=5;++i)
			{
				System.out.println(i*1);
			}
		});
		es.execute(()->{
			for(int i=1;i<=5;++i)
				System.out.println(i*2);
		});
		es.execute(()->{
			for(int i=1;i<=5;++i)
				System.out.println(i*5);
		});
		es.execute(()->{
			for(int i=1;i<=5;++i)
				System.out.println(i*10);
		});
		
		
		//2
		ForkJoinPool fjp=new ForkJoinPool(4);
		
		
	}

}
