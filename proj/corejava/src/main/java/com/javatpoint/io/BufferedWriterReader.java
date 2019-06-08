package com.javatpoint.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterReader {

	public static void main(String[] args) throws Exception{

		
		File f=new File("abc.txt");
		f.createNewFile();//create new file 
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));//---f
		bw.write(100);
		bw.newLine();
		char ch[]={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("ravi");
		bw.newLine();
		bw.flush();
		bw.close();
		System.out.println("data inserted ito file abc.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		
//		int i=0;
//		while((i=br.read())!=-1)
//		{
//			System.out.print((char)i);
//		}

		String str=br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		
		br.close();
		
		
		
	}

}
