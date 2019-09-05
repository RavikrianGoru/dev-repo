package com.udemy.java.thread.producer.consumer.blocking;

public class Consumer implements Runnable
{
    SharedResource shared;

    public Consumer(SharedResource shared)
    {
        this.shared = shared;
    }

    public void answerQuestions()
    {
        try
        {
            System.out.println("Answered for question:" + shared.questions.take());// use take() method as it wait if no element is available in queue
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        while (true)
        {
            answerQuestions();
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
