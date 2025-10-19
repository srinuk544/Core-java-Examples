package com.test2.intermidiateoperations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipStringExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Hibernate", "Microservices");

        List<String> remainingWords = words.stream()
                                           .skip(2) // Skip first 2 words
                                           .collect(Collectors.toList());

        System.out.println(remainingWords);
        // Output: [Hibernate, Microservices]
    }
}
