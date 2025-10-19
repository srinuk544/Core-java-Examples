package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.lambda.intraface;

public class StreamExample2 {
	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> al = new ArrayList<>(); al.add(1); al.add(5); al.add(10);
		 * al.add(7); al.add(12);
		 * 
		 * System.out.println("just corrsponding data:" + al);
		 * 
		 * Stream<Integer> s = al.stream(); Stream<Integer> ss = s.filter(i -> i > 8);
		 * ss.forEach(System.out::println);
		 */

		Integer[] i = { 1, 3, 4, 8, 9, 10, 12 };
		List<Integer> list = Arrays.asList(i);

		/*
		 * Stream<Integer> s = list.stream(); Stream<Integer> ss = s.filter(o -> o > 5);
		 * ss.forEach(System.out::println);
		 */

		list.stream().filter(o -> o%2==0).forEach(o -> System.out.println(o));

	}

}
