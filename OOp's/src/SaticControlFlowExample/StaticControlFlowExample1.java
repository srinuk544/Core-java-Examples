package SaticControlFlowExample;

public class StaticControlFlowExample1 {

	static int i = 10;
	static {
		m1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");

	}

	private static void m1() {
		// TODO Auto-generated method stub

		System.out.println(j);

	}

	static {
		System.out.println("second static block");
	}
	static int j = 20;
}
