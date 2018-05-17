package javahungry;

public class _12_FindGivenNumberEvenOrNotWithOutUsing {

	public static void findEvenOrOdd1(int num)
	{
		if(num%2==0)
		{
			System.out.println(num +"is  even number");
		}
		else
		{
			System.out.println(num +"is  Odd number");
		}
	}
	public static void findEvenOrOdd2(int num)
	{
		if(((num/2)*2)==num)
		{
			System.out.println(num +"is  even number");
		}
		else
		{
			System.out.println(num +"is  Odd number");
		}
		
	}
	public static void findEvenOrOdd3(int num)
	{
		if((num & 1) == 0)
		{
			System.out.println(num +"is  even number");
		}
		else
		{
			System.out.println(num +"is  Odd number");
		}
	}
	public static void findEvenOrOdd4(int num)
	{
		if(((num>>1)<<1) == num)
		{
			System.out.println(num +"is  even number");
		}
		else
		{
			System.out.println(num +"is  Odd number");
		}
	}
	
	public static void main(String[] args) {

		findEvenOrOdd1(12);
		findEvenOrOdd2(13);
		findEvenOrOdd3(14);
		findEvenOrOdd4(16);
		
	}

}
