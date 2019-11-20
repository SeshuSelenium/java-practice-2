package All_practice;

public class Loops {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i<=4 || i>=7) {
			System.out.println("in if condition: " + i);
			}else {
				System.out.println(i);
			}
		}
		
		System.out.println("\n @ WHILE LOOP @\n");
		int x=0;
		while(x<10) {
			x++;
			System.out.println(x);
		}
		
		
		System.out.println(" \n @ SWITCH CASE @ \n");
		int y= 25;
		switch(y) {
		case 25:
			System.out.println("1/4");
			break;
		case 50:
			System.out.println("1/2");
			break;
		case 75:
			System.out.println("1\3");
		case 100:
			System.out.println("1");
			
		
		}
		
		
		System.out.println(" \n @ DO WHILE @\n");
		int z=0;
		do {
			System.out.println(z);
			z++;
		}while(z<10);
	}

}
