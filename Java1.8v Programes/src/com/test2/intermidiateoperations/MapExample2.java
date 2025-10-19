package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {

	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(1, 5, 4, 6, 2, 10);
		ll.stream().map(i -> i * i).collect(Collectors.toList()).forEach(System.out::println);

	}
}
