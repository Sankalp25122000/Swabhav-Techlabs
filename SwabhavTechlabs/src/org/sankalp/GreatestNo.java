package org.sankalp;
import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>=b && a>=c) {
			System.out.println(a +" Is the greatest of 3 No.s");
		}
		else if(b>=a && b>=c) {
			System.out.println(b +" Is the greatest of 3 No.s");
		}
		else System.out.println(c +" Is the greatest of 3 No.s");
	}

}
