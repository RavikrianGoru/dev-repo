package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HastableVsSynchronizedMapVsConcurrentHashMap
{
    public final static int THREAD_POOL_SIZE = 5;
    
    public static Map<String, Integer> hashTableObject = null;
    public static Map<String, Integer> hashMapObject = null;
    public static Map<String, Integer> linkedHashMapObject = null;
    public static Map<String, Integer> synchronizedMapObject = null;
    public static Map<String, Integer> concurrentHashMapObject = null;
    
 
    public static void main(String[] args) throws InterruptedException {
 
        System.out.println("Time: Hashtable>SynchronizedMap>LinkedHashMap>HashMap>ConcurrentHashMap");
        // Test with Hashtable Object
        hashTableObject = new Hashtable<String, Integer>();
        crunchifyPerformTest(hashTableObject);
        
        hashTableObject = new HashMap<String, Integer>();
        crunchifyPerformTest(hashTableObject);
        
        hashTableObject = new LinkedHashMap<String, Integer>();
        crunchifyPerformTest(hashTableObject);
        // Test with synchronizedMap Object
        synchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
        crunchifyPerformTest(synchronizedMapObject);
 
        // Test with ConcurrentHashMap Object
        concurrentHashMapObject = new ConcurrentHashMap<String, Integer>();
        crunchifyPerformTest(concurrentHashMapObject);
 
    }
 
    public static void crunchifyPerformTest(final Map<String, Integer> threads) throws InterruptedException {
 
        System.out.println("Test started for: " + threads.getClass());
        long averageTime = 0;
        for (int i = 0; i < 5; i++) {
 
            long startTime = System.nanoTime();
            ExecutorService executroService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
 
            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
                executroService.execute(new Runnable() {
                    @SuppressWarnings("unused")
                    @Override
                    public void run() {
 
                        for (int i = 0; i < 500000; i++) {
                            Integer randomNumber = (int) Math.ceil(Math.random() * 550000);
 
                            // Retrieve value. We are not using it anywhere
                            Integer crunchifyValue = threads.get(String.valueOf(randomNumber));
 
                            // Put value
                            threads.put(String.valueOf(randomNumber), randomNumber);
                        }
                    }
                });
            }
 
            // Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted. Invocation
            // has no additional effect if already shut down.
            // This method does not wait for previously submitted tasks to complete execution. Use awaitTermination to do that.
            executroService.shutdown();
 
            // Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is
            // interrupted, whichever happens first.
            executroService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
 
            long entTime = System.nanoTime();
            long totalTime = (entTime - startTime) / 1000000L;
            averageTime += totalTime;
            System.out.println("500K entried added/retrieved in " + totalTime + " ms");
        }
        System.out.println("For " + threads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
    }
}
