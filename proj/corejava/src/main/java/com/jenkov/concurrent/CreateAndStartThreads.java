package com.jenkov.concurrent;

public class CreateAndStartThreads
{
    public static class MyThread extends Thread
    {
        public MyThread()
        {
        }

        public MyThread(String name)
        {
            this.setName(name);
        }

        @Override
        public void run()
        {
            System.out.println("Hellow world! MyThread by extending Thread class");
            System.out.println(this.currentThread().getName());
            System.out.println(Thread.currentThread().getName());

        }
    }

    public static class MyRunnableThread implements Runnable
    {

        @Override
        public void run()
        {
            System.out.println("Hellow world! MyRunnableThread by implementing  Runnable interface");
            // System.out.println(this.currentThread().getName());//CE
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String[] args)
    {
        // 1. Create Thread No output will be generated
        Thread t = new Thread();
        t.start();

        // 2. Create Thread by extending thread class
        Thread t1 = new MyThread();
        t1.setName("ThreadByClass-One");
        t1.start();

        // 3. Create Thread by implementing Runnable interface
        Thread myRunnable = new Thread(new MyRunnableThread());
        myRunnable.setName("ThreadByInterface-One");
        myRunnable.start();

        System.out.println("-------Creating 10 thread and starting all order of thered exection not determined-----");

        for (int i = 1; i <= 10; i++)
        {
            Thread tn = new MyThread("Ravi-"+i);
            tn.start();
        }
    }

}
