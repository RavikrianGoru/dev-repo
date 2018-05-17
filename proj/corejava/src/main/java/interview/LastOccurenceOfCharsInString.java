package interview;

public class LastOccurenceOfCharsInString {

	public static void main(String[] args) 
	{

		System.out.println("Count number of times chars occured in given string:");
		String data="ravikirangoru";
		int charArray[]=new int[256];
		
		for(int i=0;i<data.length();++i)
		{
//			System.out.print(data.charAt(i));
			charArray[(int)data.charAt(i)]=i;
//			System.out.print((int)charArray[(int)data.charAt(i)]);
		}
		
		for(int i=0;i<charArray.length;++i)
		{
			if((int)charArray[i]!=0)
			System.out.println((char)i+" "+charArray[i]);
		}
	
	}

}
