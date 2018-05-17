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
    public Integer call() throws Exception// We can throw Exception & we return object(Future).
    {
        System.out.println("This is call method of sub class of Callable interface.");
        return i1;
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

        // 3a. Create Thread by implementing anonymous Runnable interface
        Thread myRunnable1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("This is anonymous implementation of Runnable interface new Thread(new Runnable(){ @Override public void run(){//business logic}}):");
            }
        });
        myRunnable1.setName("ThreadByInterface-OneA");
        myRunnable1.start();

        // 3b. Create Thread by implementing lambda expression Runnable interface
        Thread myRunnable2 = new Thread(() -> {
            System.out.println("This is lambda implementation of Runnable interface new Thread(()->{//business logic}):");
        });
        myRunnable2.setName("ThreadByInterface-OneB");
        myRunnable2.start();

        // 4. Create Threads by using Callable , Executors framework

        // 4a. Create Thread by implementing Callable interface
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<Integer> item;

        List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
        for (int i = 1; i <= 5; i++)
        {
            item = pool.submit(new CallablePrintNumbers(10));
                   pool.execute(new MyRunnableThread());
            
            futureList.add(item);
        }
        int sum = 0;
        for (Future<Integer> f : futureList)
        {
            sum += f.get();
            System.out.println("f.isDone() : " + f.isDone());
            System.out.println("f.isCancelled() : " + f.isCancelled());
        }
        System.out.println("Sum :" + sum);

        // 4b. Create Thread by implementing anonymous Callable interface
        ExecutorService pool1 = Executors.newFixedThreadPool(10);
        Future<Integer> item1;

        List<Future<Integer>> futureList1 = new ArrayList<Future<Integer>>();
        for (int i = 1; i <= 5; i++)
        {
            item1 = pool1.submit(new Callable<Integer>()
            {
                @Override
                public Integer call() throws Exception
                {
                    int count = 10;
                    System.out.println("Anomymous Callable implementation in submit(-) method");
                    return count;
                }
            });
            futureList1.add(item1);
        }
        int sum1 = 0;
        for (Future<Integer> f : futureList1)
        {
            sum += f.get();
            System.out.println("f.isDone() : " + f.isDone());
            System.out.println("f.isCancelled() : " + f.isCancelled());
        }
        System.out.println("Sum :" + sum);
    }

}
