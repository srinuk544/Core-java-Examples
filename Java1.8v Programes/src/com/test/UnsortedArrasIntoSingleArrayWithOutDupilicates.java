package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnsortedArrasIntoSingleArrayWithOutDupilicates {

	public static void main(String[] args) {
		int[] i1 = { 1, 2, 8, 8, 4, 6 };
		int[] i2 = { 11, 23, 87, 8, 23, 66, 66 };

		IntStream.concat(Arrays.stream(i1), Arrays.stream(i2)).boxed().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList())
				.forEach(System.out::println);
		

	}
  // student name marks 	
	
}
