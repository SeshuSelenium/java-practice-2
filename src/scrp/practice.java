package scrp;

import java.util.ArrayList;
import java.util.LinkedList;

public class practice {
	public static void main(String[] args) {
		
		ArrayList apple = new ArrayList();
		apple.add("killo");
		apple.add(100);
		apple.add("frute");
		System.out.println(apple);
		System.out.println("wight :" + apple.get(0));
		System.out.println("Apple price: "+apple.get(1));
		System.out.println("type : "+ apple.get(2));
		
		for (int i = 0; i < apple.size(); i++) {
			System.out.println(apple.get(i));
		}
		ArrayList<String> orange = new ArrayList<String>();
		orange.add("siri");
		orange.add("jyo");
		orange.add("jyothi");
		for (int i = 0; i < orange.size(); i++) {
			System.out.println(orange.get(i));
		}
		
		LinkedList<Integer> mango = new LinkedList<Integer>();
//		mango.add("seshu");
//		mango.add("siri");
//		mango.add("jyo");
		mango.add(121);
		mango.add(122);
		mango.add(123);
		mango.add(124);
		
		for (int i = 0; i < mango.size(); i++) {
			System.out.println(mango.get(i));
			
		}
		
		
		
		
		
		
	}
}
