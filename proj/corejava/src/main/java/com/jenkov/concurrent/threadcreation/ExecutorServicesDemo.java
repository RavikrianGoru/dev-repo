package com.jenkov.concurrent.threadcreation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("MyRunnable thread-start");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("MyRunnable thread-end");
    }
}

class MyCallable implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception
    {
        System.out.println("MyCallable thread");
        return 10;
    }
}

class MyThreadFactory implements ThreadFactory
{
    @Override
    public Thread newThread(Runnable r)
    {
        return new Thread(r);
    }

}

public class ExecutorServicesDemo
{

    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        
//      1a) Executors.newSingleThreadExecutor()
//      ExecutorService singleThreadExecutorService=Executors.newSingleThreadExecutor() by using this method we can have thread pool of size 1
//      No more than one task will be active at any given time. if new thread is submitted to get execution it will wait in the queue until a thread is available
//      We can call execute(Runnable) or submit(Callable)
        
        /*ExecutorService singleThreadExecutorService = Executors.newSingleThreadExecutor();
        singleThreadExecutorService.execute(new MyRunnable());
        singleThreadExecutorService.execute(new MyRunnable());
        
        Future<Integer> future=singleThreadExecutorService.submit(new MyCallable());
        System.out.println("Returned from MyCallable by using  future.get():"+future.get());
        future=singleThreadExecutorService.submit(new MyCallable());
        System.out.println("Returned from MyCallable by using  future.get():"+future.get());
        System.out.println("--------------------------------------------------");*/

//      1b) Executors.newFixedThreadPool(n)
//      ExecutorService fixedThreadPoolExecutorService=Executors.newFixedThreadPool(n) by using this method we can have thread pool of size n
//      No more than n task will be active at any given time. if new thread is submitted to get execution it will wait in the queue until a thread is available
//      We can call execute(Runnable) or submit(Callable)

        /*ExecutorService fixedThreadPoolExecutorService=Executors.newFixedThreadPool(5);
        fixedThreadPoolExecutorService.execute(new MyRunnable());
        fixedThreadPoolExecutorService.execute(new MyRunnable());
        fixedThreadPoolExecutorService.execute(new MyRunnable());
        fixedThreadPoolExecutorService.execute(new MyRunnable());
        fixedThreadPoolExecutorService.execute(new MyRunnable());
        
        @SuppressWarnings ("rawtypes")
        List<Future> futureList=new ArrayList<>();
        Future<Integer> tuture1;
        for(int i=1;i<=5;i++)
        {
            tuture1=fixedThreadPoolExecutorService.submit(new MyCallable());
            futureList.add(tuture1);
        }
        for(Future each:futureList)
        {
            System.out.println("Returned from MyCallable by using  future.get():"+each.get()); 
        }*/
        
//     2a) Executors.newCachedThreadPool() ; There is no newCachedThreadPool(n) method as this pool size changes as per threads
//     ExecutorService cashedThreadPoolExecutorService=Executors.newCachedThreadPool(); by using this method we can have cashed thread pool of size 1.
//     If no existing thread is available, a new thread will be created and added to the pool.
//     Threads that have not been used for sixty seconds are terminated and removed from the cache.
//     Thease pools improve the performance of programs that execute many short-lived asynchronous tasks
       
       /*ExecutorService cashedThreadPoolExecutorService=Executors.newCachedThreadPool();
       cashedThreadPoolExecutorService.execute(new MyRunnable());
       cashedThreadPoolExecutorService.execute(new MyRunnable());
       cashedThreadPoolExecutorService.execute(new MyRunnable());
       cashedThreadPoolExecutorService.execute(new MyRunnable());
       cashedThreadPoolExecutorService.execute(new MyRunnable());
        
       @SuppressWarnings ("rawtypes")
       List<Future> futureList2=new ArrayList<>();
       Future<Integer> future2;
       for(int i=1;i<=5;i++)
       {
           future2=cashedThreadPoolExecutorService.submit(new MyCallable());
           futureList2.add(future2);
       }
       for(Future each:futureList2)
       {
           System.out.println("Returned from MyCallable by using  future.get():"+each.get()); 
       }*/

        
//      3a) Executors.newSingleThreadScheduledExecutor(); This can be used when we want to execute a taks/command to run after a given delay, or to execute periodically.
//      ExecutorService t3=Executors.newSingleThreadScheduledExecutor(); by using this method we can have scheduled thread pool of sixe 1.
//      No more than one task will be active at any given time. if new thread is submitted to get execution it will wait in the queue until a thread is available
//      if this single thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks.
//      No more than one task will be active at any given time.
       
