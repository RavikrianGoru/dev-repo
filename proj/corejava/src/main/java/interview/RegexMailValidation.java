package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexMailValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneger Email:");
		String mail=sc.next();
//		String regex="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}";
//		String regex="[a-z0-9._%+-]+@(?:[a-z0-9-]+\\.)+[a-z]{2,4}";
		String regex="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		     
		try{
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(mail);
		if(m.matches())
			System.out.println("Valid mail ID");
		else
			System.out.println("Invalid mail ID");
		}catch(PatternSyntaxException e)
		{
			System.err.println("SynTaxError");
			System.exit(1);
		}
	}

}
