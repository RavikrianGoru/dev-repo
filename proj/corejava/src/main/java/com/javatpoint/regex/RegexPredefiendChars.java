package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPredefiendChars {

	public static void main(String[] args) {

		String regex1=".a*t";//.at [rbc]at \\dat \\Dat \\Sat \\wat \\Wat
		String input1="rat bat cat 1at maat dat tot 9at rot matt 10at roott 5at ratot";
		Pattern p1=null;
		Matcher m1=null;
		
//		p1=Pattern.compile(regex1);
//		m1=p1.matcher(input1);
//		int count=0;
//		while(m1.find())
//		{
//			count++;
//			System.out.println(m1.group()+" "+m1.start()+" "+m1.end());
//		}
//		System.out.println(count);
		
		String inputArray[]=input1.split(" ");
		for(String input:inputArray)
		{
		p1=Pattern.compile(regex1);
		m1=p1.matcher(input);
		if(m1.find())
		{
			System.out.println(input+" :"+m1.matches());
		}
		}
	}

}
