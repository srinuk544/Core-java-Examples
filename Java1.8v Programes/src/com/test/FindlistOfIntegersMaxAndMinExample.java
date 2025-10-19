package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindlistOfIntegersMaxAndMinExample {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 20, 3, 6, 8, 10);

		
		Optional<Integer> max = ll.stream().max(Integer::compareTo);
		//ll.stream().sorted(Comparator.comparingInt(null));


		Optional<Integer> min = ll.stream().min(Integer::compareTo);

		System.out.println("Minimum value:" + min.orElse(null));
		System.out.println("Minimum value:" + max.orElse(null));

	}

}
