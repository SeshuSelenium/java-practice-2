package day9;

import java.util.ArrayList;

public class Api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n ArrayList<String>\n");
		ArrayList<String> a = new ArrayList<String>();
		a.add("hello");
		a.add("hai");
		a.add("hey");
		a.add("oye");
		a.add("okay");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("\n ArrayList<Integer>\n");

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);

		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));

		} 
		
		System.out.println("\n ArrayList<charactor>\n");

		ArrayList<Character> c= new ArrayList<Character>();
		c.add('s');
		c.add('e');
		c.add('s');
		c.add('h');
		c.add('u');
		
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i));
		}
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(1);
		o.add('a');
		o.add(2.50);
		o.add("seshu");
		 
	}

}
