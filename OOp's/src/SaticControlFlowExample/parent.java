package SaticControlFlowExample;

public class parent {
	static int i = 10;
	static {
		m1();
		System.out.println("parent static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println(" parent main method ");
	}

	public static void m1() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	static int j = 20;

}
