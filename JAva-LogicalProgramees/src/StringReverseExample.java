import java.util.Scanner;

public class StringReverseExample {
	public static void main(String[] args) {
		  Scanner sc=new Scanner( System.in);
		  System.out.println("enter the string");
		  
		  String input=sc.nextLine();

		  String rev=" ";
		  for(int i=input.length()-1;i>=0;i--) {
			rev +=input.charAt(i);
			
			  
		  }
		  
		  System.out.println(rev);
		
	}

}
