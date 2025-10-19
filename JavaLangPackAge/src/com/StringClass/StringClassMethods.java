package com.StringClass;

import org.xml.sax.helpers.AttributeListImpl;

public class StringClassMethods {
	public static void main(String[] args) {
		String s = "java is very high end technology";

		System.out.println(s.charAt(10));
		// System.out.println(s.charAt(35)); ---> we can specified specific index of
		// string
		System.out.println("-----------------");
		String ss = new String("srinu");
		String sv = ss.concat("yadav");
		System.out.println(sv);
		// System.out.println(ss); -----> we can add new object to intital object
		System.out.println("-----------------");
		String st = new String("srinu");
		String str = new String("srinu"); // -------->is .equals method for content comparession
		System.out.println(st.equals(str));

		System.out.println("-----------------");

		String f = "srinu";
		System.out.println(f.equals("SRINU")); // ----->in this case content is not importent
		System.out.println(f.equalsIgnoreCase("SRINU"));
		
		System.out.println("-----------------");
		
		String k=new String("srinivas yadav");
		String o=k.substring(8);
		System.out.println("Sub Stringg:"+o);  // begining index to end index
		
		System.out.println("-----------------");
		
		String p=new String("java is a not pure object orinented lang");
		System.out.println(p);
		
		System.out.println(p.toUpperCase());
		System.out.println("-----------");
		String l="srinu yadav";
		System.out.println(l.trim());
		
		System.out.println(p.substring(10, 19));
		System.out.println(p.length());
		System.out.println(p.length()-1);
		/*
		 * for(int i=p.length()-1;i>=0;i--) { System.out.println(i);
		 * 
		 * }
		 */
		

	}

}
