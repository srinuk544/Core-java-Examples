package com.Predicate;

import java.util.function.Predicate;

public class PredicateExample2 {
	
	public static void main(String[] args) {
		 String[] s= {"srinu","katta","rajampalli","darsi","prakasam"};
		 
		 
		 Predicate<String> p=name -> name.startsWith("d");
		 for (String name : s) {
			 
			 if(p.test(name)) {
				 System.out.println(name);
				 
			 }
			
		}
		 
		
		 
		 
		 
	}

}
