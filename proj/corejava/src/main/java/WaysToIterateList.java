import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterateList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
		al.add("Kiran");
		al.add("ravi");
		al.add("Chinna");
		al.add("Ravi");
		
		System.out.println(al);

		al.forEach((each)->{System.out.println(each);});
		al.iterator().forEachRemaining((each)->{System.out.println(each);});
		
		byForEachLoop(al);
		byIterator(al);
		byListIterator(al);
		byForLoop(al);
		
		
	}

	private static void byForLoop(ArrayList<String> al) {
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

	private static void byListIterator(ArrayList<String> al) {
		ListIterator<String> lstItr=al.listIterator();
		while(lstItr.hasNext())
		{
			System.out.println(lstItr.next());
		}
	}

	private static void byForEachLoop(ArrayList<String> al) {
		for(String each: al)
		{
			System.out.println(each);
		}
	}

	private static void byIterator(ArrayList<String> al) {
		Iterator<String> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
