package interfacing;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking_class bc = new Banking_class();
		bc.balancecheck();
		bc.doposit();
		bc.ministatement();
		bc.transfer();
		bc.credit();
		Transferclass tfs = new Transferclass();
		tfs.balancecheck();
		tfs.doposit();
		tfs.ministatement();
		tfs.transfer();
		
	}

}
