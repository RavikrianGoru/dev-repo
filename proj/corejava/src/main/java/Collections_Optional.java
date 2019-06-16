import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class Tran
{
	int id;
	String name;
	public Tran(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Tran [id=" + id + ", name=" + name + "]";
	}
	
}
public class Collections_Optional {

	public static void main(String[] args) {
		Optional<String> oS= Optional.of("Windows");
		
		System.out.println(oS);
		System.out.println(oS.get());
		System.out.println(oS.orElse("Linux"));
		System.out.println(Optional.empty());

		List<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("Kave");
		ll.add("Bali");
		ll.add("Devi");
		ll.add("Rudra");
		System.out.println(ll);
					Collections.sort(ll);
		System.out.println(ll);
					Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
		
		
		HashMap<String,Integer> hm =new HashMap<>();
		hm.put("ravi", 34);
		hm.put("kavi", 94);
		hm.put("chinna",834);
		hm.put("devi", 39);
		hm.put("balu", 384);
		System.out.println(hm);
		
		System.out.println(hm.entrySet().stream().filter((e)->e.getValue()%2==0).count());
		
		ArrayList<Tran> al=new ArrayList<>();
		al.add(new Tran(1,"ravi"));
		al.add(new Tran(10,"Davi"));
		al.add(new Tran(3,"Balu"));
		System.out.println(al);
		Collections.sort((List<Tran>) al, (t1,t2)->{return t1.getId()-t2.getId();});
		System.out.println(al);
		al.add(new Tran(6,null));
		System.out.println(al);
		Comparator<Tran> com=Comparator.comparing(Tran::getName,Comparator.nullsFirst(String::compareTo));
		Collections.sort(al,com);
		System.out.println(al);
		
	}

}
