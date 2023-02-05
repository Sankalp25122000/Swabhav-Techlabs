package com.aurionpro.test;

public class ArrayStatistics {

	public static void main(String[] args) {
		int sum = 0;
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[0]);

		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
			if (max < Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);
			} else if (max > Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);
			}

		}
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum / args.length);
		System.out.println("Maximum is " + max);
		System.out.println("Minimum is " + min);

		for (int i = 0; i < args.length; i++) {
			int x = Integer.parseInt(args[i]);
			int count = 0;
			if (x == -1)
				continue;
			for (int j = 0; j < args.length; j++) {
				int first = Integer.parseInt(args[j]);
				if (x == first) {
					count++;
					first = -1;

				}
			}
			System.out.println("Frequency of " + x + " is " + count);
		}
	}

}