        /*ScheduledFuture<?> scheduledFuture1 = Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new MyRunnable(), 2, 1, TimeUnit.SECONDS);
        System.out.println(scheduledFuture1.isCancelled());
        System.out.println(scheduledFuture1.isDone());
        System.out.println(scheduledFuture1.get());

        ScheduledFuture<?> scheduledFuture2 = Executors.newSingleThreadScheduledExecutor().schedule(new MyCallable(), 5, TimeUnit.SECONDS);
        System.out.println(scheduledFuture2.isCancelled());
        System.out.println(scheduledFuture2.isDone());
        System.out.println(scheduledFuture2.get());

        ScheduledFuture<?> scheduledFuture3 = Executors.newSingleThreadScheduledExecutor().schedule(new MyRunnable(), 1, TimeUnit.SECONDS);
        System.out.println(scheduledFuture3.isCancelled());
        System.out.println(scheduledFuture3.isDone());
        System.out.println(scheduledFuture3.get());

        ScheduledFuture<?> scheduledFuture4 = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new MyRunnable(), 5, 1, TimeUnit.SECONDS);
        System.out.println(scheduledFuture4.isCancelled());
        System.out.println(scheduledFuture4.isDone());
        System.out.println(scheduledFuture4.get());*/
        
//      3b) Executors.newScheduledThreadPool(n); This can be used when we want to execute a taks/command to run after a given delay, or to execute periodically.
//      ExecutorService t3=Executors.newScheduledThreadPool(); by using this method we can have scheduled thread pool of sixe n.
//      No more than one task will be active at any given time. if new thread is submitted to get execution it will wait in the queue until a thread is available
//      if this single thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks.
//      No more than one task will be active at any given time.

        /*ScheduledFuture<?> schesuledThreadPoolFuture1 = Executors.newScheduledThreadPool(5).scheduleAtFixedRate(new MyRunnable(), 2, 1, TimeUnit.SECONDS);
        System.out.println(schesuledThreadPoolFuture1.isCancelled());
        System.out.println(schesuledThreadPoolFuture1.isDone());
        System.out.println(schesuledThreadPoolFuture1.get());

        ScheduledFuture<?> schesuledThreadPoolFuture2 = Executors.newScheduledThreadPool(5).schedule(new MyCallable(), 5, TimeUnit.SECONDS);
        System.out.println(schesuledThreadPoolFuture2.isCancelled());
        System.out.println(schesuledThreadPoolFuture2.isDone());
        System.out.println(schesuledThreadPoolFuture2.get());

        ScheduledFuture<?> schesuledThreadPoolFuture3 = Executors.newScheduledThreadPool(5).schedule(new MyRunnable(), 1, TimeUnit.SECONDS);
        System.out.println(schesuledThreadPoolFuture3.isCancelled());
        System.out.println(schesuledThreadPoolFuture3.isDone());
        System.out.println(schesuledThreadPoolFuture3.get());

        ScheduledFuture<?> schesuledThreadPoolFuture4 = Executors.newScheduledThreadPool(5).scheduleWithFixedDelay(new MyRunnable(), 5, 1, TimeUnit.SECONDS);
        System.out.println(schesuledThreadPoolFuture4.isCancelled());
        System.out.println(schesuledThreadPoolFuture4.isDone());
        System.out.println(schesuledThreadPoolFuture4.get());*/
        
//      4a) Executors.Executors.newWorkStealingPool(); Creates a work-stealing thread pool using all available processors as its target parallelism level.
//      ExecutorService workStealingPool=Executors.newWorkStealingPool(); by using this method we can have  thread pool of sixe 1.

        /*ExecutorService workStealingPool=Executors.newWorkStealingPool();
        workStealingPool.execute(new MyRunnable());
        workStealingPool.execute(new MyRunnable());
        workStealingPool.execute(new MyRunnable());
        workStealingPool.execute(new MyRunnable());
        workStealingPool.execute(new MyRunnable());
         
        @SuppressWarnings ("rawtypes")
        List<Future> futureList3=new ArrayList<>();
        Future<Integer> future3;
        for(int i=1;i<=5;i++)
        {
            future3=workStealingPool.submit(new MyCallable());
            futureList3.add(future3);
        }
        for(Future each:futureList3)
        {
            System.out.println("Returned from MyCallable by using  future.get():"+each.get()); 
        }*/
        
//      4b) Executors.Executors.newWorkStealingPool(n); Creates a work-stealing thread pool using all available processors as its target parallelism level.
//      ExecutorService workStealingPoolN=Executors.newWorkStealingPool(n); by using this method we can have  thread pool of sixe n.        
        
        /*ExecutorService workStealingPoolN=Executors.newWorkStealingPool(5);
        workStealingPoolN.execute(new MyRunnable());
        workStealingPoolN.execute(new MyRunnable());
        workStealingPoolN.execute(new MyRunnable());
        workStealingPoolN.execute(new MyRunnable());
        workStealingPoolN.execute(new MyRunnable());
         
        @SuppressWarnings ("rawtypes")
        List<Future> futureList4=new ArrayList<>();
        Future<Integer> future4;
        for(int i=1;i<=5;i++)
        {
            future4=workStealingPoolN.submit(new MyCallable());
            futureList4.add(future4);
        }
        for(Future each:futureList4)
        {
            System.out.println("Returned from MyCallable by using  future.get():"+each.get()); 
        }*/
    }

}
