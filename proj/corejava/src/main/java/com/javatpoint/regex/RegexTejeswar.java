package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexTejeswar {

	public static void main(String[] args) {

//		String searchWord="1.2 df23 d8723 ravi ddff x fdkf xx dfd dthis ravi xxxx * ^%&*^ @#65 JHG@^%*(&%^J G237t %@# fd59453 fd239123  and i devi kavi chnnna";

		
//		String regex=">.:(\\\\\\w+)*<"; //way-1
		
		String searchWord="<?xml version='1.0'?><Objects><Object Type='System.String'>C:\\Users\\CorpSvcICSHP01\\Documents</Object></Objects>";
		String regex="(<Objects.*?><Object.*?>)(.+?)(</Object>)";
		Pattern p=null;
		Matcher m=null;
		
		try
		{	
			 p=Pattern.compile(regex);
			 m=p.matcher(searchWord);
			while(m.find())
			{
				System.out.println(m.group().replaceAll(regex, "$2"));
			}
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
