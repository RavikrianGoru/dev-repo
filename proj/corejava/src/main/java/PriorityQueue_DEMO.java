import java.util.PriorityQueue;

class Emp1 implements Comparable<Emp1>
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Emp1 o) {
		return 0;
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + "]";
	}
	
}
public class PriorityQueue_DEMO {
	public static void main(String[] args) {

//		PriorityQueue: not stored in FIFO
//		- no null
//		- Not thread-safe for thread-safe use java.util.concurrent.PriorityBlockingQueue
//		- Comparable Natural ordering (sorted) & can be custom Comparator order
//
//		- offer(-)		insert element into queue
//		- add(-)		insert element into queue
//
//		- peek()		retrieves head element but does not remove returns null if empty
//		- element()  	retrieves head element but does not remove throws NullPointerException if empty
//		
//		- remove()		removes head element & returns. throws exception if empty.
//		- poll()		removes head element & returns. returns null if empty.

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("ravi1");
		pq.add("kiran");
		pq.add("kiran");
		pq.offer("avinash");
		pq.offer("balu");
		pq.add("rupa");
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		Emp1 e1= new Emp1(1,"ravi");
		Emp1 e2= new Emp1(1,"ravi");
		Emp1 e3= new Emp1(5,"kiarn");
		Emp1 e4= new Emp1(8,"Goru");
		
		PriorityQueue<Emp1> peq =new PriorityQueue<Emp1>();
		peq.add(e1);
		peq.add(e2);
		peq.add(e2);
		peq.add(e3);
		peq.add(e4);
//		peq.add(null);
		
		System.out.println(peq);
	}

}
