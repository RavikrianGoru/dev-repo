
public class LeftRotate_Array_By_n_elements {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 10;
		System.out.println("Original Array");
		printArray(intArray);
		int[] rotatedArray = leftRotateArray(intArray, n);
		System.out.println("Roated array by " + n + " shifts");
		printArray(rotatedArray);
	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}

	public static int[] leftRotateArray(int[] intArray, int n) {
		if (intArray != null && intArray.length != 0) {
			if (n > intArray.length) {
				n = n % intArray.length;
			}
			for (int a = 1; a <= n; a++) {
				int first = intArray[0];
				for (int i = 1; i < intArray.length; i++) {
					intArray[i - 1] = intArray[i];
				}
				intArray[intArray.length - 1] = first;
			}
		}
		return intArray;
	}

}
