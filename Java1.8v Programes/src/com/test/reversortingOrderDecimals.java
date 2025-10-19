package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class reversortingOrderDecimals {

	public static void main(String[] args) {
		List<Double> ll = Arrays.asList(11.2, 5.23, 10.12, 14.21);
ll.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
