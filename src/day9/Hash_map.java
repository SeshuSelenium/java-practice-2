package day9;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in hash table it have key, value 
		hashmap();
		System.out.println("\nhashmap in String and Object\n");
		HashMap<Integer, Object> hm = new HashMap<Integer, Object>();
		hm.put(12, "hello");
		hm.put(222, "hey");
		hm.put(123, "how are you");
		hm.put(147, null);
		hm.put(null, null);
		System.out.println(hm.get(12));
		System.out.println(hm.get(222));
		System.out.println(hm.get(147));
		System.out.println(hm.get(123));
		System.out.println(hm.get(null));
		
		System.out.println("\nhashmap in String and Object\n");
		hashmap(); 
		
		
	}

		public static void hashmap() {
			
		HashMap<String, Object> ht= new HashMap<String, Object>();
		ht.put("hi", "hello");
		ht.put("hii", "hey");
		ht.put("rey", "how are you");
		ht.put("oops", null);
		ht.put(null, null);
		System.out.println(ht.get("hi"));
		System.out.println(ht.get("hii"));
		System.out.println(ht.get("rey"));
		System.out.println(ht.get("oops"));
		
		
	}

}
