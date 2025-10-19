package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetingThreeMaxAndMinNumbersExample {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 2, 5, 8, 0, 9, 78, 25, 98);
		System.out.println("Three min numberss");
		ll.stream().sorted().limit(3).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("threen max numberss");

		ll.stream().sorted((a, b) -> b - a).limit(3).collect(Collectors.toList()).forEach(System.out::println);

		Optional<Integer> o = ll.stream().max(Integer::compareTo);
		Optional<Integer> l = ll.stream().min(Integer::compareTo);

		System.out.println(o + "max");
		System.out.println(l + "min");
	}

}
