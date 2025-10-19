package com.consumer;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printDetails = (name, age) -> 
            System.out.println("Name: " + name + ", Age: " + age);
        
        printDetails.accept("Alice", 25);
    }
}
