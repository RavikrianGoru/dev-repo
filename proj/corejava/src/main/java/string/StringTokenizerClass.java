package string;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		System.out.println("this is depreccated class use String's split method");
		StringTokenizer sToken=new StringTokenizer("Hi, Th.is is ra.vik.ir,an g.oru. Wh,at you want."," ,.");
		while(sToken.hasMoreTokens())
		{
			System.out.println(sToken.nextToken());
		}
		String s="dkh skdh dm sdh, sdhl ,ds,s s,sds s,sdsdl askdlj";
		for(String s1:s.split("\\s|,"))
		{
			System.out.println(s1);
		}
	}

}
