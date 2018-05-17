package test;

import java.util.Scanner;

public class Test2 {

	public static int gcd(int num1,int num2)
	{
		if(num2==0)
			return num1;
		else
			return gcd(num2,num1%num2);
	}
	public static void main(String[] args) {
				
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.nextLine();// for flush
		
		int count=0;
		for (int i = 1; i <= num; i++) {
			for(int j=1;j<=num;j++)
			{
				if(!(i==j || j==1 || gcd(i,j)!=1))
				{
					System.out.println(i+"/"+j);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
