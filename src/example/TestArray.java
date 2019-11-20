package example;

import java.util.ArrayList;

public class TestArray {

	public static void main(String[] args) {

		String[] s = new String[4];
		s[0] = "seshu";
		s[1] = "arun";
		s[2] = "hari";
		s[3] = "manoj";

		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);

		int[] hari = new int[5];
		hari[0] = 10;
		hari[1] = 20;
		hari[2] = 30;
		hari[3] = 40;
		hari[4] = 50;
		for (int i = 0; i < hari.length; i++) {
			System.out.println(hari[i]);
		}

		String[] str = { "hari", "arun", "majoj", "anil", "sudha", "abhi" };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("*****************arryList*****************");
		ArrayList<String> bala = new ArrayList<String>();

		bala.add("hari");
		bala.add("arun");
		bala.add("seshu");
		bala.add("reddy");
		for (int i = 0; i < bala.size(); i++) {
			System.out.println(bala.get(i));

		}

	}

}
