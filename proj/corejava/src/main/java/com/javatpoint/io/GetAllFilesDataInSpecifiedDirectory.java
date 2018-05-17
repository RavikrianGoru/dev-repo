package com.javatpoint.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class GetAllFilesDataInSpecifiedDirectory {

	public static void main(String[] args) throws Exception{

		File f=new File("D:\\javaPrac_workSpace_eclipse\\coreProject");
		if(f.isDirectory())
		{
			String list[]=f.list();
			System.out.println(Arrays.asList(list));
			if(list.length!=0)
			{
			for(int i=0;i<list.length;++i)
			{
				String l=list[i];
				File f1=new File(l);
				if(f1.isFile())
				{
					BufferedReader br=new BufferedReader(new FileReader(f1));
					String line=br.readLine();
					while(line!=null)
					{
						System.out.println(line);
						line=br.readLine();
					}
				}
			}
			}
		}else
		{
			throw new Exception("Given Path is not directory.");
		}
	}

}
