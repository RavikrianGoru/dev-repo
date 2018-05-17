package javahungry;

import java.util.HashMap;
/*

1) What classes should i prefer to use a key in HashMap in java or Custom class obj in any Set? 
 we should prefer String, Integer, Long, Double, Float, Short and any other wrapper class. 
 Reason behind using them as a key is that they override equals() and hashCode() method and recommended to key class is final., 
 we need not to write any explicit code for overriding equals() and hashCode() method in java.

*/
class Student
{
	Integer sId;
	String sName;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	
	@Override
	public int hashCode() {
		return ((sId==null?0:sId.hashCode())+(sName==null?0:sName.hashCode()));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;

		Student student=(Student)obj;
		return ((this.sId==student.getsId() || this.sId.equals(student.getsId())) && (this.sName==student.getsName() || this.sName.equals(student.getsName())));
	}
	
}
public class CustomClassAsKeyInHashMap {

	public static void main(String[] args) {

		System.out.println("If we want to use Custom Class as Key in HashMap we need to override equals() and hashCode() methods.");

		HashMap<Student,String> hm=new HashMap<>();
		
	}

}
