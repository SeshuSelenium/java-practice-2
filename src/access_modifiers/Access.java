package access_modifiers;

public class Access {
	protected void sume() {
		System.out.println(100+50);
		System.out.println("this is an add functioality \n");
	}
	public void multi() {
		System.out.println(25*25);
		System.out.println("multi public method \n");
		}
	private void divide() {
		int a=400, b=20;
		
		System.out.println(Math.floorDiv(42, 6));
		System.out.println("divide private method \n");
	}
	 void sub() {
		System.out.println(500-200);
		System.out.println("substraction method \n");
	}
	 public static void main(String[] args) {
		 Access access = new Access();
		 access.sume();
		 access.multi();
		 access.divide();
		 access.sub();
	 }
}
