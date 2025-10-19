package com.test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnIntegerArrayExample {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 2, 3, 4, 5};

        // Convert to List and reverse
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        // Print reversed array
        System.out.println(list);
    }
}
