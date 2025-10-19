package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dupilicatesRemove {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("srinu", "benguluru", "kolkata", "srinu", "hyd", "chennai", "hyd", "chennai");
		ll.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}
