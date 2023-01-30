package com.aurionpro.test;

public class AdditionTest {

	public static void main(String[] args) {
      printAddition(1,2);
      printAddition(10.00,12.00);
      printAddition(1,2,3,4);
      printAddition(13.0f,18.0f);
	}

	private static void printAddition(int i, int j, int k, int l) {
		int o = i + j + k + l;
		System.out.println(o);
		
	}

	private static void printAddition(double d, double e) {
		  double kk = d + e;
	      System.out.println(kk);
		
	}

	/*private static void printAddition(int i, int j) {
      int kk = i + j;
      System.out.println(kk);
	}
*/
}
