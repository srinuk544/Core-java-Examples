package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample10 {
	private String name;
	private int age;

	public PredicateExample10(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("Name of the person :" + name + "---" + "Age of the person:" + age);
	}

	public static void main(String[] args) {
		PredicateExample10 p0 = new PredicateExample10("srinu", 24);
		PredicateExample10 p1 = new PredicateExample10("venu", 26);
		PredicateExample10 p2 = new PredicateExample10("Akhil", 18);
		PredicateExample10 p3 = new PredicateExample10("Arun", 17);
		/*
		 * p.show(); p1.show(); p2.show(); p3.show();
		 */
		
		
		List<PredicateExample10> number=Arrays.asList(p0,p1,p2,p3);
		

		Predicate<PredicateExample10> pp = num -> num.age>=18;
		for (PredicateExample10 predicateExample10 : number) {
			if(pp.test(predicateExample10)) {
				System.out.println(predicateExample10.name);
				
			}
			
		}
	}

}
