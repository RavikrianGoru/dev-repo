package date;

import java.util.Calendar;
import java.util.Date;

public class DiffWaysToDispDate {

	public static void main(String[] args) {

		Date d1=new Date();
		System.out.println("Date: "+d1);
		
		
		Date d2=new Date(System.currentTimeMillis()+100000000);
		System.out.println("System.currentTimeMillis(): "+d2);
		
		
		Date d3=new Date(Calendar.getInstance().getTimeInMillis());
		System.out.println("Calendar.getInstance().getTimeInMillis(): "+d3);
		
		Date d4=new java.sql.Date(System.currentTimeMillis());
		System.out.println("java.sql.Date(System.currentTimeMillis()): "+d4);
		
		
		if(d1.after(d2))
			System.out.println("D1 is after d2");
		if(d1.before(d2))
			System.out.println("D1 is before d2");
		
		System.out.println("d1 compareTo d2:"+d1.compareTo(d2));
		System.out.println("d2 compareTo d1:"+d2.compareTo(d1));

		System.out.println(d1.toString());
		System.out.println(d4.toString());
		System.out.println(d4.toLocaleString());
		
		
		
		String stringFormDate="1987-02-01";
		Date d5=java.sql.Date.valueOf(stringFormDate);
		System.out.println("Date.valueOf(\"yyyy-mm-dd\"): "+d5);
		
	}

}
