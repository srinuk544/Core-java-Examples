package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfNumbersCheckEvenorNot {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 3, 55, 44, 78, 40, 14);

		System.out.println("even numberss");
		ll.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(i -> System.out.println(i));

		System.out.println("odd numberss");
		ll.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
