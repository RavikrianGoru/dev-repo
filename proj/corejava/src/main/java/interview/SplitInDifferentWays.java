package interview;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitInDifferentWays {

	public static void main(String[] args) {

		System.out.println("split(--) :String class: arg= regex");
		String str="ravi kiran goru";
		String[] stringArray=str.split("\\s");
		for(String s:stringArray)
			System.out.println(s);
		
		System.out.println("split(--) :Pattern class: arg= Target String");
		Pattern p=Pattern.compile("\\s");
		stringArray=p.split("ravi kiran goru");
		for(String s:stringArray)
			System.out.println(s);
		
		System.out.println("split(--) :StringTokenizer class: arg= Target String, regex");
		StringTokenizer stringTokenizer=new StringTokenizer("ravi kiran goru"," ");
		while(stringTokenizer.hasMoreTokens())
			System.out.println(stringTokenizer.nextToken());
		
		
	}

}
