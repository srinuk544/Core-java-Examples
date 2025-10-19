package com.functionalInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExamole {
	public static void main(String[] args) {

		/*
		 * Predicate<Integer> pp=i->i%2==0; System.out.println(pp.test(20));
		 * 
		 * 
		 * List<Integer> nums = Arrays.asList(10, 15, 20, 25); Predicate<Integer>
		 * divisibleBy5 = n -> n % 5 == 0; List<Integer> result =
		 * nums.stream().filter(divisibleBy5).collect(Collectors.toList());
		 * System.out.println(result);
		 */

		/*
		 * List<Integer> lis = Arrays.asList(10, 12, 14, 10, 12, 15, 66); List<Integer>
		 * l = lis.stream().distinct().collect(Collectors.toList());
		 * System.out.println(l);
		 * 
		 * 
		 * //10,12
		 * 
		 * Set<Integer> s=new HashSet<>(); Set<Integer>
		 * ll=lis.stream().filter(i->!s.add(i)).collect(Collectors.toSet());
		 * //Set<Integer> ll=
		 * lis.stream().filter(i->lis.indexOf(i)!=lis.lastIndexOf(i)).collect(Collectors
		 * .toSet());
		 * 
		 * System.out.println(ll);
		 */
		
		
		
		List<String> l=Arrays.asList("srinu","vasu","katta","srinu","katta");
		List<String> s=l.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println(s);
		
		
		
		l.stream().filter(i->l.indexOf(i)!=l.lastIndexOf(i)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
	}

}
