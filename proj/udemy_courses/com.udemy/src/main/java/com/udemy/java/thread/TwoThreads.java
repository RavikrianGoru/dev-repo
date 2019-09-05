package com.udemy.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Sequence
{
    int value;
    Lock lock = new ReentrantLock();

    // We can make the below method as synchronized method
    public void nextValue()
    {
        lock.lock();
        System.out.println(value++);
        lock.unlock();
    }
}

class Worker extends Thread
{
    Sequence sequence;

    public Worker(Sequence sequence)
    {
        this.sequence = sequence;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            sequence.nextValue();
        }
    }

}

public class TwoThreads
{

    public static void main(String[] args)
    {
        Sequence sequence = new Sequence();
        Worker w1 = new Worker(sequence);
        Worker w2 = new Worker(sequence);
        w1.start();
        w2.start();
    }

}
