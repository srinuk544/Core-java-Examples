package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCustomExample2 {
	public static void main(String[] args) {

		List<String> l = Arrays.asList("java", "har","python", "test", "java", "spring");

		l.stream().map(i -> i.length()).distinct()  .collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("===============");
		l.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()).forEach(System.out::println);
	}

}
