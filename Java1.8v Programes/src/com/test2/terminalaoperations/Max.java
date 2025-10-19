package com.test2.terminalaoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("one", "two", "three", "four", "one");

		Stream<String> stream = ll.stream();
		Optional<String> count = stream.max(String::compareTo);
		System.out.println(count.get());
	}
}