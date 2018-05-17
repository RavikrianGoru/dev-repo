package javahungry.coding;

public class _5_UpperToLowerOfString {
	public static void changeCase(String data)
	{
		if(data==null || data.length()==0)
		{
			System.out.println(""); 
		}else
		{
			char[] charAry=data.toCharArray();
			for(int i=0;i<data.length();++i)
			{
				if(data.charAt(i)>='a' && data.charAt(i)<='z')
				{
					charAry[i]=(char)((int)data.charAt(i)-32);
				}else if(data.charAt(i)>='A' && data.charAt(i)<='Z')
				{
					charAry[i]=(char)((int)data.charAt(i)+32);
				}
			}
			for(int i=0;i<charAry.length;++i)
			{
				System.out.print(charAry[i]);
			}
			
		}
	}

	public static void main(String[] args) 
	{
		String data="T his KJDDf dhak sKJHA JJH Hg HG328736 (*(&@%A$#0 K hsjs HkjhfkfdJ";
		System.out.println(data);
		changeCase(data);
		
		
		
	}

}
