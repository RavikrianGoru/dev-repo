import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RK_Test {

	private static final AtomicInteger nextId = new AtomicInteger(0);

	ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return nextId.getAndIncrement();
		}
	};
	private static final ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
		protected Date initialValue() {
			return new Date();
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Executor e = Executors.newCachedThreadPool();
		e = Executors.newFixedThreadPool(5);
		e = Executors.newScheduledThreadPool(5);
		e = Executors.newSingleThreadExecutor();
		e = Executors.newWorkStealingPool(5);

		ExecutorService es = Executors.newSingleThreadExecutor();

		Lock l = new ReentrantLock();
		l.lock();
		l.unlock();

	}

}
