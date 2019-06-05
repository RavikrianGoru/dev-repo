package interviews.asg;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Needle {
	@SuppressWarnings("resource")
	public static int count(String needle, InputStream haystack) throws Exception {

		java.util.Scanner scan = new java.util.Scanner(haystack).useDelimiter("\\n");
		int count = 0;
		while (scan.hasNext()) {
			if (scan.next().contains(needle)) {
				count++;
			}
		}
		return count;
	}

	public static int countv1(String needle, InputStream haystack) throws Exception {

		@SuppressWarnings("resource")
		java.util.Scanner scan = new java.util.Scanner(haystack).useDelimiter("\\n");
		int count = 0;
		while (scan.hasNext()) {
			if (scan.next().contains(needle)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws Exception {
		String inMessage = "Hello, there!\nHow are you today?\nYes, you over there. \\nYes, you over there.";

		try (InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
			System.out.println(Needle.countv1("there", inStream));
		}
	}
}