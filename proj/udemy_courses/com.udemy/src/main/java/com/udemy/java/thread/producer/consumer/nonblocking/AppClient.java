package com.udemy.java.thread.producer.consumer.nonblocking;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AppClient
{

    public static void main(String[] args)
    {
        SharedResource shared = new SharedResource(new ArrayList<Integer>(), new AtomicInteger(10));
        Thread t1 = new Thread(new Producer(shared));
        Thread t2 = new Thread(new Consumer(shared));
        t1.start();
        t2.start();
    }

}
