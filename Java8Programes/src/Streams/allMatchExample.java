package Streams;

import java.util.Arrays;
import java.util.List;

public class allMatchExample {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("java is programming lang", "python is programming lang",
				"Spring is frame work");
		boolean ok = ll.stream().allMatch(i -> i.contains("is"));

		System.out.println(ok);
	}

}
