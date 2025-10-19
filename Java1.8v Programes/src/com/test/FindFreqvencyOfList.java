package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindFreqvencyOfList {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("java", "Hibernate", "spring", "springboot", "java", "Hibernate");

		Map<String, Integer> m = new HashMap<>();
		for (String string : l) {
			m.put(string, m.getOrDefault(string, 0) + 1);

		}
		System.out.println("search  freqvency ");
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());

		}

	}

}
