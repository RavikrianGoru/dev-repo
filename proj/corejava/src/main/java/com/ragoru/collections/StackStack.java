package com.ragoru.collections;

import java.util.Stack;

public class StackStack {

	public static void main(String[] args) {

		Stack<String> stack=new Stack<String>();
		stack.add("Ravi");
		stack.add("Kiran");
		stack.add("Goru");
		stack.add("Deci");
		stack.add("Chinna");
		stack.add("Surya");
		stack.add("Lakshmi");
		stack.add("Ravi");
		stack.add(null);
		stack.add(null);
		stack.add("");
		stack.add("");
		stack.add("Manju");

		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		Student s111=new Student();
		s111.getAge();
		
		
	}

}
