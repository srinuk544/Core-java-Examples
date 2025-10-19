import java.util.InputMismatchException;
import java.util.Scanner;

//import com.TypesOfExceptions.nullpointerException;

public class TryAndCatchExample {
	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("intput "); int input
		 * = sc.nextInt(); int[] i = new int[5]; for (int j = 0; j < i.length; j++) {
		 * System.out.println("enter the element"); try { //i[j] = sc.nextInt();
		 * System.out.println(i[10]); } catch (ArrayIndexOutOfBoundsException e) { //
		 * TODO: handle exception System.out.println("max size 3"); } catch
		 * (InputMismatchException e) { // TODO: handle exception
		 * System.out.println("pls enter proper integer value"); } }
		 */
		
		
		int[] i=new int[5];
		System.out.println(i[10]);
		
		
	}
}
