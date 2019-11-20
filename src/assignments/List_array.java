package assignments;

import java.util.ArrayList;

public class List_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("\n ArrayList<Character> \n");
		ArrayList<Character> c = new ArrayList<Character>();
		c.add('s');
		c.add('e');
		c.add('s');
		c.add('h');
		c.add('u');
		
		
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
		
		
	}

}
