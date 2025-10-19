package com.test2.terminalaoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("one", "two", "three", "four", "one");

		Stream<String> stream = ll.stream();
		long count = stream.filter(i -> i.startsWith("o")).count();
		System.out.println(count);
	}
}