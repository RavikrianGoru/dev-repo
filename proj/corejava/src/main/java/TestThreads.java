import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.omg.Messaging.SyncScopeHelper;

public class TestThreads {

	public static void main(String[] args) throws TimeoutException, InterruptedException, ExecutionException {
		final ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.unlock();

		final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock(true);
		rwLock.readLock().lock();
		rwLock.readLock().unlock();
		
		rwLock.writeLock().lock();
		rwLock.writeLock().unlock();
		
		AtomicInteger at = new AtomicInteger(0);

		Runnable task = () -> {
			System.out.println("Thread is started......");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread is finished its execution.");
		};

		Thread t = new Thread(task);
		t.start();

		ExecutorService es = Executors.newSingleThreadExecutor();
		es = Executors.newFixedThreadPool(5);
		es.submit(() -> {
			System.out.println("Thread 1 started");
			System.out.println("Thread 1 ended");
		});
		es.submit(() -> {
			System.out.println("Thread 2 started");
			System.out.println("Thread 2 ended");
		});

		try {
			System.out.println("Attempt to stop executor.....");
			es.shutdown();
			es.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {
			System.err.println("tasks Interrupted");
		} finally {
			if (!es.isTerminated()) {
				System.err.println("cancel all non finished tasks.....");
			}
			es.shutdownNow();
			System.out.println("shutdown is finished.");

		}

		// Callable Feature
		Callable<Integer> task1 = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		};

		ExecutorService es1 = Executors.newFixedThreadPool(1);
		Future<Integer> future = es1.submit(task1);
		
		System.out.println(future.isDone());
		System.out.println(future.isCancelled());
		try {
			System.out.println(future.get(1, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(future.isDone());

		ExecutorService es2 = Executors.newWorkStealingPool();

		List<Callable<String>> callables1 = Arrays.asList(() -> "task1", () -> "task2", () -> "task3", () -> "task4");

		List<Callable<Integer>> callables2 = new ArrayList<>();
		callables2.add(() -> 1);
		callables2.add(() -> 2);
		callables2.add(() -> 3);
		callables2.add(() -> 4);
		callables2.add(() -> 5);

		try {
			es2.invokeAll(callables1).stream().map(f -> {
				try {
					return f.get();
				} catch (Exception e) {
					throw new IllegalStateException();
				}
			}).forEach((s) -> System.out.println(s));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			es2.invokeAll(callables2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		
		
		Future<Integer> future1 = es1.submit(
				()->{return 5;}
				);
		while(!future1.isDone())
		{
			System.out.println(future1.get());
		}
	}

}
