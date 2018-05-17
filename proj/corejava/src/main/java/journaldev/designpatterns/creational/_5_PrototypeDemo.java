package journaldev.designpatterns.creational;

import java.util.ArrayList;
import java.util.List;

/*
	Prototype:It is one of the creational design pattern.
	Prototype pattern is used when Object creation is costly affairs, requires a lot of time, resources and we have similar object already exist.
	So, It provides a mechanism to copy existed object and allows modification as per our requirements.
	This pattern used java cloning to copy the object.
	
	Prototype Design pattern mandates that the Object which are copying should provide the copying feature. It should not done by any other class.
	We can shallow or Deep copy as per our requirements or design decision.
	
	If Object cloning is not available we have to fetch data from db each and every time.


*/

class Employees implements Cloneable
{
	private List<String> empList;
	
	public Employees()
	{
		empList=new ArrayList<>();
	}
	public Employees(List<String> empList)
	{
		this.empList=empList;
	}
	
	public void loadData()
	{
		//logic to read all employees data from DB
		empList.add("Ravi");
		empList.add("Kiran");
		empList.add("Chinna");
		empList.add("Devi");
		empList.add("Lakshmi");
		empList.add("Surya");
	}
	
	public List<String> getEmpList()
	{
		return empList;
	}
	
	//Overriding clone() method for deep copy of the  employee list.  
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ArrayList<String> temp =new ArrayList<>();
		for(String each: this.getEmpList())
		{
			temp.add(each);
		}
		return new Employees(temp);
//		return empList;// Shallow copy.
	}
}
public class _5_PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emp=new Employees();
		emp.loadData();
		System.out.println(emp.getEmpList());
		
		Employees emp1=(Employees) emp.clone();
		emp1.getEmpList().add("Kumar");
		System.out.println(emp1.getEmpList());
		
		Employees emp2=(Employees) emp.clone();
		emp2.getEmpList().remove("Kiran");
		System.out.println(emp2.getEmpList());
	}

}
