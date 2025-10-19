
public class OverloadingARunmethod extends Thread {
	public void run() {
		System.out.println("is a normal run method");
	}

	public void run(int i) {
		System.out.println("is a int method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingARunmethod o = new OverloadingARunmethod();
		o.start();


	}

}
