package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtractNumbersFromString {

	public static void main(String[] args) {

		String regex="\\d+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher("56ravi123kiran1Goru007g");
		System.out.println("All numbers in given string are:");
		while(m.find())
		{
			System.out.println("Extracted Number:"+m.group());
		}
		
		String regex1="\\D+";
		p=Pattern.compile(regex1);
		m=p.matcher("56ravi123kiran1Goru007g");
		System.out.println("All non-numbers in given string are:");
		while(m.find())
		{
			System.out.println("Extracted Number:"+m.group());
		}
		
	}

}
