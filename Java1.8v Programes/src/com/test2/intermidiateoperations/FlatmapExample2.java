package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample2 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("java is was a high level programming lang");
		List<String> words = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				.collect(Collectors.toList());
		System.out.println(words);

	}

}
