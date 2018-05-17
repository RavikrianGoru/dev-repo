package interview;

import java.util.Scanner;

public class FibonacciTest {


	static int n1=0, n2=1,n3=0;
	public static void getFibonacciWithRecursion(int count)
	{
		n3=n1+n2;
		n2=n3;
		n1=n2;
		System.out.print(" "+n3);
		if(count>1)
		getFibonacciWithRecursion(count-1);
		
	}
	
	
	
	public static void getFibonacciWithOutRecursion(int count)
	{
		int n1=0, n2=1,n3;
		System.out.print(n1+" "+n2); 
		count-=2;
		while(count>0)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n2=n3;
			n1=n2;
			count--;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		try
		{
			System.out.println("Enter number(number of fibonacci elements):");
			count=sc.nextInt();
			if(count<2)
				throw new Exception("Invalid input");
			
		}
		catch(Exception e)
		{
			System.err.print("Invalid Input");
			System.exit(0);
		}
		
		
//		System.out.println("\nFibonaaci with out recursion:");
//		FibonacciTest.getFibonacciWithOutRecursion(count);
		System.out.println("\nFibonaaci with recursion:");
		System.out.print(n1+" "+n2);
		FibonacciTest.getFibonacciWithRecursion(count-2);
		
		
		
	}

	
}
