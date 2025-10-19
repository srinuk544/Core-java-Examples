package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEample {

	private String name;
	private int id;

	public SortedEample(String name, int id) {

		this.name = name;
		this.id = id;

	}

	@Override
	public String toString() {
		return "SortedEample [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		/*
		 * List<String> ll=Arrays.asList("srinu","venu","hari","battu","anka");
		 * 
		 * ll.stream().sorted().collect(Collectors.toList()).forEach(i->System.out.
		 * println(i));
		 */

		SortedEample s1 = new SortedEample("srinu", 1);
		SortedEample s2 = new SortedEample("vasu", 5);
		SortedEample s3 = new SortedEample("vamsi", 11);
		SortedEample s4 = new SortedEample("kittu", 8);
		SortedEample s5 = new SortedEample("hari", 0);
		SortedEample s6 = new SortedEample("battu", 5);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		System.out.println(s6.toString());
		System.out.println("=========================================");
		List<SortedEample> ll = Arrays.asList(s1, s2, s3, s4, s5, s6);

		ll.stream().sorted(Comparator.comparingInt(p -> p.id)).collect(Collectors.toList())
				.forEach(System.out::println);

		
		System.out.println("==============================================");
		
		ll.stream().sorted(Comparator.comparing(p -> p.name)).collect(Collectors.toList()).forEach(i->System.out.println(i));
	}

}
