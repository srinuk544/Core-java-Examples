package com.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
	public static void main(String[] args) {
		String s[] = { "java", "python", "devopes", "machine learning" };

		List<String> list = Arrays.asList(s);

		list.stream().map(i -> i.toUpperCase()).filter(i -> i.startsWith("M")).mapToInt(i -> i.length())
				.forEach(System.out::println);

	}

}
