package com.ragoru.collections;

public class DispAllSubStrings {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		String str = "ravi";

		for(int i=0; i<str.length();i++)//more readable and understandable
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
		
//		for (int i = 0; i < str.length(); ++i) {
//			for (int j = 1; j <= str.length() - i; j++)
//				System.out.println(str.substring(i, j + i));
//		}
		Student s111=new Student();
		s111.getAge();
		s111.getAge();
	}

}
