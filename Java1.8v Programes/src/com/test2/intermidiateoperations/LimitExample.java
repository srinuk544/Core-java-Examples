package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("srinu", "java", "python", "srinu","spring");
		ll.stream().limit(2).collect(Collectors.toList()).forEach(i -> System.out.println(i));
System.out.println("==============");
		ll.stream().filter(i -> i.startsWith("s")).limit(3).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));
		System.out.println("------------------");
		
		
		ll.stream().map(i->i.length()).distinct().limit(2).collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		
		
	}

}
