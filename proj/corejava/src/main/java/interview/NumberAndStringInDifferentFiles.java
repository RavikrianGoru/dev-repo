package interview;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberAndStringInDifferentFiles {

	public static void main(String[] args) throws IOException{

		FileOutputStream fos1=new FileOutputStream("D:\\javaIO\\Number.txt",false);
		FileOutputStream fos2=new FileOutputStream("D:\\javaIO\\String.txt",false);
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number or String \"stop\" for stopping inputs:");
		String input="start";
		String regex1="\\d+";
		String regex2="\\D+";
		
		Pattern p1=Pattern.compile(regex1);
		Matcher m1=null;
		Pattern p2=Pattern.compile(regex2);
		Matcher m2=null;
		
		
		while(!input.equalsIgnoreCase("stop"))
		{
			input=sc.nextLine();
			m1=p1.matcher(input);
			m2=p2.matcher(input);
			
			if(input.equalsIgnoreCase("stop"))
			{
				break;
			}
			
			if(m1.find() && m1.group().equals(input))
			{
				baos.write(input.getBytes());
				baos.writeTo(fos1);
				baos.reset();
			}
			if(m2.find() && m2.group().equals(input))
			{
				baos.write(input.getBytes());
				baos.writeTo(fos2);
				baos.reset();
			}

		}
		
		baos.close();
		fos1.close();
		fos2.close();
		
	}

}
