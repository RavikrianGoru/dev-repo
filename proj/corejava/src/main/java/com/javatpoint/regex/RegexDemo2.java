package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo2 {

	public static void main(String[] args) {

		String searchWord="1.2 df23 d8723 xxxx ravi ddff 1.2 x fdkf xx d& @^*#$ fsdfJKDFG xxxxx HJDFJ *@%*&jHFJF 3489 ama dfd xxx dthis ravi 1.2 xxxx Ravm devi kavi* chinna ^%&*^ @#65 JHG@^%*(&%^J G237t %@# \n fd59453 fd239123  and i devi kavi chnnna chinna";
		String regex="";
//		regex=".";
//		regex="1.2";
//		regex="^1.2";
//		regex="chinna";
//		regex="chinna$";
//		regex="[ravi]";
//		regex="[rd][ae]";
//		regex="[^ravi]";
//		regex="[a-d1-3.]";
//		regex="r|R";
//		regex="de";
//		regex="$";
		
		
		//Meta characters
//		regex="\\d";
//		regex="\\d+";
//		regex="\\D";
//		regex="\\D+";
//		regex="\\s";
//		regex="\\s+";
//		regex="\\S";
//		regex="\\S+";
//		regex="\\w";
//		regex="\\w+";
//		regex="\\W";
//		regex="\\W+";

//		regex="\\b";
//		regex="\\b+";
//		regex="\\B";
//		regex="\\B+";

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
		regex="(\\w*)?";
		
		Pattern p=null;
		Matcher m=null;
		
		try
		{	
			p=Pattern.compile(regex);
			m=p.matcher(searchWord);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
