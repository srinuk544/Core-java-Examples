package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("srinu", "venu", "venkat", "vasu", "thopu");

		Optional<String> optional = ll.stream().filter(i -> i.startsWith("s")).findFirst();

		optional.ifPresent(System.out::println);
	}

}
