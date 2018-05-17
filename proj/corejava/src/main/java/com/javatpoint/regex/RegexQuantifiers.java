package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexQuantifiers {

	public static void main(String[] args) {
		Pattern p=null;
		Matcher m=null;
		
		String reg="[1-9]*[0]?[1-9]*";
		//"[1-9]*[0]*[1-9]*" -----0 none or many
		//"[1-9]*[0]+[1-9]*" -----0 onece or many
		//"[1-9]*[0][1-9]*"------0 only once exaclty
		//"[1-9]*[0]{2}[1-9]*";------0 only two times
		//"[1-9]*[0]{2,3}[1-9]*";------0 min 2 times max 3 times
		//"[1-9]*[0]{2,}[1-9]*";------0 atleast 2 times
		//"[1-9]*[0]?[1-9]*";---------0 once or none
		
		String arry[]={"001","101", "1001","2002","30000","430001", "5071","561","765","208","961"};
		try
		{
			p=Pattern.compile(reg);
			for(String in:arry)
			{
				m=p.matcher(in);
				if(m.matches())
					System.out.println(in);
			}
		}catch(PatternSyntaxException e)
		{
			System.err.print("SynTaxError");
			System.exit(1);
		}
	}

}
