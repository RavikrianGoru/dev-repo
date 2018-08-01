package string;

public class StringMethods {

	public static void main(String[] args) {

		String s1="ravi kiran";
		
		byte[] bArray=s1.getBytes();
		for(byte b:bArray)
		{
			System.out.println(b);
		}
		
		char[] cArray=s1.toCharArray();
		for(char c: cArray)
		{
			System.out.println(c);
		}
	}

}
