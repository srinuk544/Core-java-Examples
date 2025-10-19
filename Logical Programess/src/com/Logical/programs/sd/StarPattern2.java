package com.Logical.programs.sd;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        
        int input = sc.nextInt();
        sc.close(); 
        
        for (int i = 1; i <= input; i++) {  
            for (int j = 1; j <= input; j++) {  
                System.out.print("* "); 
            }
            System.out.println(); //
        }
    }
}
