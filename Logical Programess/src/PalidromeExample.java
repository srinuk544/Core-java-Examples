
public class PalidromeExample {
	public static void main(String[] args) {
		String s = "mom";
		boolean check = checkpalidrom(s);
		if (check) {
			System.out.println("is it palidrom");

		} else {
			System.out.println("is not a palidromm");
		}
	}

	private static boolean checkpalidrom(String s) {
		StringBuffer sb=new StringBuffer(s).reverse();
		
		return false;
		
		
		//String output = s.replaceAll("\\ss+", "").toLowerCase();
		//return output.equals(new StringBuffer(output).reverse().toString());

	}
}
