package com.ragoru.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatExample {

	public static void main(String[] args) {

		Date d=new Date();
		System.out.println("Current Date:"+ d);

		String stringDateByDateFormat1=DateFormat.getInstance().format(d);
		String stringDateByDateFormat2=DateFormat.getDateInstance().format(d);
		String stringDateByDateFormat3=DateFormat.getTimeInstance().format(d);
		String stringDateByDateFormat4=DateFormat.getDateTimeInstance().format(d);
		String stringDateByDateFormat5=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
		String stringDateByDateFormat6=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(d);
		System.out.println(stringDateByDateFormat1);
		System.out.println(stringDateByDateFormat2);
		System.out.println(stringDateByDateFormat3);
		System.out.println(stringDateByDateFormat4);
		System.out.println(stringDateByDateFormat5);
		System.out.println(stringDateByDateFormat6);
		
		
		try
		{
		Date d1=DateFormat.getDateInstance().parse("Oct 12, 2015 12:17:37 PM");
		System.out.println(d1);
		}catch(ParseException e)
		{
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("SimpleDateFormat:................");
		try{
			
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf1.format(d));

		SimpleDateFormat sdf2=new SimpleDateFormat("dd MMM yyyy zzz hh:mm:ss");
		System.out.println(sdf2.format(d));		
		
		SimpleDateFormat sdf3=new SimpleDateFormat("dd MMMM yyyy zzzz hh:mm:ss");
		System.out.println(sdf3.format(d));		

		Date d3=sdf2.parse("01 Feb 1987 IST 01:30:42");
		System.out.println(d3+"\n");
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTime());
		GregorianCalendar gd=(GregorianCalendar) new GregorianCalendar().getInstance();
		System.out.println(gd.getTime());
		
		Instant in=Instant.now();
		System.out.println(in);
		
		
		
		String str1="143";
		
		System.out.println(Integer.parseInt(str1)+1);
		System.out.println(Long.parseLong("11233"));
		
		System.out.println(String.valueOf(143)+String.valueOf(431));
		
		
		Integer it=new Integer("1000");
		System.out.println((2* (it-it.highestOneBit(it)) +1));
		
		
		
		
	}

}
