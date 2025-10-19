package com.strems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorExample1 {
	String name;
	String country;

	CollectorExample1(String name, String country) {

		this.name = name;
		this.country = country;

	}

	public static void main(String[] args) {
		CollectorExample1 c1 = new CollectorExample1("srinu", "India");
		CollectorExample1 c2 = new CollectorExample1("sarth", "usa");
		CollectorExample1 c3 = new CollectorExample1("venkat", "uk");
		CollectorExample1 c4 = new CollectorExample1("indra", "Irland");
		CollectorExample1 c5 = new CollectorExample1("battu", "India");
		CollectorExample1 c6 = new CollectorExample1("vamsi", "India");

		List<CollectorExample1> lis = Arrays.asList(c1, c2, c3, c4, c5, c6);

		List<String> india = lis.stream().filter(n -> n.country.equals("India")).map(n -> n.country + "---" + n.name).

				collect(Collectors.toList());

		System.out.println(india);
		System.out.println("=====================================================");

		Map<String, List<CollectorExample1>> groupedByCountry = lis.stream()
				.collect(Collectors.groupingBy(n -> n.country));

		groupedByCountry.forEach((country, people) -> {
			System.out.println(country + " -> " + people.stream().map(p -> p.name).collect(Collectors.joining(", ")));
		});

	}

}
