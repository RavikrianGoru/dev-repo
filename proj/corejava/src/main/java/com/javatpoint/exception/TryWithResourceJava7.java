package com.javatpoint.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceJava7 {

	public static void openFileOlderJava() throws Exception {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file1.txt");
			int data = fis.read();
			while (data != -1) {
				System.out.print((char) data);
				data = fis.read();
			}
		} catch (Exception e) {
				throw new Exception(e.getMessage());
		} finally {
			if(fis!=null)
			fis.close();
		}
	}
	
	
	public static void openFileJava7() throws FileNotFoundException, IOException
	{
		System.out.println("try-with Resource statement:");
		try(FileInputStream fis=new FileInputStream("file1.txt");)
		{
			int data=fis.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=fis.read();
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("..............................implements the Java interface java.lang.AutoCloseable");
		System.out.println(
				"Try-with-resources in Java 7 is a new exception handling mechanism that makes it easier to correctly close resources that are used within a try-catch block.");
		try {
			openFileOlderJava();
			openFileJava7();
			/*
			Notice the first line inside the method:
			---------------------------------------
				try(FileInputStream input = new FileInputStream("file.txt")) {...}
			
			This is the try-with-resources construct. The FileInputStream variable is declared inside the parentheses after the try keyword. 
			Additionally, a FileInputStream is instantiated and assigned to the variable. 
			
			When the try block finishes the FileInputStream will be closed automatically. This is possible because FileInputStream implements the Java interface java.lang.AutoCloseable. 
			All classes implementing this interface can be used inside the try-with-resources construct. 

			If an exception is thrown both from inside the try-with-resources block, and when the FileInputStream is closed (when close() is called), 
			the exception thrown inside the try block is thrown to the outside world.  
			 
			 
			  
			 
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
