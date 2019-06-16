import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class Hashtable_Demo {

	public static void main(String[] args) {
		Hashtable<Integer,Integer> h =new Hashtable<>();
		h.put(1,100);
		h.put(12,140);
		h.put(10,300);
		h.put(6,190);
		System.out.println(h);
		Map<Integer,Integer> hm=h.entrySet().stream().filter(e->{return e.getValue()<=150;}).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		System.out.println(hm);
		
		System.out.println(h.getOrDefault(15, 1));
		
	}
}
