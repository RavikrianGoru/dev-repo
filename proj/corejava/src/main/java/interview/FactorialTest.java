package interview;
import java.util.Scanner;

public class FactorialTest {
	
	public static void getFact(int n)
	{
		int fact=1;
		
		if(n==0)
		System.out.println("Factorial of "+n+" :"+fact);
		else
		{
			for(int i=n;i>0;--i)
			{
				fact*=i;
			}
		}
		System.out.println("Factorial of "+n+" :"+fact);
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter Integer:");
		Scanner sc =new Scanner(System.in);
		int n=0;
		try{
		n=sc.nextInt();
		if(n<0)
			throw new Exception("Invalid number");
		getFact(n);
		}catch(Exception ne)
		{
			System.out.println("Invalid number");
			System.exit(0);
			
		}
		
	}

}

