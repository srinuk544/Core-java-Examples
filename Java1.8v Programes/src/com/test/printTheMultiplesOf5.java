package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printTheMultiplesOf5 {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 20, 14, 23, 5, 55);
		ll.stream().filter(i -> i % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
