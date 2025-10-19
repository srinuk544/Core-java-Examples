
public class ConstructorExampl {
	String name;
	int roll;
	String address;

	public ConstructorExampl(String name, int roll, String address) {
		this.address = address;
		this.name = name;
		this.roll = roll;

	}

	public void show() {
		System.out.println("name of the student" + name + "---" + "Roll number of the student" + roll + "-----"
				+ "Address of the student" + address);
	}

	public static void main(String[] args) {
		ConstructorExampl cc = new ConstructorExampl("Srinu", 10, "Rajampalli");
		cc.show();
		ConstructorExampl cc1 = new ConstructorExampl("hari", 20, "kondepi");
		cc1.show();
		ConstructorExampl cc2 = new ConstructorExampl("battu", 30, "chimakurthiy");
		cc2.show();
		ConstructorExampl cc3 = new ConstructorExampl("venu", 40, "rudravaram");
		cc3.show();

	}
}
