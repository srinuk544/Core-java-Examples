import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int marks=sc.nextInt();
		
		if(marks>=90) {
			System.out.println("a grade");
		}else if (marks>=80 ) {
			System.out.println("B grade");
			
		}else if(marks>=70) {
			System.out.println(" c grade");
			
		}else if(marks >=60) {
			System.out.println("D grade");
			
		}else {
			System.out.println(" Bellow 60 is Fail");
		}
	}

}
