package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordString {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("srinu","java","vamsi");
		ll.stream().map(i -> new StringBuffer(i).reverse().toString()).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));
	}

}
