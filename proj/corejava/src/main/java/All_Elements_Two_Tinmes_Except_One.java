public class All_Elements_Two_Tinmes_Except_One {

	static char getOddTimesElement(char ar[]) {
		int i;
		char result = 0;
		for (i = 0; i < ar.length; i++) {
			result = (char) (result ^ ar[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Given array containes all the elemets 2 time except one element in char/int/short/byte/ array.");
		System.out.println("Then find the element?");
		char charArray[] = new char[] { 'a', 'b', 'a', 'b', 'c', 'd', 'd', 'e', 'f', 'g', 'g', 'f', 'e' };
		for (char each : charArray) {
			System.out.print(each + " ");
		}
		System.out.println();

		System.out.println("One and only unique element in given array is : " + getOddTimesElement(charArray));
	}

}
