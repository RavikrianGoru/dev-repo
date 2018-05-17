package interview;

import java.util.Stack;

public class ReverseOfString {

	public static void main(String[] args) {

		String s1="RavikiranGoru";
		
		// Way-1
		String rev="";
		char[] cArray=s1.toCharArray();
		for(int i=cArray.length-1;i>=0;i--)
			rev=rev+cArray[i];
		
		System.out.println(rev);
		
		// Way-2
		rev="";
		StringBuffer sbuff=new StringBuffer(s1);
		System.out.println(sbuff.reverse());
		
		//Way-3
		rev="";
		StringBuilder sBuild=new StringBuilder(s1);
		System.out.println(sBuild.reverse());
		
		
		//Way-4
		rev="";
		char[] cArray1=s1.toCharArray();
		int right=cArray1.length-1;
		char temp;
		for(int left=0;left<right;right--,left++)
		{
			temp=cArray1[left];
			cArray1[left]=cArray1[right];
			cArray1[right]=temp;
		}
		for(char t:cArray1)
			System.out.print(t);
		
		
		//Way-5
		Stack stack=new Stack();
		for(int i=0; i<s1.length();i++)
			stack.add(s1.charAt(i));

		System.out.println();
		while(!stack.isEmpty())
		System.out.print(stack.pop());
		
	}

}
