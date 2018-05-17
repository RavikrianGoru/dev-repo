package com.javatpoint.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamFileInputStreamDemo {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:\\javaIO\\outputFile.txt", true);
			String str = "RavikiranGoru";
			byte[] b = str.getBytes();

			fos.write(b);
			fos.close();
			System.out.println("Data entered into file or appended.....");
			
			
			System.out.println("Reading data from file....");
			FileInputStream fis=new FileInputStream("D:\\javaIO\\outputFile.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
