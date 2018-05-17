package interview;

import java.util.Arrays;
import java.util.Scanner;

public class NextMinElementOfGivenNum {

	public static void main(String[] args) {

		int intArray[]={21,34,42,45,11,65,72,86,98,102};
		Arrays.sort(intArray);
		int min=intArray[0];
		int max=intArray[intArray.length-1];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int req=sc.nextInt();
		if(req<min || req>max)                        
		{
			System.out.println("Given number is out of range");
		}else
		{
			for(int i=intArray.length-1;i>=0;--i)
			{
				if(!(req>=intArray[i]))
				{	
					continue;
				}
				else
				{
					System.out.println(intArray[i]);
					break;
				}
			}
		}

	}

}
