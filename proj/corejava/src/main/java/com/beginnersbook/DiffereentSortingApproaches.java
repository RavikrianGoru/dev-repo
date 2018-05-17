package com.beginnersbook;

import java.util.Arrays;

public class DiffereentSortingApproaches {

	public static void swap(int[] arrayInt, int n1, int n2) {
		arrayInt[n1] = arrayInt[n1] + arrayInt[n2];
		arrayInt[n2] = arrayInt[n1] - arrayInt[n2];
		arrayInt[n1] = arrayInt[n1] - arrayInt[n2];
		 System.out.println(arrayToString(arrayInt));
	}

	public static String arrayToString(int[] arrayInt) {
		String str = "";
		if (arrayInt != null) {
			for (int i = 0; i < arrayInt.length; i++) {
				str += "," + arrayInt[i];
			}
		}
		str = str.replaceFirst(",", "");
		return "[" + str + "]";
	}

	public static void selectionSort(int[] arrayInt) {

		int minIndex;
		boolean flag = false;
		for (int i = 0; i < arrayInt.length - 1; ++i) {
			minIndex = i;
			for (int j = i + 1; j < arrayInt.length; ++j) {
				if (arrayInt[j] < arrayInt[i] && arrayInt[j] < arrayInt[minIndex]) {
					minIndex = j;
					flag = true;
				}
			}

			if (flag) {
				swap(arrayInt, i, minIndex);
				flag = false;
			}

		}
	}

	public static void bubbleSort(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length - 1; ++i) {
			for (int j = 0; j < arrayInt.length - i - 1; ++j) {
				if (arrayInt[j] > arrayInt[j + 1])
					swap(arrayInt, j, j + 1);
			}
		}
	}

	public static void main(String[] args) {

		int[] arrayInt = { 22, 6, 1, 4, 2, 12, 56, 3, 9, 8, 5, 6, 7, 8 };

		String beforeSort, afterSort;
		beforeSort = arrayToString(arrayInt);
		System.out.println("Before Sorting : " + beforeSort);

		System.out.println("Selection Sort:-------------");
		selectionSort(arrayInt);

		System.out.println("Bubble Sort:-------------");
		bubbleSort(arrayInt);

		System.out.println("Quick Sort:-------------");
		afterSort = arrayToString(arrayInt);
		System.out.println("After Sorting : " + afterSort);

		Arrays.sort(arrayInt);
	}

}
