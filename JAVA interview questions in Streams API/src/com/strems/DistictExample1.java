package com.strems;

import java.util.Arrays;
import java.util.List;

public class DistictExample1 {
	public static void main(String[] args) {

		List<String> lis = Arrays.asList("balakrishna", "chiranjive", "nagarjuna", "mohanbabu", "mahesh", "mahesh",
				"ntr", "Arjun");
		System.out.println("------------by using distict remove the dupilicate values---------------");
		lis.stream().distinct().forEach(i -> System.out.println(i));

		System.out.println("--------get first n number of elemtns-----------");
		lis.stream().distinct().limit(3).forEach(i -> System.out.println(i));

		System.out.println("--------get skip  n number from starting position-----------");
		lis.stream().distinct().skip(3).forEach(i -> System.out.println(i));
		System.out.println("-----------from accending order-----------");
		lis.stream().sorted().distinct().forEach(i -> System.out.println(i));
	}

}
