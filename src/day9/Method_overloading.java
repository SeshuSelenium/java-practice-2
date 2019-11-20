package day9;

public class Method_overloading {

	static int x=20;
	int y=25;
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	Method_overloading m= new Method_overloading(); // object for a class
	// object call entire class code except local variables
	//m.x=60;
	//m.y;
	m.mul(12, 13, 3); //  calling non-static method mul throw the object refarace 
	m.mul(4, 2); 	// calling static method mul throw the object refarace
	System.out.println(x); 	// print global static variable 
	System.out.println(m.y*x); // print global non-static variable
	}
	public static int mul(int a, int b) { // return type static method
		int c=a*b;
		System.out.println(c);
		return b;
	}
	public  int mul(int a, int b, int d) {	// non-static return type method
		int c=a*b*d;
		System.out.println(c);
		return d;
	}
}
