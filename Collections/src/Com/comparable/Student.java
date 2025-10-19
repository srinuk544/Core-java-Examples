package Com.comparable;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("srinu", 24), new Student("venu", 26),
				new Student("Gopi", 23), new Student("venkat", 32));

		System.out.println("Without sorting:");
		students.forEach(System.out::println);
		System.out.println("by age sorting");
		students.stream().sorted(Comparator.comparingInt(i -> i.age)).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

		System.out.println("by name sorting");
		students.stream().sorted(Comparator.comparing(i -> i.toString())).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
