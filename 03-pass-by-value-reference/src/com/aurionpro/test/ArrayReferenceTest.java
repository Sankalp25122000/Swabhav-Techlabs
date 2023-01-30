package com.aurionpro.test;

public class ArrayReferenceTest {
 
	public static void main(String[] args) {
	  int[] numbers = {10,20,30,40,50};
	  covertArrayElementsToZero(numbers);
	  for(int i= 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}

	}

	private static void covertArrayElementsToZero(int[] numbers) {
		for(int i= 0;i<numbers.length;i++) {
			numbers[i]=0;
		}
		
	}

}
