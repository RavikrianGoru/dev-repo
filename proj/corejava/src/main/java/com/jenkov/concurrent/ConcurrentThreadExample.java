package com.jenkov.concurrent;

class Counter
{
    private long count = 0;

    public synchronized void add(long count)
    {
        this.count +=count;
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
        for (int i = 1; i <= 10; ++i)
        {
            counter.add(1);
        }

    }

}

public class ConcurrentThreadExample
{

    public static void main(String[] args)
    {
        Counter counterObj = new Counter();//same shared object will be used in threads
        CounterThread threadOne = new CounterThread(counterObj);
        CounterThread threadTwo = new CounterThread(counterObj);

        threadOne.start();
        threadTwo.start();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(counterObj.getCount());
    }

}
