package com.javatpoint.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUSPhoneNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Phone number:");
		String usPhoneNumber=sc.next();
		String regex="[0-9][0-9][0-9][-]?[0-9][0-9][0-9][-]?[0-9][0-9][0-9][0-9]";
//		String regex="\\d{3}-?\\d{3}-?\\d{4}";
//		String regex="\\d{3}-\\d{3}-\\d{4}";
//		String regex="(\\d{3}[-]?){2}\\d{4}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(usPhoneNumber);
		if(m.matches())
		{
			System.out.println(usPhoneNumber+ " is valid US phone number");
		}
		else
		{
			System.out.println(usPhoneNumber+ " is not valid US phone number");
		}
	}

}
