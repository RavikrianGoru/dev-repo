package interview;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


abstract class A1
{
	public A1()
	{
		
	}
	
	public static void main(String args[])
	{
		
	}
	
}
public class ExtractTextAndNumbersFromString {

	public static void main(String[] args) {
		String str11 = "ravi123kiran345y2273j27364647282hfdfj63728";

		String regex = "\\D+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str11);

		
		while (m.find()) {
			System.out.println(m.group());
		}

		System.out.println();
		
		String regex1 = "\\d+";
		p = Pattern.compile(regex1);
		m = p.matcher(str11);
		while (m.find()) {

		System.out.println(m.group()+"");
		}

	}

}
