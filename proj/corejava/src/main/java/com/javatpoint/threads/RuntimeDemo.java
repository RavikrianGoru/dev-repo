package com.javatpoint.threads;

public class RuntimeDemo {

	public static void main(String[] args) {

		System.out.println("Runtime Class Demo......");
		Runtime r=Runtime.getRuntime();
		
		System.out.println("Total Memory of JVM:"+r.totalMemory());
		System.out.println("Max memory of JVM:"+r.maxMemory());
		System.out.println("Free memory of JVM:"+r.freeMemory());
		
		RuntimeDemo obj[]=new RuntimeDemo[1000];
		for(int i=0;i<1000;++i)
			obj[i]=new RuntimeDemo();
		System.out.println("Free memory of JVM:"+r.freeMemory());
		System.gc();
		System.out.println("After GC, Free memory of JVM:"+r.freeMemory());
		
		
	}

}
