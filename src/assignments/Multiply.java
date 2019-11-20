package assignments;

public class Multiply {

	public static void main(String[] args) {
		
		mul();
		mult(25.2456879458, 22.7418529632584);
		multi(10.123456f, 20.789456f);
		// multiply with non-returnable methods
	}
	public static void mul() {
		int a=10, b=20;
		int c=a*b;
		System.out.println(c);
	}
	// multiply with returnable  double data type
	public static double mult(double d, double e) {
		System.out.println(d*e);  
		return d;  // must return something
	}
	// multiply with returnable float data type
	public static float multi(float f, float g) {
		System.out.println(f*g);
		return f;
	}

}
