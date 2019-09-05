package com.udemy.java.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Hi");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

public class Executor_PoolExample
{

    public static void main(String[] args)
    {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        Task t4 = new Task();
        Task t5 = new Task();

        Task t6 = new Task();

        es.execute(t1);
        es.execute(t2);
        es.execute(t3);
        es.execute(t4);
        es.execute(t5);

        // After shutdown it will not execute threads
        // java.util.concurrent.RejectedExecutionException:
        es.shutdown();
        // es.execute(t6);

        while (!es.isTerminated())
        {

        }

        System.out.println("Main method ends Here.");
    }

}
