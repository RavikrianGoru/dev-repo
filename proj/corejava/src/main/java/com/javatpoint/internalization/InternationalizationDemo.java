package com.javatpoint.internalization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationDemo {

	public static void  printDate(Locale locale){
		DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate=new Date();
		String date=df.format(currentDate);
		System.out.println(date);
	}
	public static void printTime(Locale locale)
	{
		DateFormat df=DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		Date currentDate=new Date();
		String time=df.format(currentDate);
		System.out.println(time+" time in "+locale);
	}
	public static void printNumber(Locale locale)
	{
		NumberFormat nf=NumberFormat.getNumberInstance(locale);
		double d=1234567.45678;
		String number=nf.format(d);
		System.out.println(number +" number in "+locale);
	}
	public static void printCurrency(Locale locale){
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		double d=123456.567;
		String amount=nf.format(d);
		System.out.println(amount+" Amount in "+locale);
	}
	public static void main(String[] args) {

		try{
		
		
		ResourceBundle rb=ResourceBundle.getBundle("MessageBundle", Locale.US);
		System.out.println("Message in :"+Locale.US+" "+rb.getString("greeting"));
		
		
		Locale.setDefault(new Locale("in", "ID"));
		rb = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in :"+Locale.getDefault()+" "+rb.getString("greeting"));
		
		
		printDate(Locale.CANADA);
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.ITALIAN);
		printDate(Locale.FRANCE);
		
		printTime(Locale.CANADA);
		printTime(Locale.UK);
		printTime(Locale.US);
		printTime(Locale.ITALIAN);
		printTime(Locale.FRANCE);
		
		printNumber(Locale.CANADA);
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.ITALIAN);
		printNumber(Locale.FRANCE);
		
		printCurrency(Locale.CANADA);
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.ITALIAN);
		printCurrency(Locale.FRANCE);
		
		
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
