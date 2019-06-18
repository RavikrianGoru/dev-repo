package jenkov.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.management.IntrospectionException;

class Producer1 implements Runnable
{
    BlockingQueue<String> queue = null;
    int max;

    Producer1(BlockingQueue<String> queue, int max)
    {
        this.queue = queue;
        this.max = max;
    }

    
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                System.out.println("Producer: producing....");
                queue.put("1");
                System.out.println(queue);
                queue.put("2");
                System.out.println(queue);
                queue.put("3");
                System.out.println(queue);
                queue.put("4");
                System.out.println(queue);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            // synchronized (queue)
            // {
            // while (queue.size() == max)
            // {
            // try
            // {
            // System.out.println("Producer thread is waiting for consumer to consume items from queue as it it full.");
            // queue.wait();
            // }
            // catch (InterruptedException e)
            // {
            // e.printStackTrace();
            // }
            // }
            // try
            // {
            // queue.put("Order:" + System.currentTimeMillis());
            // System.out.println(queue);
            // Thread.sleep(1000);
            // }
            // catch (InterruptedException e)
            // {
            // e.printStackTrace();
            // }
            // queue.notifyAll();
            // }
        }
    }

}

class Consumer1 implements Runnable
{
    BlockingQueue<String> queue = null;
    int max;

    Consumer1(BlockingQueue<String> queue, int max)
    {
        this.queue = queue;
        this.max = max;
    }

    @Override
    public void run()
    {
        while (true)
        {

            try
            {
                System.out.println("Consumer consuming....");
                System.out.println(queue.take());
                System.out.println(queue);
                Thread.sleep(1000);
                System.out.println(queue.take());
                System.out.println(queue);
                Thread.sleep(1000);
                System.out.println(queue.take());
                System.out.println(queue);
                Thread.sleep(1000);
                System.out.println(queue.take());
                System.out.println(queue);
                Thread.sleep(1000);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            // synchronized (queue)
            // {
            // while(queue.isEmpty())
            // {
            // System.out.println("Consumer thread is waiting for Producer to produce items in queue as it it empty.");
            // try
            // {
            // queue.wait();
            // }
            // catch (InterruptedException e)
            // {
            // e.printStackTrace();
            // }
            // }
            //
            // try
            // {
            // System.out.println(queue.take());
            // System.out.println(queue);
            // Thread.sleep(1000);
            // }
            // catch (InterruptedException e)
            // {
            // e.printStackTrace();
            // }
            // queue.notifyAll();
            // }
        }
    }

}

public class _10_ArrayBlockingQueueInterfaceDemo
{
    /*
      
      1) The Java BlockingQueue interface in the java.util.concurrent package represents a queue which is thread safe to put into, and take instances
      from. : Null not allowed(Throws NullPointerException) : Thread-safe on put and retrieve operations.
      
      Usage: BockingQueue} can safely be used with multiple producers and multiple consumers.

      BlockingQueue – an interface that is at the base of all Queue based concurrent collections. 
          While adding an element to a BlockingQueue, if there is no space it can wait till it becomes available and when retrieving, 
          it will wait till an element is available if it is empty

      Implementations of the BlockingQueue interface (in Java 6):
      
      ArrayBlockingQueue 
      DelayQueue 
      LinkedBlockingQueue 
      PriorityBlockingQueue 
      SynchronousQueue
     
      1) ArrayBlockingQueue is a bounded, blocking queue that stores the elements internally in an array.
          ArrayBlockingQueue<>(10);
          
          That it is bounded means that it cannot store unlimited amounts of elements.
          There is an upper bound on the number of elements it can store at the same time. 
          You set the upper bound at instantiation time, and after that it cannot be changed.
      
      ArrayBlockingQueue – a blocking queue class based on bounded Java Array. Once instantiated, cannot be resized.

      SynchronousQueue – a blocking queue class with capacity of zero always.
      
      PriorityBlockingQueue – a priority queue based blocking queue. It is an unbounded concurrent collection.
      
      LinkedBlockingQueue – an optionally bounded Java concurrent collection. Orders elements based on FIFO order.
      
      DelayQueue – a queue where only delay expired elements can be taken out. Its an unbounded concurrent collection.
      
      BlockingDeque – an interface that extends BlockingQueue and adds the operations of Deque.
      
      LinkedBlockingDeque – an implementation class of BlockingDequeue.
      
      TransferQueue – a Java concurrent collection interface that extends BlockingQueue and adds method where the producer will wait for the consumer to receive elements.
      
      LinkedTransferQueue – an implementation class of TransferQueue.
      
      ConcurrentMap – a Java concurrent collection interface and a type of Map which provides thread safety and atomicity guarantees.
      
      ConcurrentHashMap – an implementation class of ConcurrentMap.
      
      ConcurrentNavigableMap – a Java concurrent collection interface that extends ConcurrentMap and adds operations of NavigableMap.
      
      ConcurrentSkipListMap – an implementation class of ConcurrentNavigableMap.
      
      
     */
    public static void main(String[] args)
    {
        int max = 10;
        BlockingQueue<String> bqueue = new ArrayBlockingQueue<>(max);

        new Thread(new Producer1(bqueue, max)).start();
        new Thread(new Consumer1(bqueue, max)).start();

    }

}
