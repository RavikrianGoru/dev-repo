package interview;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class NonRepeatableCharsInString {

	public static void main(String[] args) {
		String data="this is ravikiran goru. you are going to process this data.";
		System.out.println("Given data: "+data);
		
		int[] hashArray=new int[128];
		
		for(char c:data.toCharArray())
		{
			hashArray[c]=hashArray[c]+1;
		}
		
		for(int i=0;i<hashArray.length;++i)
		{
			if(hashArray[i]==1)
			{
				System.out.println(hashArray[i]+"   "+(char)i);
			}
		}
		
//		for(int i=0;i<=128;i++)
//			System.out.println(i+" -> "+(char)i);
		
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>();
		for(int i=0;i<data.length();++i)
		{
			if(lhm.containsKey(data.charAt(i)))
			{
				lhm.put(data.charAt(i), lhm.get(data.charAt(i))+1);
			}else
			{
				lhm.put(data.charAt(i), 1);
			}
		
		}
		System.out.println(lhm);
	
		System.out.println("First non repeatable chars in given String");
		Iterator<Character> itr=lhm.keySet().iterator();
		while(itr.hasNext())
		{
			char fisrt=itr.next();
			if(lhm.get(fisrt)==1)
			{
				System.out.println(fisrt);
				break;
			}
		}
		
		System.out.println("Finding all the non repeatable chars in given String");
		lhm.forEach((k,v)->{if(v==1) System.out.println(k);});
		
	}

}
