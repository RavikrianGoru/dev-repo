package interview;

public class TotalNumberOfTimesEachLetterOccuredInString {
	public static void main(String args[])
	{
		System.out.println("Total number of times each chars occured in given string:");
		String data="ravikirangoru";
		int charArray[]=new int[256];
		
		for(int i=0;i<data.length();++i)
		{
			charArray[(int)data.charAt(i)]=charArray[(int)data.charAt(i)]+1;
		}
		
		for(int i=0;i<charArray.length;++i)
		{
			if((int)charArray[i]!=0)
			System.out.println((char)i+" "+charArray[i]);
		}
	}

}
