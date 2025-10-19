package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenAndOddNumbers {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(11, 12, 02, 03, 5, 6, 8, 7, 10);
		System.out.println("Even numbers");
		ll.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(i -> System.out.println(i));

		System.out.println("ODD numbers");
		ll.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
