package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample4 {

	String name;
	int id;

	public MapExample4(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public static void main(String[] args) {
		MapExample4 m1 = new MapExample4("srinu", 10);
		MapExample4 m2 = new MapExample4("joi", 41);
		MapExample4 m3 = new MapExample4("vishnu", 78);
		MapExample4 m4 = new MapExample4("varsha", 66);

		List<MapExample4> ll = Arrays.asList(m1, m2, m3, m4);

		ll.stream().map(i -> i.name).collect(Collectors.toList()).forEach(System.out::println);

	}

}
