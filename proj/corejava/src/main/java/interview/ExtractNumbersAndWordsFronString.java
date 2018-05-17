package interview;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersAndWordsFronString {

	public static void main(String[] args) {
		String str1 = "ravi123kiran345y2273j27364647282hfdfj63728";

		String regex = "\\D+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			System.out.println(m.group());
		}

		String regex1 = "\\d+";
		p = Pattern.compile(regex1);
		m = p.matcher(str1);
		while (m.find()) {
			System.out.println(m.group());
		}

	}

}
