package com.test2.intermidiateoperations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srinu", "java", "spring", "srinu", "springboot", "java");

        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(uniqueNames);
        
    }
}
