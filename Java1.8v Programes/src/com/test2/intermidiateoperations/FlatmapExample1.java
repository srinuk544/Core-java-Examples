package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample1 {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("java", "spring");
		List<String> add = Arrays.asList("Gosling", "Rod Johnson");

		List<List<String>> lis = Arrays.asList(name, add);
		lis.stream().flatMap(i -> i.stream()).collect(Collectors.toList()).forEach(i -> System.out.println(i));
	}

}
