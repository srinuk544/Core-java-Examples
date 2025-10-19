package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.lambda.intraface;

public class mergetwounsortedarraysintosinglesortedarrayExample {
	public static void main(String[] args) {
		int[] i1 = { 1, 3, 4, 6, 5, 2 };
		int[] i2 = { 7, 9, 10, 8, 12, 11 };
		List<int[]> ll = Arrays.asList(i1, i2);

		IntStream.concat(Arrays.stream(i1), Arrays.stream(i2)).sorted().boxed().collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
