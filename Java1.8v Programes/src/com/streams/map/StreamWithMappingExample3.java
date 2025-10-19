package com.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamWithMappingExample3 {
	String name;
	int age;
	double salary;

	public StreamWithMappingExample3(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "StreamWithMappingExample3 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		StreamWithMappingExample3 s1 = new StreamWithMappingExample3("srinu", 24, 45000);
		StreamWithMappingExample3 s2 = new StreamWithMappingExample3("venu", 26, 55000);
		StreamWithMappingExample3 s3 = new StreamWithMappingExample3("Battu", 25, 60000);
		StreamWithMappingExample3 s4 = new StreamWithMappingExample3("hari", 27, 35000);
		StreamWithMappingExample3 s5 = new StreamWithMappingExample3("venkat", 33, 145000);
		StreamWithMappingExample3 s6 = new StreamWithMappingExample3("surekha", 24, 75000);

		System.out.println("==============");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		System.out.println(s6.toString());
		System.out.println("======================");

		List<StreamWithMappingExample3> ll = Arrays.asList(s1, s2, s3, s4, s5, s6);

		// Approch 1 is with using map:
		// ll.stream().filter(i -> i.salary >= 40000).map(i -> i.name + "====" +
		// i.age).forEach(System.out::println);

		// 2 approch is with out using map:

		ll.stream().filter(i -> i.salary >= 55000.00).forEach(System.out::println);
	}

}
