package Com.comparablee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	int id;
	String name;
	String mail;
	double marks;

	public Student(int id, String name, String mail, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mail=" + mail + ", marks=" + marks + "]";
	}

	// for accending order this.id-o.id; // normal order
	// for deccending order o.id-this.id;  // Reverse order
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);         
	}

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(5, "chinny", "c@gmail.com", 50),
				new Student(4, "balu", "b@gmail.com", 80), new Student(6, "ammu", "a@gmail.com", 60),
				new Student(3, "deepu", "d@gmail.com", 90));

		Collections.sort(students);
		// System.out.println(students);

		for (Student student : students) {
			System.out.println(student.name);
		}

	}
}
