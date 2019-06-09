public class DuplicateElements_In_Array {
	public static void main(String[] args) {
		int intArray[] = { 1, 4, 2, 1, 5, 3, 7, 5, 3, 5, 4, 2, 9, 8, 0, 4 };

		printArray(intArray);
		printDuplicateEmelents(intArray);

	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}

	public static void printDuplicateEmelents(int[] intputArray) {
		for (int i = 0; i < intputArray.length - 1; i++) {
			boolean flag=false;
			for (int j = i + 1; j < intputArray.length; j++) {
				if (intputArray[i] != -1 && intputArray[i] == intputArray[j]) {
					intputArray[j] = -1;
					flag=true;
				}
			}
			if(!flag)
			{
				intputArray[i]=-2;	
			}
		}
		for (int i = 0; i < intputArray.length; i++) {
			if(intputArray[i]!=-1 && intputArray[i]!=-2)
			System.out.print(intputArray[i] + " ");
		}
		System.out.println();
	}

}
