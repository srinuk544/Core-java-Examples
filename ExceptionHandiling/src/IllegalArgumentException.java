
public class IllegalArgumentException {
	public static void main(String[] args) {
		Thread t=new Thread();
		t.setPriority(10);
		t.setPriority(100);
	}

}
