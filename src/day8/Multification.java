package day8;

public class Multification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println(Math.multiplyExact(10, 10));
		 * System.out.println(Math.floorDiv(50, 5));
		 * System.out.println(Math.multiplyExact(25, 30));
		 */
		
		
		// using for loop print odd numbers 0 to 10
		System.out.println(" \n odd numbers:______________");
		for (int i = 0; i <=50; i++) {
			if (i%2==1) {
				System.out.println("odd numbers is: "+ i);
			}
		}
		
	// using for loop print even numbers 0 to 10
	System.out.println("\n even numbers:_________");
	for (int i = 0; i <= 50; i++) {
		if (i%2==0) {
			System.out.println("even numbers is: "+ i);
		}
	}
	
//
//	public static void fmul() {
//		float f = 30.5555f;
//		float fl = 25.336654f;
//		System.out.println(f * fl);
//	}
//
//	public static void dmul() {
//		double d = 50.13456789;
//		double da = 75.789456123;
//		System.out.println(d * da);
//	}

	}
}