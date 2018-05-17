package interview;

public class FirstNonReapatableCharInString {

	static String data1="ravirrrarra";
	static String data2="";
	
	
	public static void main(String[] args) {
		for(int i=0;i<data1.length();i++)
		{
			int count=1;
			char ch=data1.charAt(i);
			if(isExisted(ch))
			{
				continue;
			}else{
				for(int j=i+1;j<data1.length();j++)
				{
					if(ch==data1.charAt(j))
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.println(ch+"------"+count);	
				break;
			}
			
			data2+=ch;
		}
		
	}


	private static boolean isExisted(char ch) {
		if(data2==null || data2.isEmpty())
		{
			return false;
		}
		else{
			for(int i=0;i<data2.length();++i)
			{
				if(ch==data2.charAt(i))
					return true;
			}
		}
		return false;
	}
}
