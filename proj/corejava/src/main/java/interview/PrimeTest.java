package interview;

import java.util.Scanner;

public class PrimeTest {
	public static void testPrime(int num)
	{
		int flag=0;
		for(int i=2;i*i<=num;++i)
		{
			if(num%i==0)
			{
			    System.out.println(num +" is divisible by "+i);
				System.out.println("Given number "+num+" is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given number "+num+" is a prime number");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		try
		{
			System.out.println("Enter number(prime/not):");
			count=sc.nextInt();
			if(count<2)
				throw new Exception("Invalid input");
			testPrime(count);
			
		}
		catch(Exception e)
		{
			System.err.print("Invalid Input");
			System.exit(0);
		}
		
	}

}
