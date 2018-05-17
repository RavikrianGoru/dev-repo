package com.javatpoint.threads;

public class GarbageColletion {

	public static void main(String[] args) {
		
		GarbageColletion objs[]=new GarbageColletion[10000];
		for(int i=0;i<10000;++i)
			objs[i]=new GarbageColletion();
		System.out.println("Created 10000 objects");
		for(int i=0;i<10000;++i)
			objs[i]=null;
		System.out.println("Called gc()");
		System.gc();
		
		
	}

}
