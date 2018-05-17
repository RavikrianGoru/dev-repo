package javahungry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Comparable interface:
--------------------
 it is used to impose natural ordering (if numbers then 1,2,3 or in alphabetical order 'a','b','c' ) of the class that implements it.
 1) one sorted sequence can be created.
 2) it uses/has "int compareTo(Object)"
 3) belong to java.lang package
 String, Date and Wrapper classes are implemented Comparable interface.
 if any custom class implements comparable interface we need to override compateTo(-) method. 
 we can sort those Arrays.sort() or Collections.sort(-).
 

Comparator interface:
---------------------
 A comparison function, which is used to impose ordering on some collection of objects.
 To allow precisely control over the sort order , Comparators can be passed to a sort method (e.g Collections.sort()).
 1) Many sorted sequences can be created.
 2) it uses/has "int compare(Object, Object)"
 3) belong to java.util package
 
 So in Summary if you want to sort objects based on natural order then use Comparable in Java and 
 if you want to sort on some other attribute of object then use Comparator in Java.
 
*/

class Emp implements Comparable<Emp>
{
	int empId;
	String empName;
	double sal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(Emp emp) {
		return this.empId-emp.getEmpId();
	}
	Emp()
	{
		
	}
	Emp(int empId,String empName,double sal)
	{
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
	
}

public class _8_ComparableVsComparator {

	public static void main(String[] args) {
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(500,"ravi",45000.00));
		al.add(new Emp(100,"kiran",46000.00));
		al.add(new Emp(700,"chinna",35000.00));
		al.add(new Emp(200,"devi",65000.00));
		System.out.println("Before Sort:-------------");
		System.out.println(al);
		
		System.out.println("Sort by Comparable: After Sort:-------------");
		Collections.sort(al);
		System.out.println(al);
		
		
		Collections.sort(  (List<Emp>) al,(e1,e2)->{return e1.getEmpName().compareTo(e2.getEmpName());});
		System.out.println("Sort by Comparable : After Sort by name:-------------");
		System.out.println(al);
		
		
		
		

	}

}
