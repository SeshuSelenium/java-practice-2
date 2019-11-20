package assignments;

public class EvenNumbers_OddNumbers {

	public static void main(String[] args) {
		System.out.println("\n odd numbers: \n");
		// using for loop print odd numbers 0 to 10
		// for loop only for looping purpose
		for (int i = 0; i <= 10; i++) {
			// using if for condition
			if (i % 2 == 1) {
				System.out.println("odd numbers: " + i);
			}
		}
		System.out.println("\n even numbers:\n");
		// using for loop print even numbers 0 to 10
		// for loop only for looping purpose
		for (int i = 0; i <= 10; i++) {
			// using if for condition
			if (i % 2 == 0) {
				System.out.println("even numbres: " + i);
			}
		}

		// print numbers 0 to 10 but i want to hide number at place fill empty
		// use for loop
		for (int i = 0; i <= 10; i++) {
			// use if condition because hide number 5 number
			if (i == 5) {
				System.out.println("");   // if i satisfied with i==5 it will print empty space

			} else {
				System.out.println(i);   // if not satisfied with i==5 it will print numbers 
			}

		}

	}

}
