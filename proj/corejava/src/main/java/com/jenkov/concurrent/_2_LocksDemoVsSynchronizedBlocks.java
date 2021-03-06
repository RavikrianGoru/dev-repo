package com.jenkov.concurrent;

import java.util.Date;

class Synchronizer
{
    private CustomLock lockObj = new CustomLock();

    public synchronized void synchronizedPrint()
    {
        long startTime = System.currentTimeMillis();
        long endTime = 0;
        System.out.println("Start time:" + new Date(startTime));
        for (int i = 1; i <= 1000000; ++i)
        {
            if (i % 1000000 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("End time:" + new Date(endTime));
        System.out.println("Total time taken is :" + (endTime - startTime) + " milliSecs");
    }

    public void lockedPrint() throws InterruptedException
    {
        lockObj.lock();
        try
        {
            long startTime = System.currentTimeMillis();
            long endTime = 0;
            System.out.println("Start time:" + new Date(startTime));
            for (int i = 1; i <= 1000000; ++i)
            {
                if (i % 1000000 == 0)
                    System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            endTime = System.currentTimeMillis();
            System.out.println("End time:" + new Date(endTime));
            System.out.println("Total time taken is :" + (endTime - startTime) + " milliSecs");
        }
        finally
        {
            lockObj.unlock();// Calling unlock() From a finally-clause
        }

    }

}

class MyThread extends Thread
{
    private Synchronizer sync = null;

    public MyThread(Synchronizer sync)
    {
        this.sync = sync;
    }

    @Override
    public void run()
    {
        // this.sync.synchronizedPrint();
        try
        {
            this.sync.lockedPrint();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        } // ordered
    }
}

public class _2_LocksDemoVsSynchronizedBlocks
{
    public static void main(String[] args)
    {
        Synchronizer obj = new Synchronizer();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);
        MyThread t3 = new MyThread(obj);
        MyThread t4 = new MyThread(obj);
        MyThread t5 = new MyThread(obj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
