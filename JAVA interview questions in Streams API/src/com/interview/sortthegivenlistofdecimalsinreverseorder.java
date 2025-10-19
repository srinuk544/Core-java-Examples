package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortthegivenlistofdecimalsinreverseorder {
	public static void main(String[] args) {
		List<Double> ll = Arrays.asList(1.2, 1.5, 2.8, 4.9, 5.5, 9.10);

		ll.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i -> System.out.println(i));
	}

}
