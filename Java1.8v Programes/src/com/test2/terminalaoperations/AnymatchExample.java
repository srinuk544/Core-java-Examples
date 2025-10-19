package com.test2.terminalaoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.lambda.intraface;

public class AnymatchExample {
	
	public static void main(String[] args) {
		List< Integer> ll=Arrays.asList(1,2,3,4);
		
	boolean st =	ll.stream().filter(i->i%2==0).anyMatch(i->i==2);
	
	System.out.println(st);
	
	
	
	
	List<String> l=Arrays.asList("srinu","java","python","sql");
	
	boolean b=l.stream().anyMatch(i->i.startsWith("s"));
	System.out.println(b);
	}

}
