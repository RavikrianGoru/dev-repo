package happiestminds;

public class FrogJumpDown {

	/*
	 * 10 feet depth of well, one frog trying to come out from the well. For
	 * every jump, it climbs 3 feet and fell down to 2 feet. How many jumps it
	 * needs for getting out from the well.
	 */

	public static int findDays(int temp, int jr, int sr) {
		int days = 0;
		while (temp > 0) {
			temp -= jr;
			days++;
			if (temp <= 0)
				return days;
			else {
				temp += sr;
			}
		}
		return days;
	}


	public static void main(String args[]) {
		System.out.println("The Total number of days required: " + findDays(10, 3, 2));
		// System.out.println(findDays(4,3,2));
		// System.out.println(findDays(3,3,2));
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((int)'a');
        System.out.println((int)'z');
		System.out.println("The Total number of days required: " + findDaysRecursive(10, 3, 2));
	}

	private static String findDaysRecursive(int i, int j, int k) {
		return null;
	}

}
