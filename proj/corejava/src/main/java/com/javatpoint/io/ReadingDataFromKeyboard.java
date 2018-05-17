package com.javatpoint.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingDataFromKeyboard {

	public static void main(String[] args)throws IOException {

	 //way-1
	    InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Name:");
		String str=br.readLine();
		System.out.println(str);
		
	//way-2
//		Console consl=System.console();
//		System.out.println(consl);
//		System.out.println("Eneter Name:");
//		String str1=consl.readLine();
//		System.out.println("Eneter PWD:");
//		char charA[]=consl.readPassword();
//		System.out.println(charA.toString());
//		
		
	//way-3
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String str2=sc.nextLine();
		System.out.println(str2);
	}

}
