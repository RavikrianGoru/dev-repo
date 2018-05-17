package javahungry.coding;

public class _1_Prime_Reverse_Factorial {

	public static void reverse(int[]numArray)
	{
		System.out.println("Reverse of array TC: O(n)");
		for(int i=0;i<numArray.length/2;i++)
		{
			numArray[i]=numArray[i]+numArray[numArray.length-i-1];
			numArray[numArray.length-i-1]=numArray[i]-numArray[numArray.length-i-1];
			numArray[i]=numArray[i]-numArray[numArray.length-i-1];
		}
		for(int i=0; i<numArray.length;++i)
			System.out.println(numArray[i]);
	}
	
	public static void printPairs(int[] numArray)
	{
		System.out.println("Pairse of array TC: O(n^2)");
		for(int i=0; i<numArray.length;++i)
		{
			for(int j=0;j<numArray.length;j++)
			{
				System.out.print("("+numArray[i]+","+numArray[j]+")");
			}
		}
	}
	
	public static boolean isPrime(int n)
	{
		System.out.println("\nis Prime TC: O(root n)");
		if(n<2)
			return false;
		for(int i=2;i*i<n;++i)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static long factorial(int n)
	{
		System.out.println("factorial recursion TC: O(n)");
		
		if(n<0)
			return -1;
		if(n==0)
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void permutation(String data)
	{
		if(data==null || data.length()==0)
			System.err.println("");
		else
		{
			for(int i=0;i<data.length();++i)
			{
				System.out.println(data.substring(0,i+1));
			}
			permutation(data.substring(1,data.length()));
		}
	}


	public static void allFib1(int n)
	{
		System.out.println("fib1 TM: O(n * 2^n)");
		for(int i=0;i<n;++i)
		System.out.print(fib1(i)+",");
	}
	public static int fib1(int n)
	{
		if(n<=0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib1(n-1)+fib1(n-2);
	}
	
	public static void allFib2(int n)
	{
		System.out.println("\nfib2 TM: O(n)");
		int [] intAry=new int[n];
		for(int i=0;i<n;++i)
		{
			intAry=fib2(i,intAry);
		}
		
		for(int a:intAry)
		{
			System.out.print(a+",");
		}
	}
	
	public static int[] fib2(int n, int[] intAry)
	{
		if(n==0 || n==1)
			intAry[n]=n;
		else
			intAry[n]=intAry[n-1]+intAry[n-2];
		
		return intAry;
	}
	public static void main(String[] args) {

		int[] numArray=new int[]{1,3,5,7,9};
		reverse(numArray);
////		printPairs(numArray);
////		System.out.println("is 567 prime:"+isPrime(567));
////		System.out.println("All substrings of given data recursion TC: O(n * n!)");
////		permutation("RavikiranGoru");
//		
////		allFib1(10);
////		allFib2(10);
		
		
		
		
		
	}

}
