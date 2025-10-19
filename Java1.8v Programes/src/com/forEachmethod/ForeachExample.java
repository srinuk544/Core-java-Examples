package com.forEachmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class ForeachExample {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		 al.add("srinu");
		 al.add("vasu");
		 al.add("katta");
		 
		 System.out.println(al);
		 System.out.println("normal by using iterator");
		 Iterator itr=al.iterator();
		 while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		 
		 
		 
		 
		 System.out.println("by using foreach");
		 al.forEach(i->System.out.println(i));
		 System.out.println("------------");
		 for (String string : al) {
			System.out.println(string);
		}
		 
	}

}
