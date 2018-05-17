package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileNumberValidation {

	public static void main(String[] args) {
		String regex = "(0|91)?[7-9][0-9]{9}";
		String array[] = { "9949665920", "09949665920", "919949665920",
				"19949665920", "6949665920", "123456789", "199949665920" };

		Pattern p = null;
		Matcher m = null;

		p = Pattern.compile(regex);
		for (String input : array) {
			m = p.matcher(input);
			if(m.matches())
				System.out.println(m.group());
		}
	}

}
