package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(5, 6, 7);
		ll.stream().map(n -> n * n).collect(Collectors.toList()).forEach(i -> System.out.println(i));

		List<String> lll = Arrays.asList("11", "12", "13", "14");

		List<Integer> ok = lll.stream().map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(ok);
	}

}
