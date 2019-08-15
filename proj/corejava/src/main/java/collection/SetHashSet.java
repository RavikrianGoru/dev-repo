package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetHashSet {

	public static void main(String[] args) {
		System.out.println("unique, allows only one \'null\', not in insertion order, can not sort by Collection.sort(-)");

		String arraString[]={"AAA","ZZZ","CCC","YYY","EEE","FFF","ZZZ","AAA",null,null};
		
		
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arraString));
		
		System.out.println("ArrayList: " +al);

		
		
//		HashSet<String> sh4=new HashSet<String>(al);
		
		HashSet<String> uniSet=new HashSet<String>();
		HashSet<String> dupSet=new HashSet<String>();
		uniSet.remove(null);
		for(String s:al)
		{
			if(uniSet.add(s))
			{
				System.out.println("Added to UniSet: "+s);
			}else
			{
				if(dupSet.add(s))
				System.out.println("Added to DupSet: "+s);
			}
		}
		System.out.println("All Elements:"+al);
		System.out.println("All Unic Elements:"+uniSet);
		System.out.println("All Duplicate Elements:"+dupSet);
	}

}
