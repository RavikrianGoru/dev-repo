package com.udemy.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i <= 5; i = i + 2)
        {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class EvenRunnable implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i <= 5; i = i + 2)
        {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class EvenCallable implements Callable<Boolean>
{

    @Override
    public Boolean call() throws Exception
    {
        for (int i = 0; i <= 5; i = i + 2)
        {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        return true;
    }

}

public class ThreadTest
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // 1
        EvenThread t1 = new EvenThread();
        t1.start();

        // 2
        EvenRunnable r1 = new EvenRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        EvenCallable c1 = new EvenCallable();
        ExecutorService e = Executors.newSingleThreadExecutor();
        e.execute(r1);// Accept only Runnable
        System.out.println(e.submit(c1).get());// Accept Callable
        System.out.println(e.submit(r1).get());// Accept Runnable too
    }
}
