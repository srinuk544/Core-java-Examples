package com.MultiThreadingExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            al.add(i);
        }

        
        List<Integer> even = al.stream()
                               .filter(n -> n % 2 == 0)
                               .collect(Collectors.toList());

        List<Integer> odd = al.stream()
                              .filter(n -> n % 2 != 0)
                              .collect(Collectors.toList());

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
    }
}
