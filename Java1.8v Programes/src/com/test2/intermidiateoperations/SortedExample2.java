package com.test2.intermidiateoperations;

import java.util.Arrays;import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample2 implements Comparable<SortedExample2> {

	String name;
    int age;

    SortedExample2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    
 	
	@Override
	public int compareTo(SortedExample2 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
    
    public static void main(String[] args) {
		
    	
    	SortedExample2 s1=new SortedExample2("srinu", 23);
    	SortedExample2 s2=new SortedExample2("hari",26);
    	SortedExample2 s3=new SortedExample2("venkat", 33);
    	SortedExample2 s4=new SortedExample2("vasu", 18);

    	
    	List<SortedExample2> ll=Arrays.asList(s1,s2,s3,s4);
    	
    	
    	Collections.sort(ll)
;
    	ll.forEach(i->System.out.println(i));
    	
    }
}
