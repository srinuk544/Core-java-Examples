package com.StringClass;

public class Stringcl {
	public static void main(String[] args) {
		String s = "srinu";
		System.out.println(s.concat("katta"));

		String ss = new String("srinu");
		String sss = new String("srinu");
		System.out.println(ss.equals(sss));
		System.out.println(ss == sss);

		char ch[] = { 'a', 'b', 'y', 'o' };
		String sf = new String(ch);
		System.out.println(sf);

		byte[] b = { 96,97,98,99,100, 101, 120 };
		String sb = new String(b);
		System.out.println(sb);
	}

}
