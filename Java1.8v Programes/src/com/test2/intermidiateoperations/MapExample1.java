package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {
	public static void main(String[] args) {
		String s1 = "srinu";
		String s2 = "java";
		String s3 = "spring";
		String s4 = "spring";

		List<String> ll = Arrays.asList(s1, s2, s3, s4);
		ll.stream().filter(i -> i.startsWith("s")).distinct().map(i -> i.toUpperCase()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
