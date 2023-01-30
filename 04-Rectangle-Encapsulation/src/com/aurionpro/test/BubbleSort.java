package com.aurionpro.test;

public class BubbleSort {

	public static void printArray(int arr[]) {
		System.out.print("| ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 7, 2 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		printArray(arr);
	}

}
