
public class Bus implements Vechile {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("bus started ");
	}

	public static void main(String[] args) {
		Bus b = new Bus();
		b.start();
		Vechile v=Vechile::clean;
		
	}
	

}
