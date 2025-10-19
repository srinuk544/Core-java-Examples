
public class StackOverFlowException {
	public static void main(String[] args) {
		m1();
		
	}

	public static void m1() {
		// TODO Auto-generated method stub
		m2();
		
	}

	public  static void m2() {
		// TODO Auto-generated method stub
		m1();
	}

}
