package jenkov.concurrency;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class LinkedBlockingQueueProducer implements Runnable
{
    protected BlockingQueue<String> blockingQueue;
    final Random random = new Random();

    public LinkedBlockingQueueProducer(BlockingQueue<String> queue)
    {
        this.blockingQueue = queue;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                String data = UUID.randomUUID().toString();
                System.out.println("Put: " + data);
                blockingQueue.put(data);
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}

class LinkedBlockingQueueConsumer implements Runnable
{

    protected BlockingQueue<String> blockingQueue;

    public LinkedBlockingQueueConsumer(BlockingQueue<String> queue)
    {
        this.blockingQueue = queue;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                String data = blockingQueue.take();
                System.out.println(Thread.currentThread().getName()
                        + " take(): " + data);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}

public class _12_LikedBlockingQueue
{
    /*
     * 
     * LinkedBlockingQueue order elements first-in-first-out (FIFO). With respect to bounds of the LinkedBlockingQueue, it stands in between
     * ArrayBlockingQueue and DelayQueue.
     * 
     * ArrayBlockingQueue is a bounded collection. DelayQueue is an unbounded collection. LinkedBlocingQueue is an optionally bounded collection.
     * 
     * LinkeBlockingQueue has an aditional constructor which provides the capability to instantiate with fixed capacity. If not the other regular
     * argument-less constructor creates instance with Integer.MAX_VALUE capacity.
     * 
     * 
     */
    public static void main(String[] args)
    {
        final BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>();

        //Producer
        new Thread(new LinkedBlockingQueueProducer(linkedBlockingQueue)).start();
        //Consumers
        new Thread(new LinkedBlockingQueueConsumer(linkedBlockingQueue)).start();
        new Thread(new LinkedBlockingQueueConsumer(linkedBlockingQueue)).start();
    }

}
