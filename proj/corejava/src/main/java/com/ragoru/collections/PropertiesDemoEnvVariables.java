package com.ragoru.collections;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemoEnvVariables {

	public static void main(String[] args) throws IOException {

		Properties p=System.getProperties();
		Set set=p.entrySet();

		
		
		for (Object eachObj : set) {
			Map.Entry entry = (Map.Entry) eachObj;
			System.out.println(entry.getKey() + "      " + entry.getValue());
		}		
		
		Student s111=new Student();
		s111.getAge();
		
//		Iterator itr=set.iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry entry=(Map.Entry)itr.next();
//			System.out.println(entry.getKey()+"      "+entry.getValue());
//		}
		
	}

}
