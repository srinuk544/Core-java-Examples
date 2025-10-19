
public class VariousMethodsPrintExaceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());

		}

	}

}
