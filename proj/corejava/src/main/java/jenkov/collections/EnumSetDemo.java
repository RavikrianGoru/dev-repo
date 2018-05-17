package jenkov.collections;

import java.io.Externalizable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class EnumSetDemo {

	
	private enum Days {
		monday, tuesday, wednesday, thursday, friday, saturday, sunday;
		public static Set<Days> allDays = EnumSet.allOf(Days.class);
		public static Set<Days> weekdays = EnumSet.range(monday, friday);

		public boolean isWeekDay() {
			return weekdays.contains(this);
		}
	}
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("ravi1");
	al.add("ravi2");
	al.add("ravi3");
	al.add("ravi4");
	al.forEach((s)->{System.out.println(s);});
	Vector<String> v=new Vector<>();
	v.add("ravi1");
	v.add("ravi2");
	v.add("ravi3");
	v.add("ravi4");
	
	Enumeration<String> itr=Collections.enumeration(v);
	while(itr.hasMoreElements())
	{
		System.out.println(itr.nextElement());
		//v.add("kiran");
	}
	System.out.println(al +" "+ v);
	
	
	
		
		
	}

}
