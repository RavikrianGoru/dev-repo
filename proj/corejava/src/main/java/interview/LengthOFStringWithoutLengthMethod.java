package interview;

public class LengthOFStringWithoutLengthMethod {

	public static void main(String[] args) {

		String name=new String("Ravi");
		int count=0;
		try{
		while(true)
		{
			System.out.println(name.charAt(count));
			count++;
		}
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("length is ");
		}
		System.out.println(count);
	}

}
