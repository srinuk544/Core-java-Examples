package com.test2.terminalaoperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Mainmethod {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Stream<String> stream = stringList.stream();
        Optional<String> minElement = stream.min(String::compareTo);
        System.out.println(minElement.get());
    }
}