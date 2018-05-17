package interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OrderingElementsOfString {

	public static void main(String[] args) {

		String s = "RAfdfdgeurytrcGYRAITTISBXVBKDFW34585347541043894MA";
//		byte[] bArray = s.getBytes();
//		Arrays.sort(bArray);
//		 for(byte b:bArray)
//		 System.out.println((char)b);
	
		char[] cArray=s.toCharArray();
		Arrays.sort(cArray);
		for(char c:cArray)
			System.out.println(c);
		
		Set<Character> set=new TreeSet<Character>();
		for(char c:cArray)
			set.add(c);
		System.out.println(set);
	}


}
