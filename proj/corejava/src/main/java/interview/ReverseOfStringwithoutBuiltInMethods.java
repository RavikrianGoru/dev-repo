package interview;

public class ReverseOfStringwithoutBuiltInMethods {


	public static void main(String[] args) {

		String str = "This is normal String";
		System.out.println("Original String:\'" + str + "\'");
		System.out.print("Reverse of Original String: ");
		reverse(str);

	}

	public static void reverse(String str) {
		if (str != null && !str.isEmpty()) {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		}else
		{
			System.out.println("Invalid Data or Data should not be empty");
		}
	}

}
