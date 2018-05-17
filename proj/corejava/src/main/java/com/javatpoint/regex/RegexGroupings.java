package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexGroupings {

	public static void main(String[] args) 
	{
		String inputs[]= {
							"dog",
							" dog",
							" dog ",
							" this is dog",
							"dog will bite another dog",
							"dogbd dog dog"
						};
		
		String regex="^dog.*dog$";
		//"^dog.*";
		//"^dog$";
		//".*dog$";
		//".*dog.*";
		//"\\s*dog.*";
		Pattern p=null;
		Matcher m=null;
		try
		{
			p=Pattern.compile(regex);
			for(String input:inputs)
			{
				m=p.matcher(input);
				if(m.matches())
					System.out.println(input);
			}
		}catch(PatternSyntaxException e)
		{
			System.err.println("SynTaxError");
			System.exit(1);
		}
		
	}

}
