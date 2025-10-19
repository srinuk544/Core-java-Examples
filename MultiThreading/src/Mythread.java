import java.util.Iterator;

public class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Is a child thread");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread m = new Mythread();
		m.start();
	//	m.run();
		try {
			m.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Is a main thread ");

		}
	}

}
