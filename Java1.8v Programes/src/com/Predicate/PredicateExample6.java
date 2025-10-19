package com.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		
		int num=sc.nextInt();
		
		Predicate<Integer> predicate=i -> i%2==0;
		
		System.out.println(predicate.test(num));
		
	}

}
