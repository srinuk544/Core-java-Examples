package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Examaple1 {

	static void great(List<String> myList) {

		List<String> ll = myList.stream().distinct().collect(Collectors.toList());
		System.out.println(ll);
	}

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("apple", "banana", "apple", "orange", "banana");

		// Examaple1 e = new Examaple1();
		great(myList);

	}
}
