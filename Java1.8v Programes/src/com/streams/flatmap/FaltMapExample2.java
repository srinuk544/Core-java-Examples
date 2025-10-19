package com.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaltMapExample2 {
	public static void main(String[] args) {
		ArrayList<String> Backend = new ArrayList<>();
		Backend.add("java");
		Backend.add("adv java");
		Backend.add("hibernate");
		Backend.add("spring");
		Backend.add("springboot");
		Backend.add("springboot");

		ArrayList<String> Ui = new ArrayList<>();
		Ui.add("Html");
		Ui.add("css");
		Ui.add("java script");
		Ui.add("rect js");
		Ui.add("angular");
		System.out.println("==== Before using flat mapp===============");
		List<List<String>> course = Arrays.asList(Backend, Ui);
		course.stream().forEach(i -> System.out.println(i));

		System.out.println("-------------after using flat map--------------");

		course.stream().flatMap(i -> i.stream()).distinct()
		.forEach(System.out::println);
		
	}

}
