package com.test1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCharactersinString {
	public static void main(String[] args) {
		String s = "programming";

		Map<Character, Long> oo = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(Entry -> Entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(oo);
	}

}
