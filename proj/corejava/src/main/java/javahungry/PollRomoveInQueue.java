package javahungry;

import java.util.PriorityQueue;
import java.util.Queue;

public class PollRomoveInQueue {

	public static void main(String[] args) {

		PriorityQueue<String> pQ=new PriorityQueue<>();
		pQ.add("A");
		pQ.add("B");
		pQ.add("C");
		pQ.add("D");
		pQ.add("E");
		pQ.add("F");
		pQ.add("G");
		

		System.out.println(pQ);
		System.out.println("peek(): retrieve element but doesnt delete "+pQ.peek());
		System.out.println(pQ);
		System.out.println("poll(): head of queue and deletes the head of queue or null if enpty "+pQ.poll());
		System.out.println(pQ);
		System.out.println("remove(): head of queue or nullpinter exception if enpty " +pQ.remove());
		System.out.println(pQ);
		System.out.println(pQ.poll());//----- remove() returns null. if no element is there.
		
		//----- remove() throws NoSuchElementException. if no element is there.
		
	}

}
