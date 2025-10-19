package com.teriminal.matchingOperration;

import java.util.Arrays;
import java.util.List;

public class Person {

	String name;
	String address;
	int age;

	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;

	}

	public static void main(String[] args) {
		Person p1 = new Person("srinu", "India", 23);
		Person p2 = new Person("jon", "uk", 35);
		Person p3 = new Person("kingkonf", "chaina", 15);
		Person p4 = new Person("joden", "usa", 53);
		Person p5 = new Person("trump", "canada", 65);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		boolean b = persons.stream().anyMatch(i -> i.age > 70);
		System.out.println("Is any old person in the list::" + b);

		boolean b1 = persons.stream().anyMatch(i -> i.address.equals("India"));
		System.out.println(" in the list any one matching the indian::" + b1);

		boolean b2 = persons.stream().allMatch(i -> i.address.equals("India"));
		System.out.println(" in the list all  matching the indian::" + b2);

		boolean b3 = persons.stream().noneMatch(i -> i.address.equals("mexico"));
		System.out.println(" in the list no one matching the indian::" + b3);
		
		
		
		
		persons.stream()
	       .filter(i -> i.address.equals("India"))
	       .forEach(i -> System.out.println("Person from India: " + i.name));

	}

}
