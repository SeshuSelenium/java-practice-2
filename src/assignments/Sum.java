package assignments;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;	// variable
		int x = 100;	// variable
		for (int i = 0; i <= x; i++) { // loop statement
			sum = sum + i;	// counting sum numbers
			System.out.println(sum); // print sum values
		}
		System.out.println("The Sum Of " + x + " Numbers are:" + sum); // print sum total

		
	}

}
