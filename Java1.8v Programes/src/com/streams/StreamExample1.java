package com.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample1 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("srinu");
		name.add("java");
		name.add("katta");

		System.out.println(name);

		Stream<String> s = name.stream().filter(i -> i.startsWith("j"));
		s.forEach(System.out::println);

	}

}
