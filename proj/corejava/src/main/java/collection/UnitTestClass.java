package collection;

class StudentClass implements Cloneable
{

	int sNo;
	String sName;
	double aggregate;
	
	public StudentClass(int sNo, String sName, double aggregate) {
		this.sNo=sNo;
		this.sName=sName;
		this.aggregate=aggregate;
	}
	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getAggregate() {
		return aggregate;
	}

	public void setAggregate(double aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sNo+" "+sName+" "+aggregate;
	}
	
	
}

public class UnitTestClass{
		public static void main(String[] args) throws Exception{
			
			/*int arry[]={123,4,1,5,56,773,234,2356,1,32,14,2,443,21,34,201,45,100,125,25,36,285,85,62,49,53,87,723,6,252};
			TreeSet<Integer> ts=new TreeSet<Integer>();
			for(int a:arry)
			{
				ts.add(a);
			}
			System.out.println(ts.headSet(100).last());*/
			StudentClass st1=new StudentClass(10,"ravi", 87.0);
			StudentClass st2=(StudentClass)st1.clone();
			System.out.println(st1);
			System.out.println(st2);
			
			
			int a[]={1,2,3,4,5,6,7,8,9,10};
			
			int b[]=new int[a.length];
			System.arraycopy(a, 0, b, 0, a.length);
			for(int s: b)
				System.out.print(s);
			System.out.println();
			String s=new String("RavikiranGoru");
			System.out.println(s.concat("s5"));
			
		}

}