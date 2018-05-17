package com.javatpoint.regex;


import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexConsecutiveDuplicateWords {

	public static void main(String[] args) {

		String search="My name is ravi ravi kiran goru. ravi we %%% %%% &&& &&&& ** *** *** can call me ravi 123 123 or 133 133kiran  234 123456 or goru. ravi goru. i will i will be be back abck ";
		String regex="";
//		regex="(\\d+)\\s+\\1";
//		regex="(\\D+)\\s+\\1";
//		regex="(\\w+)\\s+\\1";
		regex="(\\W+)\\s+\\1";
		
		System.out.println(search.matches(regex));
		Pattern p=null;
		Matcher m=null;

		
		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
			while(m.find())
			{
				System.out.println("start:"+m.start()+"    end:"+m.end());
				System.out.println(m.group());
			}
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
