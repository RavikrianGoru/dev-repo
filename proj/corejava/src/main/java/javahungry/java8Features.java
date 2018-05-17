package javahungry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Features {

	/*
	 * The major features of the java 8 are as follows : 
	 * 1. Introduction of Optional 
	 * 2. Lambda Expressions & Finctional Interfaces
	 * 3. Default and static methods in interface
	 * 4. HashMap optimization 
	 * 5. forEach() method in Iterable interface forEachRemaining() in Iterator Interface
	 * 6. Java Stream API for Bulk Data Operations on Collections 
	 * 7. Collection, Concurrency and Java IO improvement
	 * 
	 * 
	 * 1.forEach(): We might get ConcurrentModificationException if iterator is
	 * not used properly. Java 8 has introduced forEach method in
	 * java.lang.Iterable interface so that while writing code we focus on
	 * business logic only. forEach method takes java.util.function.Consumer
	 * object as argument, so it helps in having our business logic at a
	 * separate location that we can reuse.
	 * 
	 * 2. Java 8 uses default and static methods heavily in Collection API and
	 * default methods are added so that our code remains backward compatible.
	 * If any class in the hierarchy has a method with same signature, then
	 * default methods become irrelevant.
	 * 
	 * 4. Java Stream API for Bulk Data Operations on Collections A new
	 * java.util.stream has been added in Java 8 to perform filter/map/reduce
	 * like operations with the collection. Stream API will allow sequential as
	 * well as parallel execution. This is one of the best feature for me
	 * because I work a lot with Collections and usually with Big Data, we need
	 * to filter out them based on some conditions.
	 * 
	 * 5. Time API One of the nice addition in Java 8 is the java.time package
	 * that will streamline the process of working with time in java.
	 * 
	 * 
	 * Why do we need new Java Date Time API?
	 * 
	 * Java Date Time classes are not defined consistently, we have Date Class
	 * in both java.util as well as java.sql packages. Again formatting and
	 * parsing classes are defined in java.text package.
	 * 
	 * java.util.Date contains both date and time, whereas java.sql.Date
	 * contains only date. Having this in java.sql package doesn’t make sense.
	 * Also both the classes have same name, that is a very bad design itself.
	 * 
	 * There are no clearly defined classes for time, timestamp, formatting and
	 * parsing. We have java.text.DateFormat abstract class for parsing and
	 * formatting need. Usually SimpleDateFormat class is used for parsing and
	 * formatting.
	 * 
	 * All the Date classes are mutable, so they are not thread safe. It’s one
	 * of the biggest problem with Java Date and Calendar classes. 
	 * 
	 * Date class doesn’t provide internationalization, there is no timezone support. So
	 * java.util.Calendar and java.util.TimeZone classes were introduced, but
	 * they also have all the problems listed above.
	 * 
	 * 
	 * 
	 * Java 8 Date Time API is JSR-310 implementation. 
	 * 
	 * Immutability: All the classes in the new Date Time API are immutable and good for multithreaded environments.
	 * 
	 * Separation of Concerns: The new API separates clearly between human readable date time and machine time (unix timestamp). 
	 * It defines separate classes for Date, Time, DateTime, Timestamp, Timezone etc.
	 * 
	 * Clarity: The methods are clearly defined and perform the same action in all the classes. For example, to get the current instance we have now() method. 
	 * There are format() and parse() methods defined in all these classes rather than having a separate class for them.
	 * 
	 * Utility operations: All the new Date Time API classes comes with methods to perform common tasks, such as plus, minus, format, parsing, getting separate part in date/time etc.
	 * 
	 * Extendable: The new Date Time API works on ISO-8601 calendar system but we can use it with other non ISO calendars as well.
	 */

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 10; i++)
			al.add(i);

		System.out.println(
				"----------------------------------------forEach(Consumer<T>)--------------------------------------------------");
		Iterator<Integer> itr = al.iterator();
		System.out.println("Disp Data by Iterator");
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Disp Data by forEach(--): Anonymus Consumer");
		al.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		System.out.println("Disp Data by forEach(--): Consumer implemented class obj as param");
		myConsumer conObj = new myConsumer();
		al.forEach(conObj);

		System.out.println("Disp Data by forEach(--): Lambda Exp");
		al.forEach((t) -> {
			System.out.println(t);
		});

		System.out.println(
				"-----------------------------------------default and static methods in interface-------------------------------------------------");
		callImplInterFace obj = new callImplInterFace();
		obj.interfaceDefaultMethod();
		obj.interfaceNormalMethod();
		InterFace.interfaceStaticMethod();

		System.out.println(
				"------------------------------Java Stream API for Bulk Data Operations on Collections---------------------------------------");
		System.out.println("Sequential stream: .stream():");
		Stream<Integer> sequentialStream = al.stream();
		Stream<Integer> greaterThan5S = sequentialStream.filter(p -> p > 5);
		greaterThan5S.forEach(p -> System.out.println(p));

		System.out.println("Parallel stream: .parallelStream():");
		Stream<Integer> parallelStream = al.parallelStream();
		Stream<Integer> greaterThan5P = parallelStream.filter(p -> p > 5);
		greaterThan5P.forEach(p -> System.out.println(p));

		System.out.println("Sum of all elements which are greater than 5?");
		System.out.println(al.stream().filter(p -> p > 5).mapToInt(i -> i).sum());
		System.out.println("Sum of all odd numbers?");
		System.out.println(al.stream().filter((p) -> (p % 2 != 0)).mapToInt(i -> i).sum());

		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));

		System.out.println("-----------------------------------Time API--------------------------------------------");

	}

}

class myConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}

interface InterFace {
	void interfaceNormalMethod();

	default void interfaceDefaultMethod() {
		System.out.println("Calling interfaceDefaultMethod(-):");
	}

	static void interfaceStaticMethod() {
		System.out.println("Calling interfaceStaticMethod(-):");
	}

}

class callImplInterFace implements InterFace {

	@Override
	public void interfaceNormalMethod() {
		System.out.println("implemented interfaceNormalMethod() method here.");
	}

}
