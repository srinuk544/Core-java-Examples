import java.util.Scanner;

public class EvenorOddEample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numberr");
		int input= sc.nextInt();
		if (input % 2 == 0) {
			System.out.println("even numbersss");

		} else {
			System.out.println("oddd numbers");
		}
	}

}
