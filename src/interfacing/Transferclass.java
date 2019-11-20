package interfacing;

public class Transferclass extends Wipro {

	@Override
	public  void doposit() {
		// TODO Auto-generated method stub
		System.out.println("transferclass");
	}
	public static void main(String[] args) {
		Transferclass trr = new Transferclass();
		trr.balancecheck();
		trr.ministatement();
		trr.transfer();
		trr.doposit();
		
	}
	
}
