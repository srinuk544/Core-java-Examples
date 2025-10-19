package com.strems;

import java.util.Arrays;
import java.util.List;

public class peek {
	public static void main(String[] args) {
		
	
	List<String> names = Arrays.asList("srinu", "vasu");
	names.stream()
	     .peek(n -> System.out.println("Before: " + n))
	     .map(String::toUpperCase)
	     .peek(n -> System.out.println("After: " + n))
	     .forEach(System.out::println);
	
}}

