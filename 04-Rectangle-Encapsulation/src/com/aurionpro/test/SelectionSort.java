package com.aurionpro.test;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 6, 1, 2, 7, 3 };
		sortArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}

	}

}
