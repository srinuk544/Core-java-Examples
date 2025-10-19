package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample1 {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 20, 44, 3, 0, 5, 6);

		ll.stream().filter(i -> i % 2 == 0).limit(2).collect(Collectors.toList()).forEach(System.out::println);
	}

}
