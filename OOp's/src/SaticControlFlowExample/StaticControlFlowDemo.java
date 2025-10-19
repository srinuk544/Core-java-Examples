package SaticControlFlowExample;

public class StaticControlFlowDemo {
	static int i = 10;
	static {
		M1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		M1();
		System.out.println("main method");
	}

	public static void M1() {
		// TODO Auto-generated method stub
		System.out.println(j);

	}

	static {
		System.out.println("second block");
	}
	static int j = 20;

}