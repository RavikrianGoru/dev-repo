package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLogical {

	public static void main(String[] args) {
//		String regex=".*(ravi).*|.*(ali).*";
		String regex=".*(ravi).*";
		
		String inputs[]={"ravi","kavi","Naveen","ravali","ali", "this is alibabaa","aravindha"};
		Pattern p=Pattern.compile(regex);
		for(String input:inputs)
		{
		Matcher m=p.matcher(input);
		if(m.matches())
			System.out.println(input);
		}
				
		
	}

}
