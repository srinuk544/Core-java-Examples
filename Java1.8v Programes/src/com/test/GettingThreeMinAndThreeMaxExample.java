package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GettingThreeMinAndThreeMaxExample {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(0,1, 2, 3, 5, 8,14,55, 10, 99, 25);

		ll.stream().sorted().limit(3).collect(Collectors.toList()).forEach(i -> System.out.println(i));

		System.out.println("====================");

		ll.stream().sorted((a, b) -> b - a).limit(3).collect(Collectors.toList()).forEach(System.out::println);

	}

}
