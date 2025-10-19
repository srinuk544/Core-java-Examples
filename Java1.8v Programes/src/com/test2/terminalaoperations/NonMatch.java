package com.test2.terminalaoperations;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NonMatch {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("john");
        stringList.add("tom");

        Stream<String> stream = stringList.stream();
        boolean noneMatch = stream.noneMatch(i->i.contains("srinu"));
        System.out.println("noneMatch = " + noneMatch);
    }
}