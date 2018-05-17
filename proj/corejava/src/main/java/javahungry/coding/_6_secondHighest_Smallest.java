package javahungry.coding;

public class _6_secondHighest_Smallest {

	public static void secondHigest(int data[])
	{
		if(data!=null && data.length!=0)
		{
			int h1=data[0],h2=data[0];
			for(int n:data)
			{
				if(n>h1)
				{
					h2=h1;
					h1=n;
				}else if(n>h2)
				{
					h2=n;
				}
			}
			System.out.println(h1+"---->"+h2);
		}
	}
	public static void secondSmallest(int data[])
	{
		if(data!=null && data.length!=0)
		{
			int s1=data[0],s2=data[0];
			for(int n:data)
			{
				if(n<s1)
				{
					s2=s1;
					s1=n;
				}
				else if(n<s2)
				{
					s2=n;
				}
			}
			System.out.println(s1+"-------->"+s2);
		}
	}
	public static void main(String[] args) {
		int data[]={34,21,45,23,12,154,1378};
		secondHigest(data);
		secondSmallest(data);
		
	}

}
