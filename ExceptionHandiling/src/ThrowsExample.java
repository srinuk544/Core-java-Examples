
public class ThrowsExample {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("helo exception");
			
			
		}
	}
}
