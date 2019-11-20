package inheritace;

public class Override1 extends Override_methods {

	
		// TODO Auto-generated method stub
		public void sum() {
			int apple=25, orange=50;
			int total = apple+orange;
			String summery="sum method in override: ";
			System.out.println(summery+total);
		}
		public void mul() {
			int greaps= 12, mango= 5;
			int total = greaps + mango;
			String dec ="mul method in override: ";
			System.out.println(dec+total);
		

	}
		public static void main(String[] args) {
			Override1 over = new Override1();
			
		}

}
