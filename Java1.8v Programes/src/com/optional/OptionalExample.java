package com.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		OptionalExample example = new OptionalExample();

		System.out.println(example.getMsgService(100).orElse("Not Found")); 
		System.out.println(example.getMsgService(105).orElse("Not Found")); 
		System.out.println(example.getMsgService(110).orElse("Not Found")); 
		System.out.println(example.getMsgService(200).orElse("Not Found"));
	}

	public Optional<String> getMsgService(int id) {
		String name = null;

		if (id == 100) {
			name = "Java";
		} else if (id == 105) {
			name = "Python";
		} else if (id == 110) {
			name = "DSA";
		}

		return Optional.ofNullable(name); 
	}
}
