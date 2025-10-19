package com.StreamExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("spring");
		al.add("springboot");
		al.add("Hibernate");

		System.out.println(al);

		Stream<String> st = al.stream();
		st.forEach(System.out::println);

		
		
		System.out.println("--------------------");
		al.stream().filter(i -> i.startsWith("s"))
		.forEach(i -> System.out.println(i));

	}

}
