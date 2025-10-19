package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindfirstExample {
	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(10, 12, 16, 18, 25);

		Optional<Integer> ol = ll.stream().filter(i -> i % 2 == 0).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		System.out.println(ol);
	}

}
