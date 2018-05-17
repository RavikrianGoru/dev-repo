package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo1 {

	public static void main(String[] args) 
	{
		String searchString ="ravi234ravi kiran goru.  @%$@^%&@ ravi is a good\t bo2345y. raaa\n 546. &*^ &\t*^ hf 3486 JHFJHDF (%^($ we 123 devi call.70 \nravi davi\n 12.45 as .765 kevil raviiii R.K. kavi is 43.56not ravi     kiran     goru ravi\nravi kiran    goru ravi786";
		System.out.println(searchString+"\n-------------------------------------------------------------------\n");
		String regex="";

//		regex="ravi";
//		regex=".avi";
//		regex="ra*";//0 or more
//		regex="ra+";//1 or more
//		regex="ra?";//0 or 1
		
//		regex="r(a)*";
//		regex="r(aa)*";
//		regex="^ravi";
//		regex="ravi$";
//		regex="ravi\\s+kiran\\s+goru";		
//		regex="^\\d+";
		regex="\\d+$";
//		regex="(\\d+)";
//		regex="(\\d+\\.)";
//		regex="(\\d+\\.\\d+)";
//		regex="(\\d+)?(\\.\\d+)";
		
		
		
//		regex="[rk]avi";
//		regex="[rkd][ae]vi";
//		regex="[^rdk]";
//		regex="[a-f-2-4]";
//		regex="ravi|devi";
//		regex="$";
		
		
//		regex="\\d";
//		regex="\\d+";
//		regex="\\d*";
		
		//Quantifiers
//		regex=".";
//		regex=".*";
//		regex="x+";//one or more
		
//		regex="x*";// zero or more
//		regex="1?";// zero or one
		
//		regex="\\d*";//zero or more
//		regex="\\d?";//zero or one
//		regex="\\d{3}";//exactly 3 didgits
//		regex="\\D{3}";
//		regex="\\d{3,6}";
//		regex="(\\w*)?";

		
		regex="\\D";
		regex="\\D+";
//		regex="\\s";
//		regex="\\s+";
//		regex="\\S";
//		regex="\\S+";
//		regex="\\w";
//		regex="\\W";
//		regex="\\w+";
//		regex="\\W+";
//		regex="[^\\w\\d]+";
//		regex="[\\w\\d]+";
		
		
		
		try
		{
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(searchString);
		
		
		int i=0;
		while(m.find())
		{
			i++;
			System.out.println(m.group());
		}
		System.out.println("Count:"+i);
		
		
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
