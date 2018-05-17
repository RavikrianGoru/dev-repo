package javahungry.coding;

public class _4_TrimFunctionalityString {

	public static void trim(String data)
	{
		System.out.println("Given String:"+data);
		if(data==null || data.length()==0)
		{
			System.out.println("");
		}else
		{
			int min=0, max=0;
			for(int i=0;i<data.length();++i)
			{
				if(data.charAt(i)!=' ')
				{
					min=i;
					break;
				}
			}
			for(int i=data.length()-1;i>=0;i--)
			{
				if(data.charAt(i)!=' ')
				{
					max=i+1;
					break;	
				}
			}
			System.out.println(min+"   "+max);
			System.out.println("After trimming data:"+data.substring(min,max));
		}
	}
	public static void main(String[] args) {

		String data="       this is kfjdfldjfd * fkjdhfdkhlk   ";
		trim(data);
	}

}
