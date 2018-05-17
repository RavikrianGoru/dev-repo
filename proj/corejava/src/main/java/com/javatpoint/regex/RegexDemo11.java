package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo11 {

	public static void main(String[] args) {

		Pattern p=null;
		Matcher m=null;
		String search="299fdsfhdsjkl";//232dkfjdslfh
		String regex="";
//		regex="^[^\\D].*";
		regex="^[^\\d].*";
//		regex="^[0-2]?[0-9][0-9]";//less than 300 check
		System.out.println(search.matches(regex));
		
		
		String s1=" rafjkdsfj ravi kiran";
		System.out.println(s1.matches(".* (ravi|kiran).*"));
		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(regex);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
