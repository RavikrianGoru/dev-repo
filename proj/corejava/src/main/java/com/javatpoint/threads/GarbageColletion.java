package com.javatpoint.threads;

import exception.FinalizeMethodDemo;

class GCScope
{
    GCScope t;
    static int i = 1;

    public static void main(String args[]) {
        GCScope t1 = new GCScope();
        GCScope t2 = new GCScope();
        GCScope t3 = new GCScope();

        // No Object Is Eligible for GC

        t1.t = t2; // No Object Is Eligible for GC
        t2.t = t3; // No Object Is Eligible for GC
        t3.t = t1; // No Object Is Eligible for GC

        t1 = null;
        // No Object Is Eligible for GC (t3.t still has a reference to t1)

        t2 = null;
        // No Object Is Eligible for GC (t3.t.t still has a reference to t2)

        t3 = null;
        // All the 3 Object Is Eligible for GC (None of them have a reference.
        // only the variable t of the objects are referring each other in a
        // rounded fashion forming the Island of objects with out any external
        // reference)
    }
}

public class GarbageColletion
{

    
    /*
     
     Java has four types of garbage collectors,

    1) Serial Garbage Collector (-XX:+UseSerialGC)
    2) Parallel Garbage Collector/Throughput collector(-XX:+UseParallelGC)-----Default
    3) CMS Garbage Collector(-XX:+UseConcMarkSweepGC)
    4) G1 Garbage Collector
    
    Each of these four types has its own advantages and disadvantages. Most importantly, we the programmers can choose the type of garbage collector to be used by the JVM.
    
    
    1) Serial Garbage Collector
        Serial garbage collector works by holding all the application threads. 
        It is designed for the single-threaded environments. 
        It uses just a single thread for garbage collection. 
        The way it works by freezing all the application threads while doing garbage collection may not be suitable for a server environment. 
        It is best suited for simple command-line programs.

     Turn on the -XX:+UseSerialGC JVM argument to use the serial garbage collector.
     
     2) Parallel Garbage Collector
        Parallel garbage collector is also called as throughput collector. 
        It is the default garbage collector of the JVM. Unlike serial garbage collector, this uses multiple threads for garbage collection. 
        Similar to serial garbage collector this also freezes all the application threads while performing garbage collection.
     
     Turn on the -XX:+UseParallelGC JVM argument to use the Parallel garbage collector.
     
     3) CMS Garbage Collector
        Concurrent Mark Sweep (CMS) garbage collector uses multiple threads to scan the heap memory to mark instances for eviction and then sweep the marked instances. 
        CMS garbage collector holds all the application threads in the following two scenarios only,

        i)  While marking the referenced objects in the tenured generation space.
        ii) if there is a change in heap memory in parallel while doing the garbage collection.
      
      In comparison with parallel garbage collector, 
      CMS collector uses more CPU to ensure better application throughput. 
      If we can allocate more CPU for better performance then CMS garbage collector is the preferred choice over the parallel collector.

     Turn on the XX:+USeParNewGC JVM argument to use the CMS garbage collector.
     
     4) G1 Garbage Collector
        G1 garbage collector is used for large heap memory areas. 
        It separates the heap memory into regions and does collection within them in parallel. 
        G1 also does compacts the free heap space on the go just after reclaiming the memory. 
        But CMS garbage collector compacts the memory on stop the world (STW) situations. 
        G1 collector prioritizes the region based on most garbage first.
        
     Turn on the –XX:+UseG1GC JVM argument to use the G1 garbage collector.
     
     
     Java 8 Improvement
        Turn on the -XX:+UseStringDeduplication JVM argument while using G1 garbage collector. 
        This optimizes the heap memory by removing duplicate String values to a single char[] array. 
        This option is introduced in Java 8 u 20.

     Type of Garbage Collector to run
        
        Option  Description
        -XX:+UseSerialGC    Serial Garbage Collector
        -XX:+UseParallelGC  Parallel Garbage Collector
        -XX:+UseConcMarkSweepGC CMS Garbage Collector
        -XX:ParallelCMSThreads= CMS Collector – number of threads to use
        -XX:+UseG1GC    G1 Gargbage Collector

     GC Optimization Options
        Option  Description
        -Xms    Initial heap memory size
        -Xmx    Maximum heap memory size
        -Xmn    Size of Young Generation
        -XX:PermSize    Initial Permanent Generation size
        -XX:MaxPermSize Maximum Permanent Generation size

Ex: java -Xmx12m -Xms3m -Xmn1m -XX:PermSize=20m -XX:MaxPermSize=20m -XX:+UseSerialGC -jar java-application.jar



     */
    public static void main(String[] args)
    {

        GarbageColletion objs[] = new GarbageColletion[10000];
        for (int i = 0; i < 10000; ++i)
            objs[i] = new GarbageColletion();
        System.out.println("Created 10000 objects");
        for (int i = 0; i < 10000; ++i)
            objs[i] = null;
        System.out.println("Called gc()");
        System.gc();

    }

}
