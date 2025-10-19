package com.inter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.strems.CollectorExample1;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;

	// Constructor
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	// ToString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(101, "Srinu", 24, "Male", "IT", 2021, 45000),
				new Employee(102, "Vamsi", 28, "Male", "Finance", 2019, 55000),
				new Employee(103, "Hari", 30, "Male", "HR", 2018, 60000),
				new Employee(104, "Aruna", 26, "Female", "IT", 2022, 70000),
				new Employee(105, "Divya", 32, "Female", "Finance", 2015, 80000),
				new Employee(106, "Ravi", 29, "Male", "Marketing", 2017, 50000),
				new Employee(107, "Kavya", 27, "Female", "HR", 2020, 65000),
				new Employee(108, "Anil", 35, "Male", "IT", 2012, 90000),
				new Employee(109, "Meena", 31, "Female", "Finance", 2016, 75000),
				new Employee(110, "Surya", 40, "Male", "Management", 2010, 120000),
				new Employee(111, "Rohit", 23, "Male", "Product Development", 2023, 45000),
				new Employee(112, "Arjun", 26, "Male", "Product Development", 2020, 60000));

		// employees.stream().forEach(i -> System.out.println(i));

		System.out.println(
				"----1.How many male and female employees are there in the organization?----------------------");

		Map<String, Long> ll = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("count the female and male :" + ll);

		// another way

		long males = employees.stream().filter(i -> i.getGender().equalsIgnoreCase("male")).count();
		System.out.println("count of all male :" + males);
		long female = employees.stream().filter(i -> i.getGender().equalsIgnoreCase("female")).count();
		System.out.println("count of all female :" + female);

		System.out.println("----------------2.print the name of all department in the organization?------------------");
		employees.stream().map(i -> i.getDepartment()).distinct().collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

		System.out.println("-------3.what is the average age of male and female employees?------------------------");
		Map<String, Double> l = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("average age of male and female:" + l);

		System.out.println(
				"----------------4.get the detailes of highest paid employees in  the organization?-----------------------");

		Optional<Employee> d = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("hightest paid employee:" + d);
		System.out.println(
				"----------------5.get the names of all employes who have joined after 2015?-----------------------");
		employees.stream().filter(i -> i.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(i -> System.out.println(i));

		System.out.println("---------6.count the number of employees in each department?----------------");

		Map<String, Long> map = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("count number of employes in each dep:" + map);

		System.out.println("-------7.what is the average salary of each department?------------");
		Map<String, Double> m = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("average salary of each department:" + m);

		System.out.println(
				"-------------8.get the detailes of youngest male employee in the product development department?-----------");

		Optional<Employee> youngestMale = employees.stream()
				.filter(i -> i.getDepartment().equalsIgnoreCase("Product Development"))
				.filter(i -> i.getGender().equalsIgnoreCase("Male")).min(Comparator.comparingInt(Employee::getAge));

		System.out.println("Youngest Male Employee in Product Development: " + youngestMale.orElse(null));

		System.out.println("----9.who has the most working experience in the organization?----------");
		Optional<Employee> mmm = employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(mmm);

		System.out.println(
				"----10.how many male and female employees are there in sales and marketing team?------------");
		Map<String, Long> mm = employees.stream().filter(
				i -> i.getDepartment().equalsIgnoreCase("Finance") || i.getDepartment().equalsIgnoreCase("Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("how many male and female employees are there in Finance + Marketing: " + mm);

		System.out.println("---11.what is the average salary of male and female employees?---------");
		Map<String, Double> mo = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("average salary of male and female employees:" + mo);

		System.out.println("---12.list down the names of all employees in each department?-----------");

		Map<String, List<String>> mp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		mp.forEach((dept, names) -> {
			System.out.println(dept + " : " + names);
		});
		
		System.out.println("---13. what is the average salary and total salary of the whole organization?-------");

		Double averageSalary = employees.stream()
		        .collect(Collectors.averagingDouble(Employee::getSalary));

		Double totalSalary = employees.stream()
		        .collect(Collectors.summingDouble(Employee::getSalary));

		System.out.println("Average Salary of organization: " + averageSalary);
		System.out.println("Total Salary of organization: " + totalSalary);

		
		
		
		
		
		
		
		
		
		
		
	}
}