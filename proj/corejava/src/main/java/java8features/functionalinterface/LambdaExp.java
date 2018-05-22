package java8features.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
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
	@Override
	public String toString() {
		return "Employee["+this.getId()+","+this.getName()+"]";
	}
	
}
public class LambdaExp {

	public static void main(String[] args) {

		List<String> listString=Arrays.asList("ravi","devi","chinna","lakshmi","surya");
		System.out.println("before sort:"+listString);
		/*
		//creating Anonymous
		Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String  s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		*/
		
		//using Lambda Expression
		Collections.sort(listString,(s1,s2)-> s1.compareTo(s2));
		System.out.println(listString);
		
		
		List<Employee> listEmployee =Arrays.asList(new Employee(1,"ravi"),new Employee(2,"devi"),new Employee(3,"chinna"),new Employee(4,"lakshmi"),new Employee(5,"surya"));
		System.out.println(listEmployee);
		Collections.sort(listEmployee,(e1,e2)->e1.name.compareTo(e2.name));		
		System.out.println(listEmployee);
	}

}
