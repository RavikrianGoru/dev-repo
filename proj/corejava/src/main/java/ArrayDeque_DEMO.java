import java.util.ArrayDeque;

class Book {
	int id;
	String name;
	int quantity;

	public Book(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}

}

public class ArrayDeque_DEMO {

	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<String>();

		adq.add("ravi1");
		adq.add("kiran");
		adq.add("rupa");
		adq.add("arjun");
		System.out.println("First in First Out manner:" + adq);
		adq.addFirst("rupaF");
		adq.addLast("rupaL");

		adq.offer("avinash");
		adq.offer("balu");
		adq.offerFirst("baluF");
		adq.offerLast("baluL");
		System.out.println(adq);

		adq.addFirst("hi");
		adq.addLast("bye");
		System.out.println(adq);

		System.out.println(adq.element());

		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.getFirst());
		System.out.println(adq.getLast());
		System.out.println(adq);

		System.out.println(adq.poll());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		System.out.println(adq);

		System.out.println("-------------------ud obj--------------");
		ArrayDeque<Book> adqb = new ArrayDeque<Book>();
		adqb.add(new Book(10, "ravi10", 100));
		adqb.add(new Book(1, "ravi", 10));
		adqb.add(new Book(10, "ravi10", 100));
		System.out.println(adqb);

	}

}
