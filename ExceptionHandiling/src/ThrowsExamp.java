
public class ThrowsExamp extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("is a run method");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		ThrowsExamp t = new ThrowsExamp();
		t.run();

		for (int i = 6; i > 4; i--) {
			System.out.println("is a main method");

			Thread.sleep(1500);
		}

	}

}
