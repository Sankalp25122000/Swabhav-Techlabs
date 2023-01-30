package com.aurionpro.test;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int input  = sc.nextInt();

		if(input%2==1) {
			System.out.println("No is prime no");
		}
		else
			System.out.println("it is not");
		sc.close();
	}
  
}
