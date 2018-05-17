package com.javatpoint.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter("abcPw.txt");
		pw.write(100);//------------------d
		
		pw.print(100);
		
		pw.println(100);
		pw.print(true);
		pw.print(10.5);
		pw.print("Hi ravi");
		pw.flush();
		pw.close();
		
		
		BufferedReader br=new BufferedReader(new FileReader("abcPw.txt"));
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}

		br.close();
		
		

	}

}
