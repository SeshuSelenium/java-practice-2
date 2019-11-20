package All_practice;

public class Main {
	int var;
	static int str = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1 = new Main();
		m1.var = 9;
		System.out.println("m1:  " + m1.var);

		Main m2 = new Main();
		m2.var = 20;
		System.out.println("m2:  " + m2.var);

		m1.str = m1.str + 100;
		System.out.println("m1:  " + m1.str);
		System.out.println("m2:  " + m2.str);
	}

}
