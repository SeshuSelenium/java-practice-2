package assignments;

public class Rivers_integer_array {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 }; // single dimension array
		System.out.println(a.length); // print array length
		for (int i = a.length - 1; i >= 0; i--) { // looping
			System.out.println(a[i]); // print rivers order
			//  
			for (int j : a) {
				System.out.println(j);
			}
		}

	}
}
