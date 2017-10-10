package idea;

public class NumberConvertionsUtils {

	public static final int BINARY=2;
	
	public static void convert(int num, int base)
	{
		String sign="";
		if(num<0)
		{
			sign="-";
			num*=(-1);
		}
		StringBuffer sb=new StringBuffer();
		while(num>0)
		{
			sb.append(num%base);
			num/=base;
		}
		System.out.println(sign+sb.reverse().toString());
	}
}
