package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInString {

	public static void main(String[] args) {
		String s = "ANJDJKHDNAHJD";
		byte[] bArray = s.getBytes();
		Arrays.sort(bArray);

		Set set = new HashSet();
		Set dSet = new HashSet();
		for (byte b : bArray) {
			if (set.contains(((char) b))) {
				dSet.add((char) b);
			} else {
				set.add((char) b);
			}
		}

		//System.out.println(set);
		System.out.println(dSet);

	}

}
