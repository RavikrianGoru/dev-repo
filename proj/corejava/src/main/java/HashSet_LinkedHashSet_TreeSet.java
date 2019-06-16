import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	int id;
	String name;
	double sal;

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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Student(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public int compareTo(Student o) {
		return this.getId() - o.getId();
	}

}

public class HashSet_LinkedHashSet_TreeSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Ravi");
		hs.add("kavi");
		hs.add("Ravi");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		hs.removeIf(each -> each != null && each.contains("Kumar"));
		hs.removeIf(each -> each != null && !each.endsWith("vi"));
		System.out.println(hs);

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Ravi");
		lhs.add("lavi");
		lhs.add("Ravi");
		lhs.add("chinna");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);

		TreeSet<String> ts = new TreeSet<>();
		ts.add("Ravi");
		ts.add("Kiran");
		ts.add("Ram");
		ts.add("Ravi");
		ts.add("Ravali");
		ts.add("Raj");
		System.out.println(ts);
		System.out.println(ts.ceiling("Ra"));// equal or closest greater element or null if no such element in TreeSet
		System.out.println(ts.ceiling("Va"));// equal or closest greater element or null if no such element in TreeSet

		System.out.println(ts.ceiling("Ra"));// equal or closest least element or null if no such element in TreeSet
		System.out.println(ts.ceiling("Va"));// equal or closest least element or null if no such element in TreeSet

		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial Set: " + set);
		System.out.println("Reverse Set: " + set.descendingSet());
		System.out.println("Head Set: " + set.headSet("C", true));
		System.out.println("SubSet: " + set.subSet("A", false, "E", true));
		System.out.println("TailSet: " + set.tailSet("C", false));

		Student s1 = new Student(1, "ravikiran1", 15500.00d);
		Student s2 = new Student(12, "ravibabu12", 15080.00d);
		Student s3 = new Student(7, "ravikumar7", 15009.00d);
		Student s4 = new Student(10, "raviprakash10", 15340.00d);
		Student s5 = new Student(10, "raviprakash10", 15340.00d);

		TreeSet<Student> t = new TreeSet<>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		System.out.println(t);

	}

}
