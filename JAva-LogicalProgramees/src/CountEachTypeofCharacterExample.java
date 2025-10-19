
public class CountEachTypeofCharacterExample {
	public static void main(String[] args) {
		String input = "java is a programming lang 125";

		System.out.println("normal length:" + input.length());

		int latters = 0;
		int digit = 0;
		int spaces = 0;
		int others = 0;

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				latters++;
			} else if (Character.isDigit(ch)) {
				digit++;

			} else if (Character.isSpace(ch)) {
				spaces++;

			} else {
				others++;
			}

		}
		
		System.out.println("latters count:"+latters);
		System.out.println("digits count:"+digit);
		System.out.println("spaces count:"+spaces);
		System.out.println("others count:"+others);
	}

}
