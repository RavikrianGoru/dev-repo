package collection;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {

	public static void main(String[] args) {

		
		LinkedHashSet<String > lhs=new LinkedHashSet<String>();
		
		System.out.println("unique, insertions order, Allows only one null,Can not sort by Collection.sort(-).");
		System.out.println(lhs.add("Ravi"));
		lhs.add("Devi");
		lhs.add("Chinna");
		lhs.add("Lakshmi");
		lhs.add("Surya");
		System.out.println(lhs.add("Ravi"));
		lhs.add("Manju");
		lhs.add("Meena");
		lhs.add("Anu");
		System.out.println(lhs.add(""));
		System.out.println(lhs.add(""));
		System.out.println(lhs.add(null));
		System.out.println(lhs.add(null));
		lhs.add("Shabana");
		lhs.add("Rekha");
		System.out.println(lhs);

		Student s111=new Student();
		s111.getAge();
//		for(String s:lhs)
//		{
//			System.out.println(s);
//		}
	}

}
