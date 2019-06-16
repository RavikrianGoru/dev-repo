import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class EmpKey {
	int id;
	String firm;

	public EmpKey(int id, String firm) {
		super();
		this.id = id;
		this.firm = firm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	@Override
	public String toString() {
		return "EmpKey [id=" + id + ", firm=" + firm + "]";
	}

}

class EmpVal {
	String name;
	double sal;
	String address;

	public EmpVal(String name, double sal, String address) {
		super();
		this.name = name;
		this.sal = sal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmpVal [name=" + name + ", sal=" + sal + ", address=" + address + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class HashMap_Streams_Lambda {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,"ravi");
		hm.put(4, "kiran");
		hm.put(2, "balu");
		System.out.println(hm);
		System.out.println("--------------- Sort by Key:");
		System.out.println("Use LinkedHashMap for collecting the result to keep the sorting intact.");
		hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey()).forEach((a)->{System.out.println(a);});
		Map<Integer,String> hm1 = hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey()).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(hm1);
		System.out.println("--------------- Sort by Key: reverse order");
		hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		Map<Integer,String> hm2 = hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(), (e1, e2)->e1,LinkedHashMap::new));
		System.out.println(hm2);
		System.out.println("--------------- Sort by Value:");
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		Map<Integer,String> hm3 =hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(hm3);
		System.out.println("--------------- Sort by Value: reverse order");
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach((a)->{System.out.println(a);});
		Map<Integer,String> hm4 = hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(hm4);

		HashMap<EmpKey, EmpVal> empHm = new HashMap<>();
		EmpKey ek1=new EmpKey(1, "IBM");
		EmpKey ek2=new EmpKey(10, "HCL");
		EmpKey ek3=new EmpKey(6, "GL");
		EmpKey ek4=new EmpKey(23, "CTS");
		EmpVal ev1=new EmpVal("ravi", 14000.00d, "Chennai");
		EmpVal ev2=new EmpVal("Chinna", 17000.00d, "Guntur");
		EmpVal ev3=new EmpVal("Devi", 12000.00d, "Vijayawada");
		EmpVal ev4=new EmpVal("Babu", 64000.00d, "Guntur");
		
		empHm.put(ek1, ev1);
		empHm.put(ek2, ev2);
		empHm.put(ek3, ev3);
		empHm.put(ek4, ev4);
		System.out.println(empHm);

		Map<EmpKey,EmpVal> emphm1=empHm.entrySet().stream().sorted(Map.Entry.<EmpKey,EmpVal>comparingByKey((k1,k2)->{return k1.getId()-k2.getId();})).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1, LinkedHashMap::new));
		System.out.println(emphm1);
		Map<EmpKey,EmpVal> emphm2=empHm.entrySet().stream().filter(entry->{return entry.getValue().getSal()>15000.00d;}).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1, LinkedHashMap::new));
		System.out.println(emphm2);
		
	}
}
