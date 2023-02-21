package com.aurionpro.test;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40 };
		Stream<Integer> stream = Stream.of(10, 20, 30);
//		for(int x:num) {
//			System.out.print(x+" ");
//		}
		// stream.forEach(n -> System.out.println(n));
		stream.forEach(System.out::println);
		System.out.println();
		Stream<String> stringStream = Stream.of("Sankalp", "Sameer", "Sanskar");
		stringStream.forEach(System.out::println);
		System.out.println();

		// list converting into stream
		List<String> players = Arrays.asList("Sukesh", "Mukesh", "Dinesh");
		List<String> playersUppercase = new ArrayList<String>();

		players.stream().forEach(System.out::println);
		for (int i = 0; i < players.size(); i++) {
			playersUppercase.add(players.get(i).toUpperCase());
		}
		System.out.println(playersUppercase);
		System.out.println();
		Stream<String> helloStream = Stream.generate(() -> "Hello").limit(5);
		helloStream.forEach(System.out::println);

		System.out.println();
		Stream<Integer> numberStream = Stream.iterate(1, n -> n + 10).limit(5);
		numberStream.forEach(System.out::println);

		System.out.println();
		Stream.Builder<String> builder = Stream.builder();
		Stream<String> build = builder.add("Sankalp")
				.add("Sameer")
				.add("Prajwal")
				.add("Sanskar")
				.build();
		build.forEach(System.out::println);
		

	}

}
