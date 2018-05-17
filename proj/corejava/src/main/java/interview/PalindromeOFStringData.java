package interview;

public class PalindromeOFStringData {

	public static boolean isPalindrome(String inputData) {
		return isPalindrome(inputData, 0, inputData.length() - 1);
	}

	public static boolean isPalindrome(String data, int start, int end) {
		if (start >= end) {
			return true;
		} else if (data.charAt(start) != data.charAt(end)) {
			return false;
		} else {
			return isPalindrome(data, start + 1, end - 1);
		}
	}
	
	public static void main(String[] args) {
		String inputData = "RaviivaR";
		if (isPalindrome(inputData)) {
			System.out.println(inputData + " is Palindrome");
		} else {
			System.out.println(inputData + " is not Palindrome");
		}

	}

}
