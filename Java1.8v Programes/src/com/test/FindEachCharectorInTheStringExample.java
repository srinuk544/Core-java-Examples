package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.lambda.intraface;

public class FindEachCharectorInTheStringExample {
	public static void main(String[] args) {
		String s = " java is a programming lang";

		Map<Character, Integer> m = new HashMap<>();
		for (char c : s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}
		m.forEach((k, v) -> System.out.println("'" + k + "' -> " + v));
	}

}
