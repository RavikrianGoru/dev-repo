package com.javatpoint.internalization;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		//Locale locale=new Locale("fr","fr");//for the specific locale  
		  
		System.out.println(locale.getDisplayCountry());  
		System.out.println(locale.getDisplayLanguage());  
		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());
		
		Locale locale1=new Locale("en","US");
		System.out.println(locale1.getDisplayLanguage(locale));
		locale1=new Locale("fr","FR");
		System.out.println(locale1.getDisplayLanguage(locale));
		locale1=new Locale("es","ES");
		System.out.println(locale1.getDisplayLanguage(locale));
		
		
		
	}

}
