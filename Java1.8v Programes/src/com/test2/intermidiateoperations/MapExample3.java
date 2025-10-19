package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample3 {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("java", "spring", "springboot", "java", "msql");

		List<Integer> ok=ll.stream().map(i -> i.length()).distinct().collect(Collectors.toList());
		
		System.out.println(ok);
	}

}
