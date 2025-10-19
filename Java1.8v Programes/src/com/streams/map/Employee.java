package com.streams.map;

import java.util.stream.Stream;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("srinu", 24, 35000);
		Employee e2 = new Employee("haritha", 35, 85000);
		Employee e3 = new Employee("subalakshmi", 23, 22000);
		Employee e4 = new Employee("vani", 26, 42000);
		Employee e5 = new Employee("vamsi", 23, 25000);

		System.out.println("Employee details:" + "=====================");

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println("=======================");
		System.out.println("===================after stream operation===================");
		Stream<Employee> st = Stream.of(e1, e2, e3, e4, e5);
		st.filter(i -> i.salary >= 40000).map(i -> i.name + "----" + i.age).forEach(i -> System.out.println(i));
	}

}
