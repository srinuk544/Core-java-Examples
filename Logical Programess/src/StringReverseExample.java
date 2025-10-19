
public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hyderabd ";
		String ss = "";

		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			//ss = ss + ch[i];

			if ('H' == ch[i]) {
				ss = ss + "10";
			} else {
				ss = ss + ch[i];
			}

		}
		System.out.println(ss);
		
	}

}
