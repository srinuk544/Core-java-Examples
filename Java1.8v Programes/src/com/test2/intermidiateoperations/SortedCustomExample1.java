package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCustomExample1 {

	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("reverse order customised");
		ll.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		List<String> l = Arrays.asList("srinu", "veu", "hari", "venkat");
		l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i -> System.out.println(i));
		System.out.println("----------------");
		l.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
