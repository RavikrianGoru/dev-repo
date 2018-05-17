package com.javatpoint.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args)throws Exception{
		FileOutputStream fos=new FileOutputStream("D:\\javaIO\\outputFile.txt",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="Hi, Dude.... This is ravikiran goru.";
		byte b[]=str.getBytes();
		
		bos.write(b);
		
		bos.flush();
		bos.close();
		fos.close();
		
		
	}

}
