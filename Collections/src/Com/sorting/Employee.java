package Com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("srinu", 1, 25000);
		Employee e2 = new Employee("jon", 10, 28500);
		Employee e3 = new Employee("phal", 5, 35000);
		Employee e4 = new Employee("vasu", 13, 18000);
		Employee e5 = new Employee("subbu", 8, 40000);

		List<Employee> ll = Arrays.asList(e1, e2, e3, e4, e5);
		//ll.stream().sorted().forEach(System.out::println);
		
		
		Collections.sort(ll);
		
		System.out.println(ll);
		
	}

}
