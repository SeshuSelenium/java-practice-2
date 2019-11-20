package All_practice;

public class AtoZ {
	int i;  //Question 5
	static int j; //Question 5
	int a;       //Question 2 
	static int b; //Question 2
	int l=25;
	public void non() {
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public void nan() {    //Question 3
		System.out.println("pass");
	}
	
	public void non_static() {
		System.out.println("pass: 5");
	}
	public void non_static1() {
		System.out.println("pass1: 5");
	}
	public static void static2() {
		System.out.println("pass2: 5 static");
	}
	public static void main(String[] args) {
		AtoZ a= new AtoZ();
		a.non();
		a.nan();
		
		// question 1
		int i;
		//System.out.println(i);  // CE: local variable should be initialization
		i=10;
		System.out.println(i);
		
		int j=100;
		System.out.println(j);
		
		// question 5:-
		a.non_static();
		a.non_static1();
		static2();
		a.i=100;
		j=50;
		a.i=150;
		System.out.println(a.i);
		System.out.println(j);
		//a.l=200;
		int g=a.l;
		System.out.println(g);
	}
	

}
