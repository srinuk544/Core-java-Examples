package com.operators;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
        int i = 15;
while (i <= 10 && i % 2 == 0) {  // Loop runs only if i is even
    System.out.println(i);
    i++;
}


int a = 5, b = 5;
System.out.println((a > 10) & (b++ > 5)); // b is incremented
System.out.println((a > 10) && (b++ > 5)); // b is NOT incremented


    }
}