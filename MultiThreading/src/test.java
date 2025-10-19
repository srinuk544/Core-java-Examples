
public class test implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			Thread.yield();
			System.out.println("----run method ----");
		}

	}

	public static void main(String[] args) {
		test y = new test();
		Thread t = new Thread(y);
		t.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("-----main method-------");
		}
	}

}
