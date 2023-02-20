package com.aurionpro.model;

import java.util.PriorityQueue;

public class PriorityQueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Sankalp");
		queue.add("Sameer");
		queue.add("Karan");
		queue.add("Jayesh");
		queue.add("Tejas");
		for(String x : queue) {
			System.out.println(x);
		}
		queue.poll();
		queue.remove();
		System.out.println(queue);
		System.out.println("Head = "+ queue.peek());
		//or
		System.out.println("Head = "+ queue.element());
		queue.clear();
		System.out.println(queue);

	}

}
