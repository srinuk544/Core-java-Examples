package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	private String firstName;
	private String lastName;
	private String city;
	private int grade; // Now numeric grade
	private int age;
	private String department;

	public Student(String firstName, String lastName, String city, int grade, int age, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.grade = grade;
		this.age = age;
		this.department = department;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public int getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", city='" + city
				+ '\'' + ", grade=" + grade + ", age=" + age + ", department='" + department + '\'' + '}';
	}

	public static void main(String[] args) {
		Student s1 = new Student("Srinu", "Katta", "Hyderabad", 85, 23, "CSE");
		Student s2 = new Student("Vasu", "Reddy", "Vijayawada", 72, 22, "ECE");
		Student s3 = new Student("Hari", "Kumar", "Bangalore", 90, 24, "ME");
		Student s4 = new Student("Chiru", "Rao", "Chennai", 60, 21, "EEE");
		Student s5 = new Student("Naga", "Reddy", "Hyderabad", 78, 23, "CSE");
		Student s6 = new Student("Ravi", "Sharma", "Mumbai", 88, 25, "CE");
		Student s7 = new Student("Anil", "Kumar", "Delhi", 69, 22, "CSE");
		Student s8 = new Student("Sita", "Devi", "Hyderabad", 95, 21, "ECE");
		Student s9 = new Student("Kiran", "Reddy", "Vijayawada", 55, 24, "ME");
		Student s10 = new Student("Priya", "Sharma", "Chennai", 80, 23, "CSE");

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

		students.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------");
		List<Student> l1 = students.stream().filter(i -> i.getCity().equalsIgnoreCase("Hyderabad"))
				.filter(i -> i.getGrade() > 80).collect(Collectors.toList());

		System.out.println("find all student from hyd location with > 80 grade score :" + l1);

		System.out.println("---------------------------------------------------------------------------------------");

		Student s = students.stream().max(Comparator.comparingInt(Student::getGrade)).orElse(null);
		System.out.println("--- highest grade of student :" + s);

		students.stream().sorted(Comparator.comparingInt(Student::getGrade).reversed()).findFirst()
				.ifPresent(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("how many students are studying each department counting");
		Map<String, Long> map = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
		map.forEach((dept, count) -> System.out.println(dept + " -> " + count));

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(" students are studying one partucular  department counting");

		long s11 = students.stream().filter(i -> i.getDepartment().equalsIgnoreCase("CSE")).count();

		System.out.println("cse dept:" + s11);

	}

}
