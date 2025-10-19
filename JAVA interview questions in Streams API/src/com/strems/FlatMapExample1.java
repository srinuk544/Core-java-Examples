package com.strems;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample1 {

	public static void main(String[] args) {
		List<String> java = Arrays.asList("core java", "adv java", "hibernate", "spring", "springboot");
		List<String> ui = Arrays.asList("html", "css", "java script", "reactjs", "Bootstrap");

		List<List<String>> fullstackjava = Arrays.asList(java, ui);

		fullstackjava.stream().forEach(i -> System.out.println(i));
		System.out.println("==========================================");

		fullstackjava.stream().flatMap(i -> i.stream()).forEach(System.out::println);

	}
}
