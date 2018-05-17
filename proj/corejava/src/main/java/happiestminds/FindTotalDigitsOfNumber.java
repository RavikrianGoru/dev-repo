package happiestminds;

public class FindTotalDigitsOfNumber {

	/*
		
		Find the total number of digits for given number.
		
	 */
	public static void main(String[] args) {
		// int number = 1_230;
		// int number = -1_230;
		// int number = +1_23_0;
		// int number = -1_23093873;
		// int number = +1_239854860;
		int number = +-1_239854860;
		System.out.println(
				"Total number of digits for given number(" + number + ") is " + findTotalNumberOfDigits(number));
	}
	private static int findTotalNumberOfDigits(int number) {
		int totalDigits = 0;
		while (number != 0) {
			number = number / 10;
			totalDigits++;
		}
		return totalDigits;
	}

}
