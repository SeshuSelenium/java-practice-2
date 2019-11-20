package All_practice;

public class Class11 {
	int age;
	String name;

	Class11(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Class11 t1 = new Class11(20, "a");
		Class11 t2 = new Class11(23, "b");
		Class11 t3 = new Class11(25, "c");

		/*
		 * t3 = t1; t2 = t3; t1 = t3;
		 */
		System.out.println(t1.age);
		System.out.println(t2.age);
		System.out.println(t3.age);
	}

}
