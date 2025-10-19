package SaticControlFlowExample;

public class Child extends parent {
	static int c = 30;
	static {
		m2();
		System.out.println("child 1st static block");
	}

	public static void main(String[] args) {
		m2();
		System.out.println("child main method");
	}

	public static void m2() {
		// TODO Auto-generated method stub
		System.out.println(k);

	}

	static {
		System.out.println("child 2nd static block");
	}

	static int k = 50;

}
