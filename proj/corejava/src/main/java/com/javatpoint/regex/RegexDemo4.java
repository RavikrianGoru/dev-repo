package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo4 {

	public static void main(String[] args) {

		Pattern p=null;
		Matcher m=null;
		//Negative look ahead (?!pattern)
		String search="ravi kiran ab abc ac ad af ag ab abafs absde ab123 ac23";
		String regex="";
		regex="a(?!b).";
		
		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
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
