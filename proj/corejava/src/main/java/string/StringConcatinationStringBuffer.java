package string;

public class StringConcatinationStringBuffer {


	public static String concatetionString()
	{
		String str="java";
		for(int i=0;i<10000;++i)
			str+="Hi";
		return str;
	}
	public static String concatetionStringBuffer()
	{
		StringBuffer str= new StringBuffer("java");
		for(int i=0;i<10000;++i)
			str.append("Hi");
		return str.toString();
	}

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		concatetionString();
		System.out.println("concatination in String takes:"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		concatetionStringBuffer();
		System.out.println("concatination in StringBuffer takes:"+(System.currentTimeMillis()-startTime)+"ms");
		
	}

}
