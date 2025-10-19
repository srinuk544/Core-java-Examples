package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {

		List<String> ll = Arrays.asList("srinu", "java", "python", "Testing", "Integration tool");
		List<Integer> ol = ll.stream().map(i -> i.length()).distinct().collect(Collectors.toList());

		System.out.println(ol);
	}
}
