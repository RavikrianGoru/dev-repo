package com.jenkov.concurrent;

class SharedResource
{
    private int counter;

    SharedResource(int counter)
    {
        this.counter = counter;
    }

    // Synchronized methods/blocks in Java are reentrant.
    public synchronized void outerOperation() throws InterruptedException
    {
        // synchronized (this)
        // {
        System.out.println("Outer Operation * 2 :" + (counter * 2));
        intterOperation();
        // }
    }

    public synchronized void intterOperation() throws InterruptedException
    {
        // synchronized (this)
        // {
        System.out.println("Inner Operation / 2 :" + (counter / 2));
        // }
    }

    public void print() throws InterruptedException
    {
        outerOperation();
    }
}

class MyThreadReentranceLock extends Thread
{
    private SharedResource resource = null;

    public MyThreadReentranceLock(SharedResource resource)
    {
        this.resource = resource;
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

public class _3_ReentranceLockDemoWithSynchMethodOrBlock
{
    public static void main(String[] args)
    {
        SharedResource res = new SharedResource(10);
        System.out.println("If a thread already holds the lock on a monitor object, it has access to all blocks synchronized on the same monitor object. \nThis is called reentrance");
        System.out.println("Synchronized methods/blocks in Java are reentrant.");
        MyThreadReentranceLock t1 = new MyThreadReentranceLock(res);

        t1.start();
    }

}
