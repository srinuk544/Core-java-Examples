package Com.cusers;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationDemo {
	public static void main(String[] args) {

		Stack<String> s = new Stack<>();
		s.push("srinu");
		s.push("katta");
		s.push("vasu");
		s.push("swapna");
		s.push("rekha");
		s.push("mani");
		System.out.println("before enumaration:" + s);

		Enumeration<String> e = s.elements();
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			/*
			 * if (string.startsWith("s")) { System.out.println("afetr enumarion:" +
			 * string);
			 * 
			 * }
			 */
			System.out.println("afetr enumarion:" +
					 string);
		}

	}

}
