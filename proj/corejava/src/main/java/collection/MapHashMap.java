package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapHashMap {

	public static void main(String[] args) {

		HashMap<String, String> hm=new HashMap<String,String>();
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String, String>();
		TreeMap<String, String> tm=new TreeMap<String, String>();
		
		System.out.println("*************************************HashMap**************************************");
		System.out.println("HashMap:(key,value): No Order: only one null for key, multiple for value: when we try to existed key for next entry it overrides. ");

		hm.put("HCL_001", "RAVI");
		hm.put("HCL_002", "TARAK");
		hm.put("HCL_003", "RAM");
		hm.put("HCL_004", "RAJESH");
		hm.put("HCL_005", "SAI");
		hm.put("HCL_005", "SAI1");
		hm.put(null, "GURU");
		hm.put(null, "SRINI");
		hm.put("HCL_006", "MEENA");
		hm.put("HCL_007", "ANU");
		hm.put("HCL_008", "MANJU");
		hm.put("HCL_009", "RAVALI");
		hm.put("HCL_010", "RAVALI");
		hm.put("HCL_011", "RAVALI");
		hm.put("HCL_012", "RAVALI");
		hm.put("HCL_013", null);
		hm.put("HCL_014", null);
		hm.put("HCL_015", null);
		System.out.println(hm.size()+" : "+hm);
		System.out.println("hm.get(key) :"+hm.get("HCL_001"));
		Collection<String> s= hm.values();
		System.out.println(s);
		
		Set<String>keySet=hm.keySet();
		System.out.println("All keys as Set :"+keySet);
		
		
		System.out.println("----------All Keys---------------------");
		for(String k:keySet)
		{
			System.out.println(k);
		}
		

		Set<Map.Entry<String,String>> mapEntrySet= hm.entrySet();
		System.out.println("All Map.Entry Set :"+mapEntrySet);

		
		System.out.println("----------All Map.Entry---------------------");
		for(Map.Entry<String, String> mapEntry:hm.entrySet())
		{
			System.out.println(mapEntry);
		}
		
		
		System.out.println("*************************************LinkedHashMap**************************************");
		System.out.println("LinkedHashMap:(key,value):Allows one null for key, multiple nulls for value, Same as HashMap with insertion Order.");
		lhm.put("HCL_001", "RAVI");
		lhm.put("HCL_002", "TARAK");
		lhm.put("HCL_003", "RAM");
		lhm.put("HCL_004", "RAJESH");
		lhm.put("HCL_005", "SAI");
		lhm.put("HCL_005", "SAI1");
		lhm.put(null, "GURU");
		lhm.put(null, "SRINI");
		lhm.put("HCL_006", "MEENA");
		lhm.put("HCL_007", "ANU");
		lhm.put("HCL_008", "MANJU");
		lhm.put("HCL_009", "RAVALI");
		lhm.put("HCL_010", "RAVALI");
		lhm.put("HCL_011", "RAVALI");
		lhm.put("HCL_012", "RAVALI");
		lhm.put("HCL_013", null);
		lhm.put("HCL_014", null);
		lhm.put("HCL_015", null);	
		System.out.println(lhm.size()+" : "+lhm);
		System.out.println("lhm.get(key) :"+lhm.get("HCL_001"));
		
		
		keySet=lhm.keySet();
		System.out.println("All keys as Set :"+keySet);
		
		
		System.out.println("----------All Keys---------------------");
		for(String k:keySet)
		{
			System.out.println(k);
		}
		

		mapEntrySet= lhm.entrySet();
		System.out.println("All Map.Entry Set :"+mapEntrySet);

		
		System.out.println("----------All Map.Entry---------------------");
		for(Map.Entry<String, String> mapEntry:lhm.entrySet())
		{
			System.out.println(mapEntry);
		}
		
		
		
		System.out.println("*************************************TreeMap**************************************");
		System.out.println("TreeMap:(key,value):No null for key,multiple for value: when we try to existed key for next entry it overrides. ");
		tm.put("HCL_001", "RAVI");
		tm.put("HCL_002", "TARAK");
		tm.put("HCL_003", "RAM");
		tm.put("HCL_004", "RAJESH");
		tm.put("HCL_005", "SAI");
		tm.put("HCL_005", "SAI1");
		//tm.put(null, "GURU");
		//tm.put(null, "SRINI");
		tm.put("HCL_006", "MEENA");
		tm.put("HCL_010", "RAVALI");
		tm.put("HCL_007", "ANU");
		tm.put("HCL_008", "MANJU");
		tm.put("HCL_009", "RAVALI");
		tm.put("HCL_011", "RAVALI");
		tm.put("HCL_012", "RAVALI");
		tm.put("HCL_013", null);
		tm.put("HCL_014", null);
		tm.put("HCL_015", null);	
		System.out.println(tm.size()+" : "+tm);
		System.out.println("tm.get(key) :"+tm.get("HCL_001"));
		
		
		keySet=tm.keySet();
		System.out.println("All keys as Set :"+keySet);
		
		
		System.out.println("----------All Keys---------------------");
		for(String k:keySet)
		{
			System.out.println(k);
		}
		

		mapEntrySet= tm.entrySet();
		System.out.println("All Map.Entry Set :"+mapEntrySet);

		
		System.out.println("----------All Map.Entry---------------------");
		for(Map.Entry<String, String> mapEntry:tm.entrySet())
		{
			System.out.println(mapEntry);
		}
		Student s111=new Student();
		s111.getAge();
	
	}

}
