package variables;

public class Instance_variable {
	//instance variables
	String name;
	int idNumber;
	int age;
	String college;
	public static void main(String[] args) {
		// instance variable are related to object reference variable is called instance variable
		// instance need a object without object its can not use
		Instance_variable iv= new Instance_variable();
		iv.name="seshu";
		iv.idNumber=100;
		iv.age=25;
		iv.college="mind q";
		System.out.println("NAME: "+iv.name);
		System.out.println("ID: "+iv.idNumber);
		System.out.println("AGE: "+iv.age);
		System.out.println("COLLEGE: "+iv.college+"\n");
		
		iv.name="priya";
		iv.idNumber=101;
		iv.age=21;
		iv.college="sv degree";
		System.out.println("NAME: "+iv.name);
		System.out.println("ID: "+iv.idNumber);
		System.out.println("AGE: "+iv.age);
		System.out.println("COLLEGE: "+iv.college+"\n");
		
	}

}
