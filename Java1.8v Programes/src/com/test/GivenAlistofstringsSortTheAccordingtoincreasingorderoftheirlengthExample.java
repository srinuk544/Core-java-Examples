package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GivenAlistofstringsSortTheAccordingtoincreasingorderoftheirlengthExample {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("sri", "hari", "venkat", "vamsi", "babuu");

		/*
		 * ll.stream().sorted((a, b) -> Integer.compare(a.length(),
		 * b.length())).collect(Collectors.toList()) .forEach(i ->
		 * System.out.println(i));
		 */
		
		
		
		ll.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()).forEach(System.out::println);
	}

}
