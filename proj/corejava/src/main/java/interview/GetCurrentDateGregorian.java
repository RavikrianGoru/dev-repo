package interview;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateGregorian {

	public static void main(String[] args) 
	{
		GregorianCalendar gCal=new GregorianCalendar();
		System.out.println("Day:"+gCal.get(Calendar.DATE));
		System.out.println("Day:"+gCal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Month (0-11):"+(gCal.get(Calendar.MONTH)+1));
		
		System.out.println("Year:"+gCal.get(Calendar.YEAR));
		
		System.out.println("Hours:(0-11)"+gCal.get(Calendar.HOUR));
		System.out.println("Minutes:"+gCal.get(Calendar.MINUTE));
		System.out.println("Seconds:"+gCal.get(Calendar.SECOND));
		
		
	}

}
