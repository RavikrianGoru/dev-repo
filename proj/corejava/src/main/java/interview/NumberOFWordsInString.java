package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOFWordsInString {

	
	public static int findNoOfWords(String data)
	{
		int count=0;
		char cArray[]=data.toCharArray();
		for(int i=0;i<cArray.length;i++)
		{
			if( (cArray[i]!=' ' && i==0) || (i>0 && cArray[i]!=' ' && cArray[i-1]==' '))
			{
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String data="    ravi     kirn df sss    ";
		Pattern p= Pattern.compile("\\S+");
		Matcher matcher=p.matcher(data);
		int count=0;
		while(matcher.find())
		{
			count++;
			System.out.println(matcher.group());
		}
		System.out.println("Number of words:"+count);
		System.out.println(findNoOfWords(data));
		
	}
}
