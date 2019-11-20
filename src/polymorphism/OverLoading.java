package polymorphism;

public class OverLoading {
	public void m1(int a,int b) {
		int c;
		System.out.println("\n m1 method with 2 perameters \n");
		System.out.println(c=a+b);
		System.out.println(c=a*b);
		System.out.println(c=a/b);     
		System.out.println(c=b-a);
		
	}
	public void m1(int a, int b, int c) {
		int d;
		System.out.println("\n m1 method with 3 perameters \n");
		System.out.println(d=a+b+c);
		System.out.println(d=a+b-c);
		System.out.println(d=a*b-c);
		System.out.println(d=a/b+c);
	}
	public static void main(String[] args) {
		OverLoading loading = new OverLoading();
		loading.m1(10, 20);
		loading.m1(20, 25, 50);
	}

}
