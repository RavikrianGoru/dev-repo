
public class Frequency_Elements_In_Array {
	public static void printFrequency(int[] inputArray) {
		// printArray(inputArray);
		if (inputArray != null && inputArray.length != 0) {
			int[] frequency = new int[inputArray.length];
			// printArray(frequency);
			for (int i = 0; i < inputArray.length; i++) {
				int count = 1;
				for (int j = i + 1; j < inputArray.length; j++) {
					if (inputArray[i] != -1 && inputArray[i] == inputArray[j]) {
						inputArray[j] = -1;
						count++;
					}
				}
				if (inputArray[i] != -1) {
					frequency[i] = count;
				}
			}
			// printArray(inputArray);
			// printArray(frequency);
			printArray(inputArray, frequency);
		} else {
			System.out.println("No frequency for given array as it is empty");
		}
	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}

	public static void printArray(int[] inputArray1, int[] inputArray2) {
		for (int i = 0; i < inputArray1.length; i++) {
			if( inputArray1[i]!=-1)
			{
				System.out.println("Element "+inputArray1[i] +" occured "+inputArray2[i]+" times");
			}
		}
	}

	public static void main(String[] args) {
		int intArray[] = { 1, 4, 2, 1, 5, 3, 7, 5, 3, 5, 4, 2, 9, 8, 0, 4 };
		printFrequency(intArray);
	}

}
