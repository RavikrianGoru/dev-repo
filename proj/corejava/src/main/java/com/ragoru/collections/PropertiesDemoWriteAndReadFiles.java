package com.ragoru.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoWriteAndReadFiles {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw=new FileWriter("userInfo.txt");
		
		Properties p=new Properties();
		p.setProperty("user", "RavikiranGoru");
		p.setProperty("pwd", "*******");
		p.setProperty("designation", "SE");
		
		p.store(fw, "Authentication: user, pwd and designation.");
		fw.close();
		
		
		FileReader fr=new FileReader("userinfo.txt");

//		int i=0;
//		while((i=fr.read())!=-1)
//		{
//			System.out.print((char)i);
//		}

		Student s111=new Student();
		s111.getAge();
		
		System.out.println("Getting specified Property value:");
		Properties p1=new Properties();
		p1.load(fr);
		if(p1.containsKey("user"))
		{
		System.out.println(p1.getProperty("user"));
		}
		
	}

}
