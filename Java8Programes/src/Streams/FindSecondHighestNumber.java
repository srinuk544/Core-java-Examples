package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {
	public static void main(String[] args) {
		int[] i = { 10, 20, 30, 40, 55, 66, 78 };

		List<Integer> l = Arrays.stream(i).boxed().collect(Collectors.toList());

		Optional<Integer> sec = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(sec);

	}

}
