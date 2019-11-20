package assignments;

import flow_control.Transfer_statements;

public class String_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] { "Welcome ", " java", " String", };
		String[] nam = {"seshu", "reddy", "jyo"};
		
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		  Transfer_statements t = new Transfer_statements(); 
		  t.main(null);
		 String s="seshu jyo shanthi reddy";
		 String r="";
		 for (int i = str.length-1; i >=0 ; i--) {
			 		r=r+str[i];
			 		System.out.println(r);
			
			}
		 System.out.println(r);
	}
}
