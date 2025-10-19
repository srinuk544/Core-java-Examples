package com.streams.flatmap;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Srinu", "vamsi", "Venkatesh", "Akhil");

		List<String> address = Arrays.asList("Ap-state", "prakasam-distict", "Darsi-mandal", "Rajampalli-Villege");

		List<List<String>> ll = Arrays.asList(names, address);
		System.out.println("================Normal thing============");
		ll.stream().forEach(System.out::println);

		System.out.println("============Buy using the flat map and getting one by one form===============");

		ll.stream().flatMap(i -> i.stream()).map(i -> i.toUpperCase())
				.forEach(System.out::println);
	}

}
