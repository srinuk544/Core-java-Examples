package Com.sorting;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeDemo implements Comparable<EmployeeDemo> {
	int id;
	String name;
	double salary;

	public EmployeeDemo(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// DNSO = sort by id (ascending)
	@Override
	public int compareTo(EmployeeDemo other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TreeSet with DNSO (EmployeeId ascending)
		TreeSet<EmployeeDemo> employeesById = new TreeSet<>();
		employeesById.add(new EmployeeDemo(103, "Venkat", 50000));
		employeesById.add(new EmployeeDemo(101, "Ravi", 60000));
		employeesById.add(new EmployeeDemo(102, "Anita", 55000));

		System.out.println("Employees sorted by ID (DNSO):");
		employeesById.forEach(System.out::println);

		// TreeSet with customized sorting (by Name alphabetical)
		TreeSet<EmployeeDemo> employeesByName = new TreeSet<>(Comparator.comparing(EmployeeDemo::getName));
		employeesByName.addAll(employeesById);

		System.out.println("\nEmployees sorted by Name (Custom Comparator):");
		employeesByName.forEach(System.out::println);
	}
}
