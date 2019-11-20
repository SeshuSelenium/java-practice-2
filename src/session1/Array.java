package session1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a = new String[5][2];
		
		System.out.println("lenth of array : " +a.length);
		a[0][0]="apple";
		a[0][1]="red";
		a[1][0]="orenge";
		a[1][1]="yellow";
		a[2][0]="mango";
		a[2][1]="yellow";
		a[3][0]="grepes";
		a[3][1]="black";
		a[4][0]="banana";
		a[4][1]="yellow";
		
		/*
		 * System.out.println(a[2]); System.out.println(a[1]); System.out.println(a[0]);
		 */
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println("fruts names : " +a[i][j]);
			}
			
			
		}
	}

}
