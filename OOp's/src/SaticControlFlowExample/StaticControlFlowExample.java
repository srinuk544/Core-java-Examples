package SaticControlFlowExample;

public class StaticControlFlowExample {
	static int i = 10;
	static {
		m1();
		System.out.println("1st static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}

	public static void m1() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	static {
		System.out.println("2nd static block");
	}
	static int j = 30;

}
