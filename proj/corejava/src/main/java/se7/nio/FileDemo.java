package se7.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class FileDemo {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); )
		{
			String data;
			System.out.println("Enter data   q-(Quit):");
			while(true)
			{
				
				data=br.readLine().trim();
				if(data.equalsIgnoreCase("q"))
				{
					break;
				}
			}
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
