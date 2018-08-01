package basics;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadTest {
	@SuppressWarnings("finally")
	public static int tTest() {
		try {
			System.out.println("Hi----Try");
			return 1;
			// System.out.println("Hi----Try");//C.T Error: Unreachable code
		} catch (Exception e) {
			System.out.println("Hi----Catch");
			return 2;
			// System.out.println("Hi----Catch");//C.T Error: Unreachable code
		} finally {
			System.out.println("Hi----finally");
			return 3;
			// System.out.println("Hi----finally");//C.T Error: Unreachable code
		}
		// return 4; //C.T Error: Unreachable
	}

	public static void main(String[] args) {
		AtomicInteger atomicInt = new AtomicInteger(0);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 1000).forEach(i -> executor.submit(atomicInt::incrementAndGet));
		System.out.println(atomicInt.get());

		System.out.println("-------------------------");
		System.out.println("Returned value:" + tTest());
		System.out.println("-------------------------");

	}

}
