package com.stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

	String name;
	String address;
	int age;

	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person p1 = new Person("srinu", "India", 23);
		Person p2 = new Person("jon", "uk", 35);
		Person p3 = new Person("kingkonf", "chaina", 15);
		Person p4 = new Person("joden", "usa", 53);
		Person p5 = new Person("trump", "india", 65);

		List<Person> p = Arrays.asList(p1, p2, p3, p4, p5);

		List<Person> ll = p.stream().filter(o -> o.age>=30).collect(Collectors.toList());

		ll.forEach(i -> System.out.println(i));

	}
}