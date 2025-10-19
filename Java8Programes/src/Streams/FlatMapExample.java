package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 20, 30, 40, 50);
		List<Integer> ll = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<List<Integer>> lo = Arrays.asList(l, ll);
		List<Integer> ok = lo.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(ok);
	}

}
