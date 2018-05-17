package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class PuzzleCircleKillingTillOne {

	public static void getReqNumber(int n)
	{//'n' number of people standing in circle in an order 1 to n. No 1 has a sword. He kills next person(i.e No. 2) and gives sword to next to next (i.e No. 3). All person does the same until only 1 survives.
	 //	Which number survives at the last?
		ArrayList<Integer> orgList=new ArrayList<Integer>();
		ArrayList<Integer> newList=new ArrayList<Integer>();
		for(int i=1;i<=n;++i)
		{
			orgList.add(i);
		}
//		System.out.println(orgList);
		
		while(orgList.size()!=1)
		{
			for(int i=0;i<orgList.size();++i)
			{
				if(i%2==0)
				{
					newList.add(orgList.get(i));
				}
			}
			if(orgList.size()%2!=0)
			{
				newList.remove(0);
			}
			
			orgList=newList;
			newList=new ArrayList<Integer>();
		}
		System.out.println(orgList);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther Number:");
		int i=0;
		try{
		 i=sc.nextInt();
		getReqNumber(i);
		}catch(Exception e)
		{
			throw e;
		}

		Integer I=new Integer(i);
		System.out.println(1+(2*(I-I.highestOneBit(i))));

	}

}
