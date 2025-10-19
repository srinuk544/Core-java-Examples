package com.strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapExample1 {
	public static void main(String[] args) {

		System.out.println("===========");
		  List<String> names = Arrays.asList("srinu", "vasu", "venkat", "hari");
		  
		  names.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
		  
		  names.stream().mapToInt(name -> name.length()).forEach(i ->
		  System.out.println(i));
		 

		System.out.println("=======================for to get start with a and thire lenghts ============================");

		List<String> l = Arrays.asList("ashok", "srinu", "vamsi", "arun", "akhil", "anjali");

		l.stream().filter(i -> i.startsWith("a")).map(i->i+"---"+i.length()). forEach(System.out::println);

	}

}
