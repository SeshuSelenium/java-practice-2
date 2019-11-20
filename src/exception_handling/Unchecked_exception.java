package exception_handling;

public class Unchecked_exception {

	public static void main(String[] args) {
		// unchecked exception: an exception can not handled java its called unchecked exception
		try {
System.out.println(1/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
System.out.println("hello");
System.out.println("hi");
System.out.println(1+2);


	}

}
