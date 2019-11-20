package exception_handling;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div();
	}

	public static void div() {
		try {
			int x = 1;
			int y = 0;
			int z=x/y;
System.out.println(z);
		} catch (Exception e) {
			System.out.println("there is an exception");
			e.printStackTrace();
		}

	}

}
