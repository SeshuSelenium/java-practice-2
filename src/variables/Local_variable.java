package variables;

public class Local_variable {

	public static void main(String[] args) {
		// the local variable declared inside the method / inside the black / inside the constructor such type of variable are called local variable / stack variable / temporvary variable / automatic variable
		// local variable stored in stack memory
		int i =3;
		for (int j = 0; j <3; j++) {
			i=i+j;
			System.out.println(i+" __ "+j);
		}
		
	}

}
