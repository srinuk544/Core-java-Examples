package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.stream.collect.Employee2;

public class Example2 {
	private String name;
	private int age;

	public Example2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Example2 e1 = new Example2("srinu", 24);
		Example2 e2 = new Example2("mohan", 22);
		Example2 e3 = new Example2("vamsi", 21);
		Example2 e4 = new Example2("akhil", 19);
		List<Example2> list = Arrays.asList(e1, e2, e3, e4);
//==================check by age based========================
		Predicate<Example2> pp = n -> n.age >= 23;
		for (Example2 example2 : list) {
			if (pp.test(example2)) {
				System.out.println("Above the 23 age peoples:" + example2.name);

			} else {
				System.out.println("below the 20age peoples names: " + example2.name);
			}

		}

		// ==============check name start with ===============================
		Predicate<Example2> p = str -> str.name.startsWith("s");
		for (Example2 example2 : list) {
			if (p.test(example2)) {
				System.out.println("strat with name:" + example2.name);
			}

		}

	}
}
