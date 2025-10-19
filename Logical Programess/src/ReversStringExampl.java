import java.util.Iterator;

public class ReversStringExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hyd is very famous";
		char ch[] = s.toCharArray();
		String ss = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			ss = ss + ch[i];

		}
		System.out.println(ss);

	}

}
