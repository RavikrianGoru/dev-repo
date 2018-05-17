package com.javatpoint.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regexOrcle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter regex:");
		String regex=sc.nextLine();
		System.out.println(regex);
		System.out.println("Enter Search String:");
		String search=sc.nextLine();
		System.out.println(search);
		Pattern p=null;
		Matcher m=null;
		
		try
		{
			p=Pattern.compile(regex);
			m=p.matcher(search);
			while(m.find())
			{
				System.out.println("start:"+m.start()+"... end:"+m.end()+".... Group:"+m.group());
//				System.out.println("start:"+m.start(1)+"... end:"+m.end(1)+".... Group:"+m.group(1));
//				System.out.println("start:"+m.start(2)+"... end:"+m.end(2)+".... Group:"+m.group(2));
//				System.out.println("start:"+m.start(3)+"... end:"+m.end(3)+".... Group:"+m.group(3));
				
			}
			
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
