
public class ReverseStringExample {
	public static void main(String[] args) {
		String s = "Srinu";
		char ch;
		String ss = " ";
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			ss = ch + ss;
		}
		System.out.println("resverse a String :" + ss);
	}

}
