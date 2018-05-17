package com.javatpoint.regex;

import java.util.regex.Pattern;

public class RegexOneCharacterClasses {

	public static void main(String[] args) {

		System.out.println("[abc] --->1---> a or b or c");
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "b"));
		System.out.println(Pattern.matches("[abc]", "c"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]", "sec"));
		System.out.println(Pattern.matches("[abc]", "aaa"));
		
		System.out.println("[^abc] --->1---> not a and not b and not c");
		System.out.println(Pattern.matches("[^abc]", "d"));
		System.out.println(Pattern.matches("[^abc]", "a"));
		System.out.println(Pattern.matches("[^abc]", "ddd"));
		System.out.println(Pattern.matches("[^abc]", "g"));
		
		System.out.println("[a-zA-Z] --->1---> amoung a-z or A-Z");
		System.out.println(Pattern.matches("[a-zA-Z]", "d"));
		System.out.println(Pattern.matches("[a-zA-Z]", "1"));
		System.out.println(Pattern.matches("[a-zA-Z]", "S"));
		System.out.println(Pattern.matches("[a-zA-Z]", "&"));
		
		System.out.println("[^a-zA-Z] --->1---> not amoung a-z or A-Z");
		System.out.println(Pattern.matches("[^a-zA-Z]", "d"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "S"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "1"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "&"));
		
		System.out.println("[a-dp-s]==[a-d[p-s]] --->1---> amoung a-d or p-s---union");
		System.out.println(Pattern.matches("[a-dp-s]", "d"));
		System.out.println(Pattern.matches("[a-dp-s]", "S"));
		System.out.println(Pattern.matches("[a-d[p-s]]", "r"));
		System.out.println(Pattern.matches("[a-dp-s]", "dr"));
		
		System.out.println("[a-q&&p-s]==[a-q&&[p-s]] --->1---> amoung a-q and p-s---intersection");
		System.out.println(Pattern.matches("[a-q&&p-s]", "p"));
		System.out.println(Pattern.matches("[a-q&&p-s]", "pp"));
		System.out.println(Pattern.matches("[a-q&&[p-s]]", "q"));
		System.out.println(Pattern.matches("[a-q&&[p-s]]", "dr"));
		
		
	
	}

}
