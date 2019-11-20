package day9;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Api2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(11, "hello");
		ht.put(22, "hey");
		ht.put(33, "hai");
		System.out.println(ht.get(22));
		System.out.println(ht.size());
		System.out.println(ht);
		
		Collection<String> st =   ht.values();
		System.out.println(st  );
		Set<Integer> keys = ht.keySet();
		
		for (Integer integer : keys) {
			System.out.println(integer);
		}
		

		
		
}

}
