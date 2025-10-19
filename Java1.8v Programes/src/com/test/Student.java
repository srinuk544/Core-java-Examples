package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	String name;
	int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student("jon", 55);
		Student s2 = new Student("son", 65);
		Student s3 = new Student("van", 51);
		Student s4 = new Student("run", 65);
		Student s5 = new Student("raj", 48);

		List<Student> ll = Arrays.asList(s1, s2, s3, s4, s5);

	//	ll.stream().sorted(Comparator.comparingInt(Student::getMarks).thenComparing(Student::getName))
			//	.forEach(System.out::println);
			//ll.stream().sorted(Comparator.compare(Student, s2));	
				
			
			Collections.sort(ll, (s8, s9) -> Integer.compare(s8.marks, s9.marks));
			
	
				
				
				
	}
}