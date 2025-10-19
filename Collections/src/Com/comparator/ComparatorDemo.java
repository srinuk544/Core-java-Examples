package Com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	public double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Srinu", 25000), new Employee("Venu", 32000),
				new Employee("Gopi", 28000), new Employee("Venkat", 22000));

		System.out.println("==================based on salary accending order=======");
		employees.stream().sorted(Comparator.comparingDouble(i -> i.salary)).forEach(i -> System.out.println(i));

		System.out.println("============based on descending order================ ");
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.forEach(System.out::println);

		System.out.println("============based on accending names order================ ");
		employees.stream().sorted(Comparator.comparing(i -> i.toString())).forEach(System.out::println);

		System.out.println("============based on decending names order================ ");
		employees.stream().sorted(Comparator.comparing(i -> i.toString()).reversed()).forEach(System.out::println);

		System.out.println("--------compairing both salary and names-------------");

		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(i -> i.toString()))
				.forEach(System.out::println);
	}
}