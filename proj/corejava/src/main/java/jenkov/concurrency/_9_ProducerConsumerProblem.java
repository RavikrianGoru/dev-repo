package jenkov.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Order
{
    public Order(int ordNo, String ordName)
    {
        this.orderNo = ordNo;
        this.OrderItem = ordName;
    }

    private int orderNo;
    private String OrderItem;

    public int getOrderNo()
    {
        return orderNo;
    }

    public void setOrderNo(int orderNo)
    {
        this.orderNo = orderNo;
    }

    public String getOrderItem()
    {
        return OrderItem;
    }

    public void setOrderItem(String orderItem)
    {
        OrderItem = orderItem;
    }

    @Override
    public String toString()
    {
        return "Order [orderNo=" + orderNo + ", OrderItem=" + OrderItem + "]";
    }
}

class Producer extends Thread
{
    Queue<Order> sharedQueue = null;
    int maxOrderSize;

    public Producer(Queue<Order> sharedQueue, int maxOrderSize, String name)
    {
        super(name);
        this.sharedQueue = sharedQueue;
        this.maxOrderSize = maxOrderSize;
    }

    @Override
    public void run()
    {
        Random random = new Random();
        while (true)
        {
            synchronized (sharedQueue)
            {
                while (sharedQueue.size() == maxOrderSize)// use while loop instead of if condition:
                {
                    try
                    {
                        System.out.println("Producer thread is waiting for consumer to consume items from sharedQueue as it it full.");
                        sharedQueue.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                int num = random.nextInt(100);
                sharedQueue.add(new Order(num, "Item-" + num));
                sharedQueue.notifyAll();// we can use  sharedQueue.notify()
            }
        }
    }
}

class Consumer extends Thread
{
    Queue<Order> sharedQueue = null;
    int maxOrderSize;

    public Consumer(Queue<Order> sharedQueue, int maxOrderSize, String name)
    {
        super(name);
        this.sharedQueue = sharedQueue;
        this.maxOrderSize = maxOrderSize;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (sharedQueue)
            {
                while (sharedQueue.isEmpty())// use while loop insted if condition here.
                {
                    System.out.println("Consumer is waiting for Producer to place/produce orders as shareQueur is empty");
                    try
                    {
                        sharedQueue.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Consumed Order is " + sharedQueue.poll());// poll() method on queue is reads and removes the element from queue.
                sharedQueue.notifyAll();//we can use notify()
            }
        }
    }
}

public class _9_ProducerConsumerProblem
{

    public static void main(String[] args)
    {
        System.out.println("How to use wait() and notify()/notifyAll(): Demo by Producer&Consumer Problem.");
        Queue<Order> sharedQueue = new LinkedList<>();
        int maxOrderSize = 10;

        Producer producer = new Producer(sharedQueue, maxOrderSize, "PRODUCER");
        Consumer consumer = new Consumer(sharedQueue, maxOrderSize, "CONSUMER");

        producer.start();
        consumer.start();

    }

}
