package com.test2.terminalaoperations;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class collect {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("five");

		Stream<String> stream = stringList.stream();
		List<String> uppercaseList = stream.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseList);
	}
}