package inheritace;

import access_modifiers.Access;

public class Child2 extends Child1 {
	public  void div() {
		int a=50, b=10;
		int c= a / b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.mul();
		c.sum();
		c.div();
	}
	
	
}
