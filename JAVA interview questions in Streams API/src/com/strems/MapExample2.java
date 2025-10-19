package com.strems;

import java.util.Arrays;
import java.util.List;

public class MapExample2 {
	String name;
	int age;
	double salary;

	public MapExample2(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		/*
		 * List<Integer> lis = Arrays.asList(10, 20, 1, 2, 6, 8); lis.stream().map(n ->
		 * n * 2).forEach(u -> System.out.println(u));
		 */

		MapExample2 m1 = new MapExample2("srinu", 24, 35000);
		MapExample2 m2 = new MapExample2("venkat", 34, 180000);
		MapExample2 m3 = new MapExample2("battu", 44, 15000);
		MapExample2 m4 = new MapExample2("chiru", 55, 5000);

		List<MapExample2> li = Arrays.asList(m1, m2, m3, m4);
		li.stream().filter(i -> i.salary < 8000).forEach(i -> System.out.println(i.name + "----" + i.age));
	}

}
