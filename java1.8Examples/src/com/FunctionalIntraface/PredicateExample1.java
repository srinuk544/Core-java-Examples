package com.FunctionalIntraface;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args) {
		int[] i = { 10, 20, 25, 3, 52, 35 };
		int even=0;
		int odd=0;
		Predicate<Integer> pp = number -> number % 2 == 0;
		for (int number : i) {
			
	
			if (pp.test(number)) {
				even++;
				System.out.println(number + "even");

			} else {
				odd++;
				System.out.println(number + "oddd");
			}

		}


	}

	
	
}