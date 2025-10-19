package com.stream.collect;
import java.util.*;
import java.util.stream.Collectors;

public class Employee1 {
    String name;
    int age;
    double salary;

    public Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }

    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("Swapna", 24, 35000),
                new Employee1("Bhumika", 32, 25000),
                new Employee1("Ujwala", 30, 40000),
                new Employee1("Rekha", 26, 75200),
                new Employee1("Charitha", 23, 52500),
                new Employee1("Samantha", 42, 102020)
        );

        // Group employees by age
        Map<Integer, List<Employee1>> employeesByAge = employees.stream()
                .collect(Collectors.groupingBy(e -> e.age));

        System.out.println("Employees grouped by age:");
        employeesByAge.forEach((age, empList) -> 
                System.out.println("Age " + age + ": " + empList));
    }
}
