package com.strems;

import java.util.Arrays;
import java.util.List;

public class FillterExample1 {
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(12, 20, 15, 5, 16, 17, 8);
		System.out.println("============for even numbers=======");
		li.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
		System.out.println("============for odd numbers=======");
		li.stream().filter(num -> num % 2 != 0).forEach(i -> System.out.println(i));
	}

}
