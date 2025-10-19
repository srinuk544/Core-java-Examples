
public class Parent {
	static int i = 10;
	static {
		methodone();
		System.out.println("parent class static block");
	}

	public static void main(String[] args) {
		methodone();
		System.out.println("parent main method");
	}

	public static void methodone() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	static int j = 20;
}
