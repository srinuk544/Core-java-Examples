package com.stream.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String department;
	private String gender;
	private int yearOfJoining;
	private double salary;

	public Employee(int id, String name, int age, String department, String gender, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", department='" + department + "', gender='"
				+ gender + "', yearOfJoining=" + yearOfJoining + ", salary=" + salary + "}";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Alice", 30, "IT", "Female", 2015, 75000);
		Employee e2 = new Employee(2, "Bob", 28, "HR", "Male", 2017, 55000);
		Employee e3 = new Employee(3, "Charlie", 35, "Finance", "Male", 2012, 95000);
		Employee e4 = new Employee(4, "Diana", 40, "IT", "Female", 2010, 105000);
		Employee e5 = new Employee(5, "Ethan", 25, "Marketing", "Male", 2019, 45000);
		Employee e6 = new Employee(6, "Fiona", 29, "HR", "Female", 2018, 58000);
		Employee e7 = new Employee(7, "George", 42, "IT", "Male", 2008, 115000);
		Employee e8 = new Employee(8, "Hannah", 33, "Finance", "Female", 2014, 88000);
		Employee e9 = new Employee(9, "Ian", 27, "Marketing", "Male", 2020, 50000);
		Employee e10 = new Employee(10, "Jack", 31, "IT", "Male", 2016, 78000);
		Employee e11 = new Employee(11, "Karen", 36, "Finance", "Female", 2011, 97000);
		Employee e12 = new Employee(12, "Leo", 38, "HR", "Male", 2009, 67000);
		Employee e13 = new Employee(13, "Mia", 26, "Marketing", "Female", 2021, 42000);
		Employee e14 = new Employee(14, "Nathan", 41, "IT", "Male", 2007, 125000);
		Employee e15 = new Employee(15, "Olivia", 39, "Finance", "Female", 2013, 102000);
		Employee e16 = new Employee(16, "Paul", 34, "HR", "Male", 2015, 62000);

		// Add employees to a list
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16);
		System.out.println("===========Employee data=====================");
		employees.forEach(i -> System.out.println(i));

		/*
		 * System.out.
		 * println("============to get male and female employees data======================"
		 * );
		 * 
		 * Map<String, List<Employee>> emp =
		 * employees.stream().collect(Collectors.groupingBy(e -> e.getGender()));
		 * emp.forEach((gender, empList) -> { System.out.println("Gender: " + gender);
		 * empList.forEach(System.out::println); System.out.println(); });
		 */

		/*
		 * System.out.println("======Print all departments===========");
		 * employees.stream().map(e -> e.department).distinct().forEach(i ->
		 * System.out.println(i));
		 */
		/*
		 * System.out.
		 * println("=============avaerage salary of employee======================");
		 * double dd = employees.stream().collect(Collectors.averagingDouble(e ->
		 * e.salary)); System.out.println("Average salary of employes:" + dd);
		 */

		/*
		 * System.out.println("==========average age of age===============");
		 * 
		 * double dd=employees.stream().collect(Collectors.averagingDouble(e->e.age));
		 * 
		 * System.out.println(dd);
		 */
		/*
		 * System.out.
		 * println("==========avrege age of male and female employee=================");
		 * Map<String, Double> mm = employees.stream() .collect(Collectors.groupingBy(e
		 * -> e.gender, Collectors.averagingInt(e -> e.age))); mm.forEach((gender,
		 * avgAge) -> System.out.println(gender + " -> " + avgAge));
		 */
		System.out.println("=========Highest salary in the department employee================");
		Optional<Employee> mm = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if (mm.isPresent()) {
			Employee emp = mm.get();
			System.out.println(emp);

		}

	}

}
