package com.operators;
public class TriangleValidation {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 12;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
