package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamWithFillterExample1 {
	public static void main(String[] args) {
		String names[] = { "java", "Oracle", "SQl", "python" };
		List<String> list = Arrays.asList(names);

		list.stream().filter(i -> i.toUpperCase().startsWith("P")).forEach(System.out::println);

	
	}

}
