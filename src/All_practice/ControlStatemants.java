package All_practice;

public class ControlStatemants {

	public static void main(String[] args) {
		int seshu = 25;
		int jyo = 20;
		if(seshu != jyo) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("\n NESTED IF STATEMENT \n ");
		int telugu =35;
		int hindi = 20;
		int english = 40;
		if (telugu >=35) {
			if(hindi>=21) {
				if(english>= 35) {
					System.out.println("pass");
				}else {
					System.out.println("faile");
				}
			}
		}
		      

	}

}
