package session1;

public class Object_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] o = new Object[3][2];
		
		o[0][0]=123;
		o[0][1]=456;
		o[1][0]='A';
		o[1][1]='B';
		o[2][0]="hello";
		o[2][1]="hai";
		
		for (int i = 0; i < o.length;i ++) {
			for (int j = 0; j < o[0].length; j++) {
				System.out.println(o[i][j]);
			}
		}
		/*
		 * System.out.println(o[0]); System.out.println(o[1]); System.out.println(o[2]);
		 */
	}

}
