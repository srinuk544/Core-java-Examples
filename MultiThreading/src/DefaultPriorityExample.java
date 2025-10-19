
public class DefaultPriorityExample extends Thread {
	public void run() {
		System.out.println("hii run method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultPriorityExample d = new DefaultPriorityExample();
		d.start();
		System.out.println(d.currentThread().getPriority());
		d.setPriority(10);
		System.out.println("helo main method");

	}

}
