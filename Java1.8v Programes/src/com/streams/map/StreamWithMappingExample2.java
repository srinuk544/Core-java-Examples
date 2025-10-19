package com.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamWithMappingExample2 {
	public static void main(String[] args) {
		List<String> lis = Arrays.asList("srinu", "venu", "hari", "venkat", "battu", "suresh", "swapna");

		// lis.stream().map(i -> i.length()).forEach(i -> System.out.println(i));
		// lis.stream().filter(i -> i.startsWith("s")).map(i ->
		// i.length()).forEach(System.out::println);

		lis.stream().filter(i -> i.startsWith("s")).map(i -> i + "----" + i.length()).forEach(System.out::println);
	}

}
