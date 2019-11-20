package interfacing;

public abstract class  Wipro implements Banking  {

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("tranfer: wipro  ");
	}

	@Override
	//public void doposit() {
		// TODO Auto-generated method stub
		
	//}

	
	public void balancecheck() {
		// TODO Auto-generated method stub
		System.out.println("mini statement : wipro");
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		System.out.println(" mini statement: wipro");
	}

}
