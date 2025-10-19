package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample1 {
	public static void main(String[] args) {
		String[] ss = { "srinu", "katta", "venu", "balakrishna", "sri", "sai", "sheakar" };

		List<String> ll = Arrays.asList(ss);
		Optional<String> op = ll.stream().filter(i -> i.startsWith("s")).sorted(Comparator.reverseOrder()).skip(3)
				.findFirst();

		System.out.println(op);
	}

}
