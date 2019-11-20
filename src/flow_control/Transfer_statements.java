package flow_control;

public class Transfer_statements {

	public static void main(String[] args) {
		// break and continue
		// we can use the break statement in the following places such as
		// 1.with in the switch
		// 2. loops
		// 3.label

		// 1. switch
		int x = 5; // variable
		switch (x) {
		case 0: // test case
			System.out.println(0);
		case 1:
			System.out.println(1);
			break; // break statement to stop the fall throw
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default: // if no case will satisfied then execute default
			System.out.println("def");
		}
		// inside loop: break loop execution based on same condition

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		// inside the label black: to break black execution based on same condition
		int y = 10;

		for (int i = 10; i > 0; i--) {
			for (int j = 10; j > 0; j--) {
				if (i < j)
					System.out.print(" * ");
				
			}
			System.out.println("");
			
		}

		for (int i = 1; i < 10; i++) {
			//System.out.print(" "+i+" ");
			for (int j = 1; j < 10; j++) {
				if (i < j)
					break;
					System.out.print(" "+j+" ");
				
			}
			System.out.println("");
			
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <10; j++) {
				if(j<i) {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}

		for (int i = 0; i < 10; i++) {
			//System.out.print(i);
			for (int j = 0; j < 10; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	
		for (int i = 0; i < 10; i++) {
			//System.out.print(i);
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.print(" * ");
				}
			}
		
		System.out.println("");
		}
	}
}
