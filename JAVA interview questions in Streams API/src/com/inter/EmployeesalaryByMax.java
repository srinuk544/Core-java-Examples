package com.inter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeesalaryByMax {
	private String name;
	private double salary;
	private int age;

	// Constructor
	public EmployeesalaryByMax(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employeesalary [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		EmployeesalaryByMax e1 = new EmployeesalaryByMax("Srinu", 45000, 24);
		EmployeesalaryByMax e2 = new EmployeesalaryByMax("Vamsi", 55000, 28);
		EmployeesalaryByMax e3 = new EmployeesalaryByMax("Hari", 60000, 30);

		List<EmployeesalaryByMax> employees = Arrays.asList(e1, e2, e3);

		employees.forEach(System.out::println);
		/*
		 * DoubleSummaryStatistics sta =
		 * employees.stream().collect(Collectors.summarizingDouble(i -> i.salary));
		 * System.out.println(sta.getMax()); System.out.println(sta.getMin());
		 * System.out.println(sta.getAverage());
		 */
System.out.println("==========================================================");


		Optional<EmployeesalaryByMax> op = employees.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
		System.out.println("max salary of an employee:" + op);
		System.out.println("============other way------------------");
		Optional<EmployeesalaryByMax> o=employees.stream().min(Comparator.comparingInt(i->i.age));
		System.out.println("max salary of an employee:"+o);

	}

}
