package jenkov.concurrency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class _15_LinkedBlockingDequeue
{
    /*
     * The BlockingDeque interface in the java.util.concurrent class represents a deque which is thread safe to put into, and take instances from.
     * 
     * A deque is short for "Double Ended Queue". Thus, a deque is a queue which you can insert and take elements from, from both ends.
     * 
     * A BlockingDeque could be used if threads are both producing and consuming elements of the same queue.
     * 
     * It could also just be used if the producing thread needs to insert at both ends of the queue, and the consuming thread needs to remove from
     * both ends of the queue.
     * 
     * BlockingDeque Extends BlockingQueue
     * 
     * BlockingQueue implementations - LinkedBlockingDeque
     * 
     * 
     */
    public static void main(String[] args) throws InterruptedException
    {
        BlockingDeque<String> deque = new LinkedBlockingDeque<String>();
        deque.add("1");
        deque.add("2");
        System.out.println(deque);// 1,2
        deque.addFirst("3");
        System.out.println(deque);// 3,1,2
        deque.addLast("4");
        System.out.println(deque);// 3,1,2,4
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
        System.out.println(deque.takeFirst());
        System.out.println(deque);
        System.out.println(deque.takeLast());
        System.out.println(deque);

    }

}
