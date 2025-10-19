package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findfrequencyofeachcharacterinastring {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("programming");

		Map<Character, Long> mm = ll.stream().flatMap(str -> str.chars().mapToObj(i -> (char) i))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("frequency of each cheractor:" + mm);

		System.out.println("---------------another way-------------");

		String s = "programming";

		Map<Character, Long> m = s.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frequency of each cheractor:" + m);
	}
}
