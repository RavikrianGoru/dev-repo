package interview;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexListOutAllTextFiles {

	public static void main(String[] args) {

		Pattern p=null;
		Matcher m=null;
		p=Pattern.compile("[a-zA-Z0-9$_.]+\\.txt|TXT");
		
		File f=new File("D:\\javaPrac_workSpace_eclipse\\src");
		String list[]=f.list();
		for(String s:list)
		{
			m=p.matcher(s);
			if(m.find() && m.group().equals(s))
			{
				System.out.println(s);
			}
		}
	}

}
