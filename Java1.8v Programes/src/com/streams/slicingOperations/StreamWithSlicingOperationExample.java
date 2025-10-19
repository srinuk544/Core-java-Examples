package com.streams.slicingOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithSlicingOperationExample {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "adv java", "Hibernate", "spring", "springboot", "RestAPI");
		System.out.println("---normal foreach");
		list.stream().forEach(i -> System.out.println(i));
		System.out.println("======get first 3 elements=============");
		list.stream().limit(3).forEach(i -> System.out.println(i)); // return first 3 elements

		System.out.println("======skiping the starting pointt====");
		list.stream().skip(3).forEach(i -> System.out.println(i));
		System.out.println("=============remove the dupilicate valuess==================");
		List<String> ll = Arrays.asList("java", "java", "Hibernate", "spring", "springboot", "RestAPI");

		ll.stream().distinct().forEach(System.out::println);
	}
}
