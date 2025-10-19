package Com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * //Accending order public int compareTo(Student other) { return this.id -
	 * other.id; // Sorts in ascending order }
	 *
	 */

	
	//Deccending  order
		public int compareTo(Student other) {
			return other.id - this.id; // Sorts in ascending order
		}
	
	
	@Override
	public String toString() {
		return id + " - " + name;
	}
}

public class DefaultNaturalSortingOrderExample {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(3, "Alice"));
		students.add(new Student(1, "Bob"));
		students.add(new Student(2, "Charlie"));

	
		Collections.sort(students);

		System.out.println(students);
		
	}
}
