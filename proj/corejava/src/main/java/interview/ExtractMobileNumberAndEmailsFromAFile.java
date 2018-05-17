package interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMobileNumberAndEmailsFromAFile {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter(
				"D:\\javaPrac_workSpace_eclipse\\src\\outputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(
				"D:\\javaPrac_workSpace_eclipse\\src\\inputFile.txt"));

		Pattern p = null;
		Matcher m = null;
		// ((0|91)?[789][0-9]{9})
		// [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
		p = Pattern.compile("((0|91)?[789][0-9]{9})|([a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+)");
		String line = br.readLine();

		while (line != null) {
			m = p.matcher(line);
			while (m.find()) {
				pw.println(m.group());
			}
			line = br.readLine();
		}

		pw.flush();
		pw.close();
		br.close();
	}

}
