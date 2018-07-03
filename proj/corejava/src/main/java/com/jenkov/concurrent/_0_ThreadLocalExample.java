package com.jenkov.concurrent;


class MyRunnable implements Runnable
{
    private ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        threadLocal.set((int)(Math.random()*100));
        System.out.println(threadLocal.get());
        print();
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.err.println("Error: "+e.getMessage());
        }
        print();
    }
    
    public void print()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(threadLocal.get());
    }
}
public class _0_ThreadLocalExample
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main thread start");
        MyRunnable r=new MyRunnable();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Main thread end");
    }

}
