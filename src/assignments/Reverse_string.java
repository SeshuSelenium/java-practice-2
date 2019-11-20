package assignments;
import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // Scanner reference
		System.out.println("enter any strig"); 	// user reference
		String nam = s.nextLine(); 	// Scanner user input
		String reverse = "";	// variable
		for (int i = nam.length()-1; i >=0 ; i--) { // looping
			reverse = reverse+nam.charAt(i);
		
		}
		System.out.println(reverse); 	// print reverse string
		
		System.out.println("\n String to charactor ");
		
		System.out.println("\n @ String to charector array elements @ \n ");
		char[] ca = nam.toCharArray(); // string to charArray object
		
		System.out.println(Arrays.toString(ca)); // printing String to elements
		
		
		
		
		
	}

	

}
