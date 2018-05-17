package new28thOct;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Nth_LargestOfArray {

	public static void main(String[] args) {
		
		int [] intAry={2,5,3,1,56,885,235,88783,452,56,23,562,762,724,98,84,85,62,54,89,32,45,12};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number k th element:");
		int k=sc.nextInt();
		
		System.out.println("With ");
		TreeSet<Integer> sSet=new TreeSet<Integer>();
		for(int i=0; i<intAry.length;++i)
		{
			sSet.add(intAry[i]);
		}
		System.out.println(sSet);
		
		Arrays.sort(intAry);
		for(int a:intAry)
			System.out.print(a+",");
		System.out.println("\n" +k+" th largesst element:"+intAry[intAry.length-k]);
		
	}

}