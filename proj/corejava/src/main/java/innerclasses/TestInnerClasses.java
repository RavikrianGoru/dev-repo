package innerclasses;

import java.util.PriorityQueue;

public class TestInnerClasses {

	public static void main(String[] args) {

		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("A");
		pq.add("B");
//		pq.add("C");
//		pq.add("D");
//		pq.add("E");
		System.out.println(pq);
		
		
		System.out.println(pq.peek()+"------------>returns 1st element every time or null if empty queue");
		System.out.println(pq.peek()+"------------>returns 1st element every time or null if empty queue");
		System.out.println(pq.element()+"------------>returns 1st element every time or NoSuchElementException if empty queue");
		System.out.println(pq.element()+"------------>returns 1st element every time or NoSuchElementException if empty queue");
		
		System.out.println(pq.poll()+"--------------->removes the fist element or null if empty");
		System.out.println(pq.poll()+"--------------->removes the fist element or null if empty");
		System.out.println(pq.poll()+"--------------->removes the fist element or null if empty");
		System.out.println(pq.remove()+"-------------> removes the first element or NoSuchElementException if empty");
		
		
	}		
}
