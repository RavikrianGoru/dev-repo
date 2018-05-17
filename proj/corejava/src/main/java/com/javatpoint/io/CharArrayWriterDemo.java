package com.javatpoint.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo {

	public static void main(String[] args) throws Exception{

		CharArrayWriter caw=new CharArrayWriter();
		caw.write("This is CharArrayWriter.......... Demo: Writing data into multiple files");
		
		FileWriter f1=new FileWriter("D:\\javaIO\\a.txt");
		FileWriter f2=new FileWriter("D:\\javaIO\\b.txt");
		FileWriter f3=new FileWriter("D:\\javaIO\\c.txt");
		FileWriter f4=new FileWriter("D:\\javaIO\\d.txt");
		
		caw.writeTo(f1);
		caw.writeTo(f2);
		caw.writeTo(f3);
		caw.writeTo(f4);
		
		caw.close();
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		
		
		
	}

}
