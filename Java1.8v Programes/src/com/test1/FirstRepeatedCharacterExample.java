package com.test1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterExample {

	public static void main(String[] args) {

		String s = "katta";

		Optional<Character> op = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(Entry -> Entry.getValue() > 1).map(Map.Entry::getKey).findFirst();

		System.out.println("First repeated character: " + op.orElse(null));
	}

}
