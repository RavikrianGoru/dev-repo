package interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDataFormatAndDate {

		public static void main(String[] args) 
		{

			Date d=new Date();// it gives current date & time
			System.out.println("Date :\n"+d+"\n");
			
			//Set format
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
			System.out.println("Date(dd-MM-yy hh:mm:ss):"+sdf.format(d));
			
			
			//Set a date 
			SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			
			try{
				Date d1=sdf1.parse("1/2/2015 11:22:33");
				System.out.println(d1);
			}
			catch(ParseException e)
			{
				System.out.println(e);
			}
			
			
			//get current date by Calendar
			Calendar c=Calendar.getInstance();
			Date d2=c.getTime();
			System.out.println("date fron Calendar:"+d2);
			
			
			//get difference between two dates
			
			//dd-MM-yy hh:mm:ss
			String startDateString="10-2-1987 01:25:23";
			String endDateString="15-7-1989 08:30:10";
			
			
			SimpleDateFormat sdFormate=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			
			Date startDate=null;
			Date endDate=null;
			
			try{
			startDate=sdFormate.parse(startDateString);
			endDate=sdFormate.parse(endDateString);
			
			System.out.println("Start Date:"+startDate+"   "+"End Date:"+endDate);
			
			long startTime=startDate.getTime();
			long endTime=endDate.getTime();

			System.out.println("Start Time:"+startTime+"   "+"End Time:"+endTime);
			
			System.out.println("total time diff in millisecs:"+(endTime-startTime));
			System.out.println("total time diff in secs:"+(endTime-startTime)/1000 % 60);
			System.out.println("total time diff in mins:"+(endTime-startTime)/(1000*60) % 60);
			System.out.println("total time diff in hrs:"+(endTime-startTime)/(1000*60*60) % 24);
			System.out.println("total time diff in days:"+(endTime-startTime)/(1000*60*60*24) % 365);
			
			}
			catch(ParseException e)
			{
				System.out.println(e);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}


}
