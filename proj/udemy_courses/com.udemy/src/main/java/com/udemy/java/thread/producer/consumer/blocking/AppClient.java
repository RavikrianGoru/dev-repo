package com.udemy.java.thread.producer.consumer.blocking;

import java.util.concurrent.ArrayBlockingQueue;

public class AppClient
{

    public static void main(String[] args)
    {
        SharedResource shared = new SharedResource(new ArrayBlockingQueue<Integer>(10));
        Thread t1 = new Thread(new Producer(shared));
        Thread t2 = new Thread(new Consumer(shared));
        t1.start();
        t2.start();

    }

}
