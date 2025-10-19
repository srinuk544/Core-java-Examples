package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindfrequencyofeachelementinanarrayorAList {
	public static void main(String[] args) {

		System.out.println("-----By using list------------");
		List<String> ll = Arrays.asList("Benguluru", "kolkatha", "chennai", "mumbai", "pune", "andhra", "hyd",
				"chennai", "hyd");

		Map<String, Long> m = ll.stream().distinct().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		System.out.println("frequencey of each element:" + m);

		System.out.println("-----------by using array-------------");

		String[] cities = { "Benguluru", "kolkatha", "chennai", "mumbai", "pune", "andhra", "hyd", "chennai", "hyd" };

		Map<String, Long> mm = Arrays.stream(cities).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println("frequence of each element:" + mm);
	}

}
