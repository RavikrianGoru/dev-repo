package interview;


class Emp implements Cloneable
{
	int eid;
	String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Emp()
	{
		
	}
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	protected Emp clone() throws CloneNotSupportedException {
		return (Emp)super.clone();
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	
}
public class CloneObjectDemo {

	public static void main(String[] args) {

		Emp eObj=new Emp(1,"ravi");
		
		System.out.println(eObj.hashCode()+" :"+eObj.toString());
		
		try{
		System.out.println(eObj.hashCode()+" :"+eObj.clone().toString());
		}catch(CloneNotSupportedException ce)
		{
			
		}
	}

}
