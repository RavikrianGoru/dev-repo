package jenkov.concurrency;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayElementOrder implements Delayed
{

    private String order;
    private long delay;

    public DelayElementOrder(String order, long delay)
    {
        this.order = order;
        this.delay = System.currentTimeMillis() + delay;// delay time is added with currentTimeMillis
    }

    @Override
    public int compareTo(Delayed o)
    {
        return (int) (this.delay - ((DelayElementOrder) o).delay);
    }

    @Override
    public long getDelay(TimeUnit unit)
    {
        long diff = delay - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString()
    {
        return "DelayElementOrder [order=" + order + ", delay=" + delay + "]";
    }

}

class DelayQueueProducer implements Runnable
{

    BlockingQueue<DelayElementOrder> queue=null;
    final Random random=new Random();
    
    DelayQueueProducer(BlockingQueue<DelayElementOrder> queue)
    {
        this.queue=queue;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            int delay=random.nextInt();
            String orderName=UUID.randomUUID().toString();
            DelayElementOrder order=new DelayElementOrder(orderName, delay);
            System.out.println("Produced element:"+order);
            try
            {
                queue.put(order);
                Thread.currentThread().sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}

class DelayQueueConsumer implements Runnable
{

    BlockingQueue<DelayElementOrder> queue=null;
    final Random random=new Random();
    
    DelayQueueConsumer(BlockingQueue<DelayElementOrder> queue)
    {
        this.queue=queue;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                DelayElementOrder order=queue.take();
                System.out.println("Consumerd element :"+ order);
                Thread.currentThread().sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}

public class _11_DelayQueue
{
    /*
     * DelayedQueue is unbounded collection. The BlockingQueue methods are implemented in such a way that only delay expired elements can be taken out
     * of the queue.
     * 
     * If the delay has not expired for any elements in the queue then the poll method will return null.
     * 
     * Expiry of an element is decided using the getDelay() method of the element. When it returns a value less than or equal to zero that element is
     * considered to be expired.
     * 
     * size() method returns the overall count of elements in the queue which includes the expired elements also.
     * 
     * iterator() method of this class does not guarantee traversal of the queue in any particular order.
     * 
     */

    public static void main(String[] args)
    {
        BlockingQueue<DelayElementOrder> queue = new DelayQueue<>();
        new Thread(new DelayQueueProducer(queue)).start();
        new Thread(new DelayQueueConsumer(queue)).start();
        
    }

}
