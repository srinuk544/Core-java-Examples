package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.lambda.intraface;

public class DupilicateElemenstRemove {
	public static void main(String[] args) {

		int i[] = { 1, 2, 11, 1, 22, 33, 10, 11, 33 };

		List<Integer> ll = Arrays.stream(i).distinct().boxed().collect(Collectors.toList());
		ll.forEach(System.out::println);
		System.out.println("remove dupilicate elementss");

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 11, 2, 10);
		l.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}