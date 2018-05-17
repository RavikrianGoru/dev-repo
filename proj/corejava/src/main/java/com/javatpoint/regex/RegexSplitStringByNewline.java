package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSplitStringByNewline {

	public static void main(String[] args) {

		String regex="[^\\r\\n]+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher("hi,\nThis is ravi\rDo u love me\nI too love you.");
//		System.out.println("hi,\nThis is ravi\r \n \rDo u love me\nI too love you.");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
