import java.util.Scanner;

public class PalidromeStringCheckingExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the String");
		String input=sc.nextLine();
		//String original=input;
		String rev=" ";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev+=input.charAt(i);
			
		}
		
		System.out.println(rev);
		if(input.equals(rev)) {
			System.out.println("is palidrom String");
			
		}else {
			System.out.println("not a  palidrome String");
		}
	}

}
