package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatchExample {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("java is programming lang", "python is programming lang",
				"Spring is frame work");

		boolean ol = ll.stream().anyMatch(i -> i.startsWith("java"));

		System.out.println(ol);
	}

}
