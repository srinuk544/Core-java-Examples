
public class ReversStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Srinu";
		String ss = s.concat("katta");
		System.out.println(ss);

		char[] ch = ss.toCharArray();
		String dup = "";
		for (int i = ss.length() - 1; i >= 0; i--) {
			dup = dup + ch[i];

		
		}
		System.out.println(dup);
	}

}
