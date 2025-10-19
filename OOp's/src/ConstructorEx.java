
public class ConstructorEx {
	String name;
	int age;

	public ConstructorEx(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void show() {
		System.out.println(name + "--------------" + age);
	}

	public static void main(String[] args) {
		ConstructorEx con = new ConstructorEx("srinu", 12);
		ConstructorEx co = new ConstructorEx("vasu", 2);
		con.show();
		co.show();

		System.out.println(co.name + "---" + co.age);
		System.out.println(con.name + "---------" + con.age);

	}

}
