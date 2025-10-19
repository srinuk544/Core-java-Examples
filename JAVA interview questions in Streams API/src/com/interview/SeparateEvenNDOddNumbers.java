package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateEvenNDOddNumbers {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 89, 56, 78, 97, 64, 12, 13, 45);
		System.out.println("---even numbers-----");
		ll.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("------odd numbers----");
		ll.stream().filter(i -> i % 2 != 0).sorted().collect(Collectors.toList()).forEach(i -> System.out.println(i));

	}

}
