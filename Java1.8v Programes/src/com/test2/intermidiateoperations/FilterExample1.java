package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("srinu", "java", "spring", "srinu", "springboot");
		ll.stream().filter(i -> i.startsWith("s")).distinct().collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

	}

}
