
public class Child extends Parent {
	static int n = 1000;
	static {
		methodOne();
		System.out.println(" first child static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOne();
		System.out.println("child main method");
	}

	public static void methodOne() {
		// TODO Auto-generated method stub
		System.out.println(m);
	}

	static {
		System.out.println("second child static block");
	}
	static int m = 2000;

}
