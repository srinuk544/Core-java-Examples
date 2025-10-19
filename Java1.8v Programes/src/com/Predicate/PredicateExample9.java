package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample9 {
    public static void main(String[] args) {

        String[] s = { "java", "adv java", "hibernate", "spring", "springBoot" };

        // Predicate to check if a string starts with "s"
        Predicate<String> pp = name -> name.startsWith("s");

        // Loop through the array and apply predicate
        for (String string : s) {
            if (pp.test(string)) {
                System.out.println(string);
            }
        }
        
        System.out.println("============================");
        
    List<Integer> lis=Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> p = num -> num % 2 == 0;

       for (Integer integer : lis) {
		if(p.test(integer)) {
			System.out.println(integer);
		}
	}
	}
        	
        
    }

