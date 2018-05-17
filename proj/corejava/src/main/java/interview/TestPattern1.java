package interview;

public class TestPattern1 {

/*
	1
	12
	123
	1234
	12345
 */
	public void printPattern1(int n)
	{
		for(int i=1; i<=5; ++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		
	}
	
	
/*
 	* * * * * 1
 	* * * * 1 2 1
 	* * * 1 2 3 2 1
 	* * 1 2 3 4 3 2 1
 	* 1 2 3 4 5 4 3 2 1
 */
	public void printPattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");//System.out.print("* ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=i-1;l>=1;--l)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}
	
/*

	 
 */
	public void printPattern3(int n)
	{
		
	}
	public static void main(String[] args)
	{
		TestPattern1 t=new TestPattern1();
		t.printPattern1(5);
		System.out.println("------------------");
		t.printPattern2(5);
		System.out.println("------------------");
	}

}
