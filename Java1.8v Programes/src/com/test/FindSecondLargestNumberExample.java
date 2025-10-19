package com.test;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumberExample {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(11, 10, 12, 98);
		ll.stream().sorted((a, b) -> b - a).skip(1).limit(1).forEach(System.out::println);
	}

}
