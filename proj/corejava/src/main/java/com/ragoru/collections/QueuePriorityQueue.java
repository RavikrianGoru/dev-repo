package com.ragoru.collections;

import java.util.PriorityQueue;

public class QueuePriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		System.out.println("PriorityQueue: No insertion Order: No sorting: Not allows \'null\': Allows Duplicate Elements");
		
		System.out.println(pq.offer("Ravi"));
		System.out.println(pq.add("Ravi"));
		pq.add("Devi");
		pq.add("Surya");
		pq.add("Lakshmi");
		pq.add("Chinna");
		pq.offer("Surya");
		//System.out.println(pq.add(null));
		//System.out.println(pq.add(null));
		pq.offer("Ravali");
		pq.offer("Meena");
		pq.offer("Manju");
		pq.offer("Raj");
		
//		for(String s: pq)
//			System.out.println(s);
		
		System.out.println(pq.size()+": "+pq);
		
	System.out.println("------------------------------------");
	System.out.println(pq.element());
	System.out.println(pq.element());

	System.out.println(pq);
	
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq);
	
	Student s111=new Student();
	s111.getAge();
		
	}

}
