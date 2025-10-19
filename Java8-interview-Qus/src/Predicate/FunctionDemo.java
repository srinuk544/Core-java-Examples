package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo {
    String name;
    int id;        
    String course;

    public FunctionDemo(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "FunctionDemo [name=" + name + ", id=" + id + ", course=" + course + "]";
    }

    public static void main(String[] args) {
        FunctionDemo f1 = new FunctionDemo("Venkat", 101, "Java");
        FunctionDemo f2 = new FunctionDemo("Hari", 102, "Python");
        FunctionDemo f3 = new FunctionDemo("Srinu", 103, "Mechanical");

        List<FunctionDemo> list = Arrays.asList(f1, f2, f3);

        // Function to get student by ID
        Function<Integer, String> fun = f -> {
            for (FunctionDemo functionDemo : list) {
                if (functionDemo.id == f) {
                    return functionDemo.toString();
                }
            }
            return "No student found with ID: " + f;
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student id: ");
        int input = sc.nextInt();

        // Apply with user input
        String result = fun.apply(input);
        System.out.println(result);

        sc.close();
    }
}
