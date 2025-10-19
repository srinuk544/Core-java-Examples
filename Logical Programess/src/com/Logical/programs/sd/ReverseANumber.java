package com.Logical.programs.sd;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");  // Fixed typo in message

        int num = sc.nextInt();
        sc.close();  // Closing scanner to prevent resource leaks

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("After reverse: " + rev);
    }
}
