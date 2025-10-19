package com.stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private int age;
	private String country;

	public Employee(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;

	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", country=" + country + "]";
	}




	public static void main(String[] args) {
		Employee e1 = new Employee("srinu", 23, "india");
		Employee e2 = new Employee("vamsi", 22, "usa");
		Employee e3 = new Employee("venu", 26, "uk");
		Employee e4 = new Employee("battu", 26, "india");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4);

		List<Employee> ll = list.stream().filter(e -> e.country.equals("india"))
				.collect(Collectors.toList());

		ll.forEach(System.out::println);
	}

}
