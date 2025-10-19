package com.test1;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElementsArrayExample {

    public static void main(String[] args) {
        int[] i = { 1, 2, 3, 2, 4, 3, 5, 5, 4 };

        // Find the most repeated element
        Entry<Integer, Long> ll = Arrays.stream(i).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        // Corrected condition check
        if (ll != null) {
            System.out.println("Most frequent element: " + ll.getKey() + " | Count: " + ll.getValue());
        } else {
            System.out.println("Array is empty.");
        }
    }
}
