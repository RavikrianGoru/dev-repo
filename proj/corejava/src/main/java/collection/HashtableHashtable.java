package collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

public class HashtableHashtable {

	public static void main(String[] args) {

		Hashtable<String ,String> ht=new Hashtable<String,String>();
		
		System.out.println("Hashtable<key,value>: unique key, No order, not allwed null for key, not alled null for value, synchronized.");
		ht.put("H_001", "Ravi");
		ht.put("H_002", "Goru");
		ht.put("H_003", "Kiran");
		ht.put("H_004", "Chinna");
		ht.put("H_005", "lakshmi");
		ht.put("H_006", "Surya");
		ht.put("H_007", "Devi");
		ht.put("H_008", "Meena");
		ht.put("H_009", "Manju");
		System.out.println(ht);
		StringJoiner stringJoinerKey=new StringJoiner(",");
		StringJoiner stringJoinerVal=new StringJoiner(",","{", "}");
		
		
		Set<String> keySet=ht.keySet();
		System.out.println("keySet: "+keySet);
		
		Set<Map.Entry<String,String>> entrySet=ht.entrySet();
		System.out.println("EntrySet:"+entrySet);
		
		for(Map.Entry<String, String> obj:entrySet)
		{
			System.out.println(obj.getKey()+"   "+obj.getValue());
			stringJoinerKey.add(obj.getKey());
			stringJoinerVal.add(obj.getValue());
		}
		
		System.out.println("Hashtable: "+ht);
		System.out.println(stringJoinerKey);
		System.out.println(stringJoinerVal);
		
		Student s111=new Student();
		s111.getAge();
	}

}
