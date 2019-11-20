package interfacing;


public class Banking_class implements Banking {

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("\ntransfer method @");
		System.out.println(x);
		System.out.println(z);
		
	}

	@Override
	public void doposit() {
		// TODO Auto-generated method stub
		System.out.println("\n diposit method @");
		System.out.println(y);
		
	}

	@Override
	public void balancecheck() {
		// TODO Auto-generated method stub
		System.out.println(" \n balance check method @");
		System.out.println(st);
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		System.out.println("\n mnistatement method @");
		System.out.println("hello");
		
	}
	public void credit() {
		System.out.println("\n credited @");
	}
	

}
