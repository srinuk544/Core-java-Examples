import java.util.Scanner;

public class CountDigitsExample {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("inpit");
		 
		 int input=sc.nextInt();
		 int count=0;
		 while (input>0) {
			 input=input/10;
			 count++;
			 
			
		}
		 System.out.println(count);
	}

}
