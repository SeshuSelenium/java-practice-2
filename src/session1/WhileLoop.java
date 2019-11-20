package session1;

public class WhileLoop {

	public static void main(String[] args) {
		int y=10;
		int x = 10;
		
		System.out.println("\nwhile loop print x, y numbers:\n");
		// while loop 
		while (x>=0 && y>=0) {
			x--; // incremental operator
			y--;
			System.out.println("number x is: "+x+" number y is :" +y );
			
			//System.out.println(y);

		}
		System.out.println("\n do while loop \n");
		// do while loop syntax 
		int z=10;
		do {
			System.out.println("number :" +z);
			
			z--;
			
		}while(z>0);
		System.out.println("\n even numbers: \n");
		int a=0;
		while(a<=10) {
			a++;
			if(a%2==0) {
				System.out.println( "even number : " +a);
			}
		}
		System.out.println("\nodd numbers : \n");
		// if printing odd number with using while loop
		// while loop using for looping 
		int b=0;
		while (b<10) {
			b++;
			if (b%2==1) {
				System.out.println("odd number : "+ b);
			}
			
		}
		
	
		
	}

}
