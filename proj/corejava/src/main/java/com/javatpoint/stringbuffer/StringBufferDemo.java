package com.javatpoint.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		/*
		StringBuffer is mutable(changeable). as well as Thread-safe(one thread can access at a time).
		 */
		
		StringBuffer sbuff1=new StringBuffer();
		StringBuffer sbuff2=new StringBuffer("Ravi");
		
		sbuff1.append("Hi,");
		sbuff1.insert(3, "Ravi");
		System.out.println(sbuff1);
		sbuff1.delete(0, 3);
		System.out.println(sbuff1);
		sbuff1.replace(0, 4, "RAVI");
		System.out.println(sbuff1);
		sbuff1.reverse();
		System.out.println(sbuff1);
		sbuff1.insert(0, "UROGNARIK");
		System.out.println(sbuff1);
		sbuff1.delete(0, 4);
		System.out.println(sbuff1);
	}

}
