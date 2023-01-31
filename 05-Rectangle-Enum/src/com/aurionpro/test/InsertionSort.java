package com.aurionpro.test;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 2, 9, 4, 6, 7 };
		sortArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void sortArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

	}

}
