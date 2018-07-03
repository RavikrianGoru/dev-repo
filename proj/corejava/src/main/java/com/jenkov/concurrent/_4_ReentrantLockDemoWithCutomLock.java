package com.jenkov.concurrent;

class CounterShared
{
    private int counter = 0;
    CustomReentrantLock reentrant = new CustomReentrantLock();

    CounterShared(int counter)
    {
        this.counter = counter;
    }

    private void outerOpt() throws InterruptedException
    {
        reentrant.lock();
        try
        {
            System.out.println("Outer operation :accuaired the lock");
            System.out.println("Outer opt:" + (counter * 10));
            innerOpt();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            reentrant.unlock();
        }
        System.out.println("Outer operation :re-released the lock");
    }

    private void innerOpt() throws InterruptedException
    {
        reentrant.lock();
        try
        {
            System.out.println("Inner operation :re-accuaired the lock");
            System.out.println("Innter opt:" + (counter * 10));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            reentrant.unlock();
        }
        System.out.println("Inner operation :released the lock");
    }

    public void print() throws InterruptedException
    {
        outerOpt();
    }
}

class ReThread implements Runnable
{
    private CounterShared counterS = null;

    ReThread(CounterShared counterS)
    {
        this.counterS = counterS;
    }

    @Override
    public void run()
    {
        try
        {
            counterS.print();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

public class _4_ReentrantLockDemoWithCutomLock
{

    public static void main(String[] args)
    {
        CounterShared obj = new CounterShared(5);
        Thread t1 = new Thread(new ReThread(obj));
        t1.start();
    }

}
