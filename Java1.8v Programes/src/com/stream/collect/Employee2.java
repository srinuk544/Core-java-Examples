package com.stream.collect;

import java.util.*;
import java.util.stream.Collectors;

public class Employee2 {
	String name;
	int age;
	double salary;
	String country;

	public Employee2(String name, int age, double salary,String country) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country=country;	}

	@Override
	public String toString() {
		return "Employee1{name='" + name + "', age=" + age + ", salary=" + salary + "}";
	}

	public static void main(String[] args) {
		List<Employee2> employees = Arrays.asList(new Employee2("Swapna", 24, 35000,"india"),
				new Employee2("Bhumika", 32, 25000,"india"), new Employee2("Ujwala", 30, 40000,"usa"),
				new Employee2("Rekha", 26, 75200,"usa"), new Employee2("Charitha", 23, 52500,"canada"),
				new Employee2("Samantha", 42, 102020,"uk"));

		// Group employees by age
		
		Map<Boolean, List<Employee2>> employeesByCountry = employees.stream()
		        .collect(Collectors.groupingBy(e -> e.country.equals("india")));

		System.out.println("Employees grouped by whether they are from India:");
		employeesByCountry.forEach((isIndian, empList) -> 
		        System.out.println((isIndian ? "From India" : "Not from India") + ": " + empList));

		
		
	}
}
