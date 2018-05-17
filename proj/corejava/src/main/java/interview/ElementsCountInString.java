package interview;

import java.util.HashMap;
import java.util.Map;

public class ElementsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ANJDJKHDNAHJD";
		byte[] bArray = s.getBytes();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (byte b : bArray) {
			if (map.containsKey((char) b)) {
				map.put((char) b, map.get((char) b) + 1);
			} else {
				map.put((char) b, 1);
			}
		}
		System.out.println(map);

	}

}
