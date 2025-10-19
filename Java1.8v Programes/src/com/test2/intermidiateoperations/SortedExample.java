package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 25, 3,2,6,14, 4, 10, 15);
		System.out.println("even numbers with sortedd");
		ll.stream().filter(i -> i % 2 == 0).skip(3)  .sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Odd numbers printedd with sortedd");
		
		ll.stream().filter(i -> i % 2!= 0).sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
