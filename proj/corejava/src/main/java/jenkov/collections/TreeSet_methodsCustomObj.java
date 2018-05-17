package jenkov.collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class Emp
{
	
	public Emp()
	{
		super();
	}
	
	public Emp(int empno, String ename, float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	int empno;
	String ename;
	float sal;
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + Float.floatToIntBits(sal);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Float.floatToIntBits(sal) != Float.floatToIntBits(other.sal))
			return false;
		return true;
	}
	
}


public class TreeSet_methodsCustomObj {
	public static void main(String args[])
	{
		
		TreeSet<String> set=new TreeSet<>();
		set.add("Abc");
		set.add("Bcd");
		set.add("Cde");
		set.add("Def");
		set.add("Efgf");
		System.out.println(set);
		System.out.println("Display Elements of TreeSet in decending order:descendingIterator()---while-loop");
		Iterator itr=set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Display Elements of TreeSet in decending order:descendingSet()----for-each loop");
		for(String str:set.descendingSet())
		{
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Collections.Stream.filer(-),forEah(-) Demo String Type Collection");
		set.stream().filter((t)->t.startsWith("B")).forEach(System.out::println);
		System.out.println("Collections.Stream.map(-),forEah(-) Demo String Type Collection");
		set.stream().map((t)->t.toUpperCase()).forEach(System.out::println);
		System.out.println("count :"+set.stream().filter((t)->t.startsWith("B")).count());
		
		NavigableSet<Integer> nSet=new TreeSet<>();
		nSet.add(2);
		nSet.add(1);
		nSet.add(5);
		nSet.add(3);
		nSet.add(6);
		nSet.add(4);
		nSet.add(9);
		nSet.add(8);
		nSet.add(7);
		System.out.println(nSet);
		
		System.out.println("headSet(3)"+nSet.headSet(3));
		System.out.println("headSet(3,true)"+nSet.headSet(3, true));
		System.out.println("tailSet(7)"+nSet.tailSet(7));
		System.out.println("tailSet(7,true)"+nSet.tailSet(7,false));
		
		System.out.println("ceiling(5)"+nSet.ceiling(5));
		System.out.println("floor(5)"+nSet.floor(5));
		
		System.out.println("subSet(1, 5)"+nSet.subSet(1, 5));
		System.out.println("subSet(1,true, 6,true)"+nSet.subSet(1,true, 6,true));
		
		System.out.println("higher(6)"+nSet.higher(6));
		System.out.println("lower(6)"+nSet.lower(6));
		
		System.out.println("Collections.Stream.filer Demo for Integer Type Collection");
		nSet.stream().filter((t)->t.equals(4)).forEach(System.out::println);
		

		System.out.println("Passing Custom object in TreeSet sorting by Comparator -> compare(-,-)");
		
		TreeSet<Emp> ts1=new TreeSet<Emp>((e1,e2)->{ return e1.ename.compareTo(e2.ename);});
		ts1.add(new Emp(101,"ravi",23000));
		ts1.add(new Emp(13,"aravi",23000));
		ts1.add(new Emp(131,"ravi",23000));
		ts1.add(new Emp(601,"cravi",23000));
		ts1.add(new Emp(431,"ravi",23000));
		ts1.add(new Emp(41,"dravi",23000));
		System.out.println(ts1);
		
	}

}
