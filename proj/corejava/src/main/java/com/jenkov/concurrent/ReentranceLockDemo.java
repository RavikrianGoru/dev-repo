package com.jenkov.concurrent;


class Reentrancelock
{
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException
    {
        while (isLocked)
        {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock()
    {
        isLocked = false;
        notify();
    }
}

class SharedResource
{
    Reentrancelock reentranceLockObj = new Reentrancelock();

    private int counter;

    public int getCounter()
    {
        return counter;
    }

    public synchronized  void printEven() throws InterruptedException
    {
        for (int i = 1; i <= 10; ++i)
        {
            if(i%2==0)
            System.out.println(Thread.currentThread().getName() + "::::" + i);
        }
    }
    
    public synchronized void printOdd() throws InterruptedException
    {
        for (int i = 1; i <= 10; ++i)
        {
            if(i%2!=0)
            System.out.println(Thread.currentThread().getName() + "::::" + i);
        }
    }
    
    public void print() throws InterruptedException
    {
        reentranceLockObj.lock();
        printEven();
        printOdd();
        reentranceLockObj.unlock();
    }
}

class MyThreadReentranceLock extends Thread
{
    private SharedResource resource =null;
    public MyThreadReentranceLock(SharedResource resource)
    {
        this.resource=resource;
    }
    public void run()
    {
        try
        {
            resource.print();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
public class ReentranceLockDemo
{
    public static void main(String[] args)
    {
        SharedResource res=new SharedResource();
        MyThreadReentranceLock t1=new MyThreadReentranceLock(res);
        MyThreadReentranceLock t2=new MyThreadReentranceLock(res);
        
        t1.start();
        t2.start();
    }

}
