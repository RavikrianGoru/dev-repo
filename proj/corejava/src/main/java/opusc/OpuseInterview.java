package opusc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Emp
{
	int a=10;

	@Override
	public String toString() {
		return "Emp [a=" + a + "]";
	}
}


public class OpuseInterview {

public static  int test()
{
	try
	{
		System.out.println("try");
		return 1;
	}catch(Exception e)
	{
		System.out.println("catch");
		return 2;
	}
	finally
	{
		System.out.println("finally");
		return 3;
	}
}
	public static void main(String[] args) 
	{
		
		System.out.println("1) convert int to String and String to int");
		int a=10;String b="20";
		System.out.println(String.valueOf(10));
		System.out.println(Integer.parseInt(b));	
		
		System.out.println("2) ");
		String str="ravi kiran goru kldf dkjfdsl";
		System.out.println("================");
		System.out.println("str to char array length:"+str.toCharArray().length);
		
		System.out.println(Collections.frequency(Arrays.asList(str.toCharArray()), new Character('r')));
		String s[] =str.split(" ");
		System.out.println(str);
		for(int i=s.length-1;i>=1;--i)
		{
			System.out.print(s[i]+" ");
		}

		List<String> l1=Arrays.asList(s);
		String[] s1=(String[]) l1.toArray();
		System.out.println("------------------------");
		for(int i=s1.length-1;i>=1;--i)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println("------------------------");
		Collections.reverse(l1);
		System.out.println(l1);
		
		final Emp emp=new Emp();
		System.out.println(emp);
		emp.a=20;
		System.out.println(emp);
		//Collections.max(coll, comp)
		
		final Map<Integer,Integer> m=new HashMap<>();
		System.out.println(m);
		m.put(1, 1);
		System.out.println(m);
		/*
		 OOP 
		 abstract vs interface
		 marker interface
		 Immutable class
		 Convert int to String
		 find number of time a char repeated in String(single line)
		 sort Employee collection by salary
		 exception propagation
		 
		 
		 */
		
		int y=test();
		System.out.println(y);
	}

}
