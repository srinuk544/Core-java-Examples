package com.operators;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUser = sc.next();
        System.out.print("Enter password: ");
        String inputPass = sc.next();

        if (inputUser.equals(username) && inputPass.equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
        sc.close();
    }
}
