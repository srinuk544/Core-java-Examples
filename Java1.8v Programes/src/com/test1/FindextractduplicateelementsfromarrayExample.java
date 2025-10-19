package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindextractduplicateelementsfromarrayExample {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5, 56, 4, 8, 4 };

		List<Integer> ll = Arrays.stream(i)

				.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(num -> num.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(ll);
	}

}
