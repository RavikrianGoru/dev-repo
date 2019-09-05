package com.udemy.java.thread.producer.consumer.blocking;

import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable
{
    SharedResource shared;

    public Producer(SharedResource shared)
    {
        this.shared = shared;
    }

    public void produceQuestions(int qtn)
    {
        System.out.println("New Question:" + qtn);
        try
        {
            shared.questions.put(qtn);// Inserts the specified element into this queue, waiting if necessary for space to become available.
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        AtomicInteger p = new AtomicInteger(0);
        while (true)
        {
            produceQuestions(p.getAndIncrement());
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
