package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Srinu", 24, 350000);
		Employee e2 = new Employee("vasu", 23, 150000);
		Employee e3 = new Employee("hari", 35, 10000);
		Employee e4 = new Employee("venkat", 44, 850000);
		Employee e5 = new Employee("akhil", 18, 10000);
		Employee e6 = new Employee("ramu", 21, 20000);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6);

		Predicate<Employee> predicate1 = p -> p.age >= 24;
		Predicate<Employee> predicate2 = p -> p.salary >= 35000;

		Predicate<Employee> pp = predicate1.and(predicate2);

		for (Employee employee : list) {

			if (pp.test(employee)) {
				System.out.println("name of the employee:" + employee.name + "----" + "age of the employee:"
						+ employee.age + "----" + "salary of the empoyee:" + employee.salary);

			}

		}
	}
}
