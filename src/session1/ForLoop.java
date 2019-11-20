package session1;

public class ForLoop {

	public static void main(String[] args) {
		// for loop
		// it is useful for when we want same work  many time at time it for loop very useful
		for (int s = 0; s <4; s++)  // for loop condition
		{
			// for loop body "or" scope of for loop
		}
		
		//if you want to print 1 to 10 number do you use this code
		for (int a = 0; a <=10; a++) {  
			System.out.println(a);  // for loop statement will looping 10times	
			
		}
		
		// one dimensional array with for loop
		
		int[] x= {10, 20, 30, 40, 50,60};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		// for-each loop with single dimensional array
		System.out.println("\nfor_each loop \n");
		for(int x1 : x) {
			System.out.println(x1);
		}
		
	}

}
