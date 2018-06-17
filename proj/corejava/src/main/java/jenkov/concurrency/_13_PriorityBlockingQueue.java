package jenkov.concurrency;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class PriorityBlockingQueueProducer implements Runnable
{

    protected BlockingQueue<String> blockingQueue;
    final Random random = new Random();

    public PriorityBlockingQueueProducer(BlockingQueue<String> queue)
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

class PriorityBlockingQueueConsumer implements Runnable
{

    protected BlockingQueue<String> blockingQueue;

    public PriorityBlockingQueueConsumer(BlockingQueue<String> queue)
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

public class _13_PriorityBlockingQueue
{

    /*
     * 
     * PriorityBlockingQueue is an unbounded collection. 
     * Ordering of elements in the PriorityBlockingQueue is done same as in PriorityQueue.
     * 
     * All elements inserted into the PriorityBlockingQueue must implement the java.lang.Comparable interface
     * The elements thus order themselves according to whatever priority you decide in your Comparable implementation.
     * 
     * The Iterator does not guarantee to iterate the elements in priority order. 
     *  
     * We should see PriorityBlockingQueue as a PriorityQueue with added operations for blocking retrieval. 
     * All the rules of PriorityQueue applies here like elements are ordered based on their priority level among the elements.
     * 
     * 
     * 
     */
    public static void main(String[] args)
    {
        final BlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<String>();

        PriorityBlockingQueueProducer queueProducer = new PriorityBlockingQueueProducer(priorityBlockingQueue);
        new Thread(queueProducer).start();

        PriorityBlockingQueueConsumer queueConsumer1 = new PriorityBlockingQueueConsumer(priorityBlockingQueue);
        new Thread(queueConsumer1).start();

        PriorityBlockingQueueConsumer queueConsumer2 = new PriorityBlockingQueueConsumer(priorityBlockingQueue);
        new Thread(queueConsumer2).start();
    }

}
