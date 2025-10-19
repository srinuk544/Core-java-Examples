package com.strems;

import java.util.Arrays;
import java.util.List;

public class MatchingExample1 {
	String name;
	String address;
	int age;

	public MatchingExample1(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;

	}

	public static void main(String[] args) {
		MatchingExample1 m1 = new MatchingExample1("Srinu", "rajampalli", 24);
		MatchingExample1 m2 = new MatchingExample1("vamsi", "rajampalli", 23);
		MatchingExample1 m3 = new MatchingExample1("venu", "ongole", 26);
		MatchingExample1 m4 = new MatchingExample1("hari", "kondepi", 26);
		MatchingExample1 m5 = new MatchingExample1("battu", "chemakurthy", 26);
		MatchingExample1 m6 = new MatchingExample1("gopi", "chemakurthy", 22);

		List<MatchingExample1> lis = Arrays.asList(m1, m2, m3, m4, m5, m6);

		boolean anymatch = lis.stream().anyMatch(i -> i.address.equals("rajampalli"));

		boolean allmatch = lis.stream().allMatch(i -> i.age > 20);

		boolean nonmatch = lis.stream().noneMatch(i -> i.address.equalsIgnoreCase("hyd"));

		System.out.println(anymatch);
		System.out.println(allmatch);
		System.out.println(nonmatch);

	}

}
