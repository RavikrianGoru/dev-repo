package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_aNbN_Test {

	public static void main(String[] args) {

		String regex="(?x)(?:a(?= a*(\\1?+b)))+\\1";
		
		Pattern p=Pattern.compile(regex);
		String arraY[]={"ab","bbaa","aabb","aaabb","aaabbb","sy"};
		Matcher m=null;
		for(String input:arraY)
		{
			m=p.matcher(input);
			if(m.matches())
			{
				System.out.println(input);
			}
		}
	}

}
