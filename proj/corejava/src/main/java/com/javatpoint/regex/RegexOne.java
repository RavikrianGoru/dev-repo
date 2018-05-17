package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOne {

	public static void main(String[] args) {

		System.out.println("Different Ways to use regular expression");
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("rs");
		if(m.matches())
		{
			System.out.println("true");
		}
		
		if(Pattern.compile("..s").matcher("dps").matches())
		{
			System.out.println("true");
		}
		
		
		if(Pattern.matches("....s", "hdgks"))
		{
			System.out.println("true");
		}
		
	}		
}
