package com.FunctionalIntraface;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		 String []s= {"srinu","vasu","battu","katta"};
		 Predicate<String> pp=name -> name.startsWith("s") ;
		 for (String string : s) {
		// System.out.println(string);
			
			if(pp.test(string)) {
				System.out.println(string);
				
			}
		}
		 
	}

}
