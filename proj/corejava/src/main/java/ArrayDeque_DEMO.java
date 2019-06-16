import java.util.ArrayDeque;

public class ArrayDeque_DEMO {

	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<String>();

		adq.add("ravi1");
		adq.add("kiran");
		adq.add("rupa");
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

	}

}
