package exception;

import java.util.Scanner;

import javax.xml.bind.ValidationEvent;

class InvalidAgeException extends Error//Throwable//Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}


public class CustomException {

	public static boolean validate(int age) throws InvalidAgeException
	{
		if(age<18)
			//throw new InvalidAgeException("Age must be 18 or above 18...");
			System.err.println("Age must be 18 or above 18...");
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter age:");
		int age=sc.nextInt();
		try{
			if(validate(age))
			{
				System.out.println("Valid Age....");
			}
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("finally-block");
		}
		

	}

}
