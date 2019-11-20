package variables;

public class Static_variable {
	// if static variables we should not need to to use object 
	// if we want to declare static variable. we should declare inside the class and out side of the method / black / cansructar
	// static variable values are stored in method area
	// we should want to access static variable. 
	// 1. we can access by using variable name and class name with variable name or object reference
	// if you declare static variable its store single value
	String name;
	int idNumber;
	int age;
	static String college="mind q";

	public static void main(String[] args) {
		Static_variable sv= new Static_variable();
		sv.name="seshu";
		sv.idNumber=100;
		sv.age=25;
		System.out.println("name: "+sv.name);
		System.out.println("ID: "+sv.idNumber);
		System.out.println("age: "+sv.age);
		System.out.println("college: "+college+"\n");
		
		
		sv.name="jyothi";
		sv.idNumber=101;
		sv.age=21;
		System.out.println("name: "+sv.name);
		System.out.println("ID: "+sv.idNumber);
		System.out.println("age: "+sv.age);
		System.out.println("college: "+college+"\n");
		
		
		sv.name="preethi";
		sv.idNumber=102;
		sv.age=19;
		
		System.out.println("name: "+sv.name);
		System.out.println("ID: "+sv.idNumber);
		System.out.println("age: "+sv.age);
		System.out.println("college: "+college+"\n");
		
		
	}

}
