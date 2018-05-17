package interview;

import java.util.Arrays;

public class ReverseOfGivenInput {

	public static char[] swap(char[] ary, int start, int end)
	{
		ary[start]=(char)(ary[start] + ary[end]);
		ary[end]=(char)(ary[start] - ary[end]);
		ary[start]=(char)(ary[start] - ary[end]);
		return ary;
	}
	
	public static void main(String[] args) {
		String data="RaviG";
		
		
		char ary[]=data.toCharArray();
		System.out.println(Arrays.toString(ary));
		
		if(data!=null && !data.isEmpty())
		{
			for(int i=0; i<(data.length()/2); i++)
			{
				ary=swap(ary, i, data.length()-1-i);
			}
		}
		System.out.println(Arrays.toString(ary));
	}

}
