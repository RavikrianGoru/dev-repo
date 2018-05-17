package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexRemoveDuplicateItems {

	public static void main(String[] args) {

		String search="D:C:A:C:C:E:F:D:S:C:D:R::D:A";
		String regex="";
		regex="(\\w):(?=.*\\1:?)";
		System.out.println(regex);
		System.out.println(search.matches(regex));
		Pattern p=null;
		Matcher m=null;
		

		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
			while(m.find())
			{
//				System.out.println("start:"+m.start());
//				System.out.println("end:"+m.end());
				System.out.println(m.group());
			}
			
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
