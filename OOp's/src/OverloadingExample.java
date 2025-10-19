
public class OverloadingExample {
	public void m1() {
		System.out.println("no arg method");
	}

	public void m1(int i) {
		System.out.println("int method ");

	}

	public void m1(float f) {
		System.out.println("float argment");

	}

	public static void main(String[] args) {
		OverloadingExample o = new OverloadingExample();
		o.m1();
		o.m1(10);
		o.m1(10.5f);
		o.m1(15);

	}

}
