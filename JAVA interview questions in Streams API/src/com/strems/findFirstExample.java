package com.strems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstExample {
	public static void main(String[] args) {
		List<String> lis = Arrays.asList("srinu", "vamsi", "hari", "venkat", "arun");
		Optional<String> names = lis.stream().filter(i -> i.startsWith("v")).findAny();
		System.out.println(names);

		Optional<String> name = lis.stream().sorted().skip(2).findFirst();
		System.out.println(name);
	}

}
