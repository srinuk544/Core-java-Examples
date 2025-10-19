package com.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindcommonelementsbetweentwoarraysExample {
	public static void main(String[] args) {

		int[] i1 = { 1, 2, 3, 4, 5, 4, 2 };
		int[] i2 = { 88, 99, 55, 1, 2 };

		Set<Integer> s1 = Arrays.stream(i1).boxed().collect(Collectors.toSet());
		Set<Integer> commonElements = Arrays.stream(i2)
			    .boxed()
			    .filter(s1::contains)
			    .collect(Collectors.toSet());

			System.out.println(commonElements);


		System.out.println(commonElements);
	}

}
