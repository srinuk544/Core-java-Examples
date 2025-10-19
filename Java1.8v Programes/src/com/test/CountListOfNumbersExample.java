package com.test;

import java.util.Arrays;
import java.util.List;
import com.lambda.intraface;

public class CountListOfNumbersExample {
	private static int sumDigits(int num) {
		return String.valueOf(num).chars().map(i -> i - '0').sum();

	}

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(11, 12, 45, 8, 9);

		int l = ll.stream().mapToInt(CountListOfNumbersExample::sumDigits).sum();
		System.out.println(l);

	}

}
