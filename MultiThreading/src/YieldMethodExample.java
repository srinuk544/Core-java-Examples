
public class YieldMethodExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {

			Thread.yield();

			System.out.println("Welcome run method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldMethodExample y = new YieldMethodExample();
		Thread t = new Thread(y);
		t.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("hi main method");

		}

	}

}
