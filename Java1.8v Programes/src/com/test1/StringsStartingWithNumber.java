package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithNumber {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("Srinu", "123java", "spring", "09paython");

		 List<String> filteredList = ll.stream()
	                .filter(i -> !i.isEmpty() && Character.isDigit(i.charAt(0)))
	                .collect(Collectors.toList());
		 
		 System.out.println(filteredList);
	}

}
