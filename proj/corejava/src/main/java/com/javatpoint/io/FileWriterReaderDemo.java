package com.javatpoint.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderDemo {

	public static void main(String[] args) throws Exception {

		System.out.println("FileWrite: for writing data char by char or char[],String but we need to give line separator \\n, when we want to insert primitive data we need to covert into String.");
		System.out.println("FileReader: for readig char by char, or char[], can not read line by line.");
		System.out.println("-------------------------");
		FileReader fr = new FileReader("D:\\javaIO\\inputF1.txt");
		FileWriter fw = new FileWriter("D:\\javaIO\\outputF1.txt");
		fw.write("Written some data\\n this writing data into file.\\nwe need to give next line character explicitly.");
		fw.close();
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
	

}
