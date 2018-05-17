package com.javatpoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexGroupStartEnd {

	public static void main(String[] args) {

		String reg = "cat";
		String input = "cat  cattie acat cattegouuu cat Cat caT";
		try {
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(input);
			while(matcher.find())
				System.out.println("\""+matcher.group()+"\"  "+matcher.start()+"  "+matcher.end());
		} catch (PatternSyntaxException e) {
			System.err.println("error at pattern compilation");
			System.exit(1);
		}
	}

}
