package interview;

public class ConvertStringToIntType {

	public static int convertStringToInt(String numString)
	{
		int number=0;
		int len=0;
		int itr=0;
		boolean isNegative=false;
		try{
		if(numString.charAt(0)=='-')
		{
			itr++;
			isNegative=true;
		}
		len=numString.length();
		while(itr<len)
		{
			number*=10;
			number+=numString.charAt(itr++)-'0';
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(isNegative)
			number=-number;
		return number;
	}
	public static void main(String[] args) {

	String numString="-12364574";
	System.out.println("Number:(Before Converting):"+numString);
	System.out.println("Number:(After Convertion)"+convertStringToInt(numString));
	
	}
}
