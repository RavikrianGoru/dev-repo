package com.jenkov.concurrent;

class Counter// Shared Resource
{
    private long count;

    Counter(int count)
    {
        System.out.println("Initial count:" + count);
        this.count = count;
    }

    public synchronized void add(long count)
    {
        System.out.println("Updated by thread:" + Thread.currentThread().getName());
        this.count += count;
        System.out.println("count :" + this.count);
    }

    public long getCount()
    {
        return this.count;
    }
}

class CounterThread extends Thread
{
    protected Counter counter = null;

    public CounterThread(Counter counter)
    {
        this.counter = counter;
    }

    public void run()
    {
        counter.add(5 + 5);
    }
}

public class _1_ConcurrentThreadExample
{
    public static void main(String[] args)
    {
        Counter counterObj = new Counter(5);// same shared object will be used in threads
        CounterThread threadOne = new CounterThread(counterObj);
        CounterThread threadTwo = new CounterThread(counterObj);

        threadOne.start();
        threadTwo.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(counterObj.getCount());
    }
}
