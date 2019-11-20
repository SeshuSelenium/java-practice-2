package day6;

public class If_stastment {

	public static void main(String[] args) {
		// syntax of if statement
		/*
		 * if (condition/ statement) { body of if }
		 */

		// if else statement
		// if it is only print boolean value
		boolean b = true; // if boolean value is true it print IF statement
		if (b) {
			System.out.println("hello"); // if boolean value is true to print it
		} else {
			System.out.println("hai"); // boolean value is false else statement printed
		}

		System.out.println("_______________\n");
		// if ....else if
		int x = 20;
		int y = 10;
		if (x == y) {
			System.out.println("hello"); // if condition will satisfied its printed if statement
		} else if (y == x) {
			System.out.println("hi"); // else if condition will satisfied its printed else if statement
		} else {
			System.out.println("hey"); // when both statements are not satisfied that time will printed else statement
		}

		System.out.println("\n_____________________\n");

		// nested if
		// nested if it have how many conditions wants to satisfy then it will print
		// nested if bod  y
		int telugu = 40, hindi = 10;
		if (telugu >= 35) {
			if (hindi >= 21) {
				System.out.println("pass");
			}
		}
		System.out.println("\n if ...else if ....else \n");
		// if ....else if ...else
		int a = 10, d = 20, c = 30;
		if (a > d && a > c) {   // both want to true then it will execute if statement
			System.out.println(a + " : is biggest value");
		} else if (d > a && d > c) {  // is both want to true it will execute if...else statement
			System.out.println(d + " : is biggest value");
		} else {  // if above all are not satisfy then it will execute else statement
			System.out.println(c + " : is biggest value");
		}
		imul(); // m
		dmul();
		fmul();
		
	}
	
	public static void imul() {
		System.out.println(25*50);
	}
	public static void fmul() {
		float f = 30.5555f;
		float fl = 25.336654f;
		System.out.println(f * fl);
	}

	public static void dmul() {
		double d = 50.13456789;
		double da = 75.789456123;
		System.out.println(d * da);
	}

}
