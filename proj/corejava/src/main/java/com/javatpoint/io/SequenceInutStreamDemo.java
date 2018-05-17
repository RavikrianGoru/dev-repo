package com.javatpoint.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInutStreamDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis1=new FileInputStream("D:\\javaIO\\inputF1.txt");
		FileInputStream fis2=new FileInputStream("D:\\javaIO\\inputF2.txt");
		FileInputStream fis3=new FileInputStream("D:\\javaIO\\inputF3.txt");
		
//		System.out.println("Getting Data from two file(one by one)");
//		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
//		int i=0;
//		while((i=sis.read())!=-1)
//		{
//			System.out.print((char)i);
//		}
		
		
		Vector v=new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		Enumeration e=v.elements();
		SequenceInputStream sis1=new SequenceInputStream(e);
		System.out.println("Getting Data from more than two files(one by one):");
		int i=0;
		while((i=sis1.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	
	}

}
