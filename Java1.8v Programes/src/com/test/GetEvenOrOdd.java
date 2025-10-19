package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lambda.intraface;

public class GetEvenOrOdd {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 25, 12, 5, 4, 6);
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println("even numberss");
		// ll.stream().filter(p).forEach(System.out::println);
		ll.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("oddd numbers");
		// ll.stream().filter(p.negate()).forEach(System.out::println);
		ll.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
	}
}
