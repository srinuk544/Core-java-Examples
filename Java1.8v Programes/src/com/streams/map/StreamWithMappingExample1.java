package com.streams.map;

import java.util.LinkedList;

public class StreamWithMappingExample1 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("india");
		ll.add("usa");
		ll.addLast("uk");
		ll.add("cannada");
		System.out.println(ll);

		System.out.println("===============after stream using=========");

		ll.stream().map(i -> i.toUpperCase()).forEach(System.out::println);

		ll.stream().mapToInt(i -> i.length()).forEach(i -> System.out.println(i));
		System.out.println("==================");
		ll.stream().map(i -> i.toUpperCase()).filter(i->i.startsWith("I")).forEach(System.out::println);

	}

}
