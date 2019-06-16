import java.util.PriorityQueue;

public class PriorityQueue_DEMO {
	public static void main(String[] args) {

//		PriorityQueue: not stored in FIFO
//		- no null
//		- Not thread-safe for thread-safe use java.util.concurrent.PriorityBlockingQueue
//		- Comparable Natural ordering (sorted) & can be custom Comparator order
//
//		- offer(-)		insert element into queue
//		- add(-)		insert element into queue
//
//		- peek()		retrieves head element but does not remove returns null if empty
//		- element()  	retrieves head element but does not remove throws NullPointerException if empty
//		
//		- remove()		removes head element & returns. throws exception if empty.
//		- poll()		removes head element & returns. returns null if empty.

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("ravi1");
		pq.add("kiran");
		pq.offer("avinash");
		pq.offer("balu");
		pq.add("rupa");
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
