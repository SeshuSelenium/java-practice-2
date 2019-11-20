package All_practice;

import java.util.Scanner;

public class Removevable {
int a=50 ;
static int b=60;
public void add() {
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removevable r= new Removevable();
		r.add();
		r.a=20; // if should create object for every instance variable
		b=6;  // if should not need object for static variable
		System.out.println(r.a);
		System.out.println(b);
		
		//public void non-static() {}; //CE : syntax error 
		
 
//		Scanner inp = new Scanner(System.in);
//		Scanner inp1 = new Scanner(System.in);
//		System.out.println("enter your name: ");
//		String name = inp.nextLine();
//		System.out.println("enter your age: ");
//		int age = inp1.nextInt();
//		System.out.println("enter your villege: ");
//		String villege = inp.nextLine();
//		System.out.println("enter your mandal: ");
//		String mandal = inp.nextLine();
//		System.out.println("enter your distric: ");
//		String distric = inp.nextLine();
//		System.out.println("enter stste: ");
//		String state = inp.nextLine();
//		System.out.println("@ login successful @");
//
//		String nam = "nagasesha";
//		String reverse = "";
//		for (int i = nam.length() - 1; i >= 0; i--) {
//			reverse = reverse + nam.charAt(i);
//			System.out.println(nam.charAt(i));
//		}
//		System.out.println(reverse);
//		String sam="seshu";
//		String chars="";
//		for (int i = 0; i <= sam.length()-1; i++) {
//			chars=chars+sam.charAt(i);
//			System.out.println(sam.charAt(i));
//		}
//		System.out.println(chars);
//		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if(j<i) {
//					System.out.print(j);
//				}
//				
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("\n max number of array\n");
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter number of array");
//		int n=in.nextInt();
//		int[] a= new int[n];
//		System.out.println("enter array elements");
//		for (int i = 0; i < n; i++) {
//			a[i]=in.nextInt();
//		}
//		
//		
//		int max=a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (max < a[i]) {
//				max = a[i];
//			}
//			
//		}
//		System.out.println("min value");
//		int min=a[0];
//		System.out.println(max);
//		
//		for (int i = 0; i < a.length; i++) {
//			if (min > a[i]) {
//				min = a[i];
//			}
//		}
//		System.out.println(min);
	}

}