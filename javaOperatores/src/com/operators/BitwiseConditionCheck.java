package com.operators;

public class BitwiseConditionCheck {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;

        // Use bitwise operators correctly
        if (a > b | b > c) {  // No need for "!= 0"
            System.out.println("Condition 1");
        } else if (a == b & c != b) {
            System.out.println("Condition 2");
        } else {
            System.out.println("Condition 3");
        }
    }
}
