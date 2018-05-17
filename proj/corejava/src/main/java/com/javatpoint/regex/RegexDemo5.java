package com.javatpoint.regex;

class StringVersions
{
	public boolean isTrue(String s)
	{
		return s.matches("true");
	}
	
	public boolean isTruev2(String s)
	{
		return s.matches("[tT]rue");
	}
	
	public boolean isTrueOrYes(String s)
	{
		return s.matches("[tT]rue|[yY]es");
	}
	public boolean containsTrue(String s)
	{
		return s.matches(".*[tT]rue.*");
	}
	
	public boolean isContainsThreeLetters(String s)
	{
		return s.matches("[a-zA-Z]{3}");
	}
	public boolean isIntersection(String s)
	{
		return s.matches("([\\w&&[^b]])*");
	}
}

public class RegexDemo5 {
	
	public static void main(String[] args) 
	{

		//String regex
		String search="This is Ravi kiran Goru. *&^ this is what i want. You can fuck yourself.";
		System.out.println(search.matches("\\w.*"));
		String subs[]=search.split("\\s+");
		System.out.println(subs.length);
		for(String s:subs)
		{
			System.out.println(s);
		}
		
		System.out.println(search.replaceFirst("\\s+", "\t"));
		System.out.println(search.replaceAll("\\s+", "\t"));
		
		StringVersions sObj=new StringVersions();
		System.out.println("--------------------------------");
		System.out.println(sObj.isTrue("true"));
		System.out.println(sObj.isTrue("True"));
		System.out.println(sObj.isTrue("True is true"));
		
		System.out.println(sObj.isTruev2("This is true"));
		System.out.println(sObj.isTruev2("true"));
		System.out.println(sObj.isTruev2("True"));
		
		System.out.println(sObj.isTrueOrYes("true"));
		System.out.println(sObj.isTrueOrYes("True"));
		System.out.println(sObj.isTrueOrYes("Yes"));
		System.out.println(sObj.isTrueOrYes("yes"));
		System.out.println(sObj.isTrueOrYes("true yes"));
		
		System.out.println("----");
		System.out.println(sObj.containsTrue("this is ravi contains true"));
		System.out.println(sObj.containsTrue("this is ravi contains True"));
	
		System.out.println((sObj.isIntersection("hi is ravi")));
		
	}

}

