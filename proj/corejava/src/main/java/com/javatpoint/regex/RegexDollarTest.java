package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDollarTest {

	public static void main(String[] args) {

		String currency[]=  {
								"Rs. 599.00",
								"Rs. 499.50",
								"Rs. 19.00",
								"Rs. 129",
								"$120.38 ",
								"$59.00",
								"$39",
								"$256.8",
								"1456",
								"45679.98"
				
							};
		String regex="";
		regex="\\d+";
//		regex="\\$(\\d+)\\.(\\d+)";
		regex="^Rs\\. .*";
		regex="(\\d+)\\.(\\d+)";
		
		Pattern p=null;
		Matcher m=null;

		for(String input:currency)
		{
			try{
				p=Pattern.compile(regex);
				m=p.matcher(input);
				if(m.matches())
					System.out.println(input);
					//System.out.println(input+"  group(1):"+m.group(1)+" group(2):"+m.group(2));
			}catch(PatternSyntaxException e)
			{
				System.err.println("SynTaxError");
				System.exit(1);
			}
		}
	}

}
