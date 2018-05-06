package com.jenkov.concurrent.threadcreation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThreadByThread extends Thread
{
    public MyThreadByThread()
    {
    }

    public MyThreadByThread(String name)
    {
        this.setName(name);
    }

    @Override
    public void run()
    {
        System.out.println("Hellow world! MyThreadByThread by extending Thread class");
        System.out.println(this.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        // throw new Exception("Jaffa");
        // We can handle threads but can not throw.

    }
}

class MyRunnableThread implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Hellow world! MyRunnableThread by implementing  Runnable interface");
        // System.out.println(this.currentThread().getName());//CE
        System.out.println(Thread.currentThread().getName());
        // throw new Exception("Jaffa");
        // We can handle threads but can not throw.
    }

}

class CallablePrintNumbers implements Callable<Integer>
{
    Integer i1;

    public CallablePrintNumbers(Integer i1)
    {
        this.i1 = i1;
    }

    @Override
    public Integer call() throws Exception//We can throw Exception & we return object(Future).
    {
        int count = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i1);
            Thread.sleep(1000);
            count += i1;
            i1++;
        }
        return count;
    }
    
}

public class CreateAndStartThreads
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // 1. Create Thread No output will be generated
        Thread t = new Thread();
        t.start();

        // 2. Create Thread by extending thread class
        Thread t1 = new MyThreadByThread();
        t1.setName("ThreadByClass-One");
        t1.start();

        // 3. Create Thread by implementing Runnable interface
        Thread myRunnable = new Thread(new MyRunnableThread());
        myRunnable.setName("ThreadByInterface-One");
        myRunnable.start();

        //4. Create Threads by using Callable , Executors framework
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<Integer> item;
        List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();

        for (int i = 1; i <= 10; i++)
        {
            item = pool.submit(new CallablePrintNumbers(10));
            futureList.add(item);
        }
        
        int sum=0;
        for(Future<Integer> f:futureList)
        {
            sum+=f.get();
        }
        System.out.println("Sum :"+sum);

        System.out.println("-------Creating 10 thread and starting all order of thered exection not determined-----");

        for (int i = 1; i <= 10; i++)
        {
            Thread tn = new MyThreadByThread("Ravi-"+i);
            tn.start();
        }
    }

}
