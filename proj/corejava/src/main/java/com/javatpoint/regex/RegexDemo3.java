package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo3 {

	public static void main(String[] args) {
		Pattern p=null;
		Matcher m=null;

		String search="ravi , kiran . xx ,raviKirna ,.123 563 * and 234%@ Ravi Kirna 5bf23 RAVI KIRAN 9949665920 . 8182183 51461287ravi ravi kiran goru , .";
		String regex="";
		
		//Grouping, Back referencing and replacement
		//$ group, $1 first group, $2 second group.....
		
/*		regex="(\\w)(\\s+)([\\.,])";// ex: 'a ,' or 'a .'
		System.out.println("Before Replacing:\n"+search);
		System.out.println("After Replacing:\n"+search.replaceAll(regex, "$1$3"));
*/		

		search="<the><title>ravi</title></the><Object sum=\"1\"><title font=\"20\"> ravikiran Goru</title></Object><title></title>";
		regex="(<title.*?>)(.+?)(</title>)";

		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
			while(m.find())
			{
				System.out.println(m.group().replaceAll("(<title.*?>)(.+?)(</title>)", "$2").trim());
			}
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
