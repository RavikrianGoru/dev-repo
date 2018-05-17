package com.javatpoint.string;

public class StringClassDemo {

	public static void main(String[] args) {

		/*
		 String is immutable(not changeable). java uses string literal concept. 
		 
		 If String is not immutable:(Problem)
		 when two or more reference variables are referring to String object. 
		 one referring changes String data all the other references will be affected. 
		 
		 */
		
		String str1="ravi143ravikirangoru";
		String str2="ravi";
		
		
		
		
		if(str1==str2)
		{
			System.out.println("str1==str2");
		}

		System.out.println(10+20+30+"ravi"+10+20+30);
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(7, 16));
		
		String str3=new String("ravi");
		System.out.println(str2==str3);
		str3=str3.intern();
		System.out.println(str2==str3);
		
		System.out.println(str1);
		System.out.println(str1.replace("ravi", "RAVI"));
		
	}

}
