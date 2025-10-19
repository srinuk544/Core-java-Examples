
public class RunTimeStackMechanisum {
	public static void main(String[] args) {
		dostuff();
	}

	private static void dostuff() {
		// TODO Auto-generated method stub
		doMorestuff();

	}

	private static void doMorestuff() {
		// TODO Auto-generated method stub
		// System.out.println("Welcome to Exception handiling");

		System.out.println(10 / 0);

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {

			//e.printStackTrace();
			 System.out.println(e);
//e.getMessage();	  
			System.out.println(10 / 5);

		}

	}
}
