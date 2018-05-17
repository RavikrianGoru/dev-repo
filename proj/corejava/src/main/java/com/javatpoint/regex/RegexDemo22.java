package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo22 {

	public static void main(String[] args) {
		Pattern p=null;
		Matcher m=null;
		//replace: we can perform replaceXX() on Matcher object.
		
		String search="this is ravikiran goru my first name RAVIKIRAN and last name is GORU. people call me ravi or kiran or goru5.";
		String regex="";
		String replace="";
//		regex="ravi";
//		regex="\\w+";
		regex="\\s+"; replace="\t";
		regex="ravi"; replace="RAVI";
		
		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
			while(m.find())
			{
				System.out.println("start:"+m.start());
				System.out.println("end:"+m.end());
				System.out.println(m.group());
			}
			System.out.println(m.replaceAll(replace));
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
