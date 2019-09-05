package com.udemy.java.thread.producer.consumer.nonblocking;

public class Consumer implements Runnable
{
    SharedResource sharedR = null;

    public Consumer(SharedResource sharedR)
    {
        this.sharedR = sharedR;
    }

    public void answerQuestions() throws InterruptedException
    {
        synchronized (sharedR.questions)
        {
            while (sharedR.questions.isEmpty())
            {
                System.out.println("No questions to answer.....wait for questions");
                sharedR.questions.wait();
            }
        }
        synchronized (sharedR.questions)
        {
            Thread.sleep(5000);
            System.out.println("Answered the question:" + sharedR.questions.remove(0));
            sharedR.questions.notify();
        }
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                answerQuestions();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
