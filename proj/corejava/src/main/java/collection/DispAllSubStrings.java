package collection;

public class DispAllSubStrings {

	public static void main(String[] args) {
		String str = "ravi";

		for(int i=0; i<str.length();i++)//more readable and understandable
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}

}
