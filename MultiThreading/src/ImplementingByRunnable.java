
public class ImplementingByRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("is a in build run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingByRunnable i = new ImplementingByRunnable();
		Thread t = new Thread(i);
		t.start();
	}

}
