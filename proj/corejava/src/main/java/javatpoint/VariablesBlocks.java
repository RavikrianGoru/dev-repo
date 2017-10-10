package javatpoint;

public class VariablesBlocks {
	int a=1;
	static int b=2;
	{
		System.out.println("non-static block-");
		
		System.out.println(a);
		System.out.println(b);
		
		int a=10;
		//static int b=20;
		final int b=20;
		// non-static or static block can not have static variable
		System.out.println(a);
		System.out.println(b);
	}
	static
	{
		System.out.println("static block-");

		//System.out.println(a);//Cannot make a static reference to the non-static field a
		System.out.println(b);

		int a=100;
		final int b=200;
		// non-static or static block can not have static variable
		System.out.println(a);
		System.out.println(b);
	}
	VariablesBlocks()
	{
		System.out.println("default constructor-");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void showData()
	{
		System.out.println("non statoc method showData()-");
		System.out.println(a);
		System.out.println(b);
	}
	public static void printData()
	{
		System.out.println("non statoc method showData()-");
		//System.out.println(a);//Cannot make a static reference to the non-static field a
		System.out.println(b);
	}

	strictfp final public static void main(String args[])
	{
		VariablesBlocks obj=new VariablesBlocks();
		obj.showData();
		obj.printData();
	}
}
