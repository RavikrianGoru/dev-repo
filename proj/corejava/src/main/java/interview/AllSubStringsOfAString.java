package interview;

public class AllSubStringsOfAString {

	public static void main(String[] args) {

		String str1=new String("RavikiranGoru");
		System.out.println("Showing all substrings of given string:");
		
		System.out.println(str1.length());
		int  count=0;
		for(int i=0;i<=str1.length();++i)
		{
			for(int j=1;j<=str1.length()-i;++j)
			{
				System.out.println(str1.substring(i, i+j));
				count++;
			}
		}
		System.out.println("Count:"+count);
		
	}

}
