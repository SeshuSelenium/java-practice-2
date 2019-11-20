package day8;

public class Methods_in_java {
	
	public static void mul() {// method declaration
		System.out.println(25*20);
		System.out.println(Math.multiplyExact(10, 10));
		System.out.println(Math.floorDiv(50, 5));
		System.out.println(Math.multiplyExact(25, 30));
	}
	
	public  int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	public String nam(String s, String r) {
		System.out.println(s + r);
		return s + r;
	}
	
	public double deci(double d, double e) {
		double f=d*e;
		System.out.println(f);
		return f;
	}
	public static void main(String[] args) { // access modifiers
		mul();// method call
		System.out.println(Math.addExact(100, 200));
		
	}
	
}
