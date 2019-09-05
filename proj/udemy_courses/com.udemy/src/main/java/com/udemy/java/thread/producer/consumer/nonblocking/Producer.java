package com.udemy.java.thread.producer.consumer.nonblocking;

public class Producer implements Runnable
{
    SharedResource sharedR = null;

    public Producer(SharedResource sharedR)
    {
        this.sharedR = sharedR;
    }

    public void readQuestions(int questionNo) throws InterruptedException
    {
        synchronized (sharedR.questions)
        {
            while (sharedR.questions.size() == sharedR.LIMIT.get())
            {
                System.out.println("Question have piled up.....wait for answer");
                sharedR.questions.wait();
            }
        }
        synchronized (sharedR.questions)
        {
            System.out.println("New Question:" + questionNo);
            sharedR.questions.add(questionNo);
            Thread.sleep(1000);
            sharedR.questions.notify();
        }
    }

    @Override
    public void run()
    {
        int a = 0;
        while (true)
        {
            try
            {
                readQuestions(a++);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
