package com.inter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupbyExample1 {
    private String name;
    private double salary;
    private int age;

    // Constructor
    public GroupbyExample1(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {   // ✅ Getter for age
        return age;
    }

    @Override
    public String toString() {
        return "Employeesalary [name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        GroupbyExample1 e1 = new GroupbyExample1("Srinu", 45000, 24);
        GroupbyExample1 e2 = new GroupbyExample1("Vamsi", 55000, 28);
        GroupbyExample1 e3 = new GroupbyExample1("Hari", 60000, 30);
        GroupbyExample1 e4 = new GroupbyExample1("Aruna", 70000, 28);

        List<GroupbyExample1> li = Arrays.asList(e1, e2, e3, e4);

        // ✅ Group by Age
        Map<Integer, List<GroupbyExample1>> mm =
            li.stream().collect(Collectors.groupingBy(GroupbyExample1::getAge));

        System.out.println("After group by their ages: " + mm);
    }
}
