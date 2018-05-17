package d_and_b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class _6_WildCardGenericsDemo {

	public static void main(String[] args) {
		List<Number> listNumber=new ArrayList<Number>();
		List<Integer> listInteger=new ArrayList<Integer>();
		
		
		listNumber.add(new Integer(20));
		listNumber.add(new BigDecimal("123456779"));
		listNumber.add(new BigInteger("23456787"));
		listNumber.add(new Byte("123"));
		listNumber.add(new Double("123.47789"));
		listNumber.add(new Float("12333.3772"));
		listNumber.add(new Long("123789"));
		listNumber.add(new Short("234"));
		listNumber.add(new AtomicInteger());
		listNumber.add(new AtomicLong());
		//listInteger.add(new Object());
		System.out.println(listNumber);
		
		
		

	}

}
