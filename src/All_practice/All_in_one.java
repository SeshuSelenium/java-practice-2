package All_practice;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Scanner;

public class All_in_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[2]; // one dimensional array int data type
		x[0] = 25; // array declaration
		x[1] = 45;
		System.out.println(x[0]); // print array value
		System.out.println(x[1]);
		int[][] y = new int[2][]; // two dimensional array int data type
		y[0] = new int[2];
		y[0][1] = 23;
		y[1] = new int[2];
		y[1][1] = 50;
		try { // try catch method
			System.out.println("____________________________");
			System.out.println(y[0][1]);
			System.out.println(y[1][1]);
		} catch (Exception e) {
			e.printStackTrace(); // printing array exception
			System.out.println("this is an exception");
		}

		// multi dimension array
		int[][][] z = new int[3][][];
		z[0] = new int[2][];
		z[0][0] = new int[2];

		z[0][0][0] = 100;
		z[0][0][1] = 200;
		// z[1][0][0]=300;
		// z[0][1][1]=400;

		System.out.println("Hashtable:____________");
		Hashtable<Integer, String> is = new Hashtable<Integer, String>(); // Hashtable object for reference name
		is.put(11, "seshu"); // Hashtable declaration
		is.put(22, "reddy");
		is.put(33, "jyo");
		is.put(44, "jyothi");
		is.put(55, "preethi");
		System.out.println(is.get(11)); // print Hashtable value throw Hashtable key
		System.out.println(is.size()); // print Hashtable size

		System.out.println(" HashMap:__________________");

		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(44, "hello");
		a.put(55, "hey");
		a.put(66, "oye");
		a.put(77, null);
		a.put(null, "value");
		System.out.println(a.size());
		System.out.println(a.get(null));
		System.out.println(a.get(77));
		System.out.println(a.get(55));

		System.out.println("ArrayList:_______________________");
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(12);
		b.add(13);
		b.add(14);
		b.add(15);
		b.add(16);
		System.out.println(b.size());
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
		for (Integer t : b) {
			System.out.println(t);
		}
		System.out.println("odd numbers:_____________");
		for (int j = 0; j < 100; j++) {
			if (j % 2 == 1) {
				System.out.println(j);
			}
		}
		System.out.println("Even numbers:_________________");
		for (int j = 0; j < 100; j++) {
			if (j % 2 == 0) {
				System.out.println(j);

			}

		}
		System.out.println("divicin:___________ ");
		for (int i = 0; i < 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		int n = 0;
		while (n <= 20) {
			n++;
			if (n % 5 == 0) {
				System.out.println(n);
			}

		}
		// reverse String
		// printing last element and first element
		System.out.println("reverse String:____________");
		String nam = "seshu"; // String variable
		String reverse = "";
		String lastElement = "";
		String firstElement = "";
		for (int i = nam.length() - 1; i >= 0; i--) {
			reverse = reverse + nam.charAt(i); // reverse String printing method
		}
		System.out.println(reverse); // reverse String print statement

		firstElement = firstElement + nam.charAt(0); // first element printing method
		lastElement = lastElement + nam.charAt(4); // last element printing method
		System.out.println(firstElement); // first element print statement
		System.out.println(lastElement); // last element print statement

		System.out.println("ArrayList:_________________");
		ArrayList<Object> al = new ArrayList<Object>();

		al.add("seshu");
		al.add('s');
		al.add(25);
		al.add(true);
		al.add(2.50);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("HashTable:_______________");
		try {
			Hashtable<Object, Object> hs = new Hashtable<Object, Object>();

			hs.put(1, "integer");
			hs.put("reddy", "jyothsna");
			hs.put('s', "character");
			hs.put(2.5, "float");
			hs.put(5.5, "double");
			// hs.put(null, "empty");
			// s.put("empty", null);
			System.out.println(hs.get(1));
			System.out.println(hs.get("reddy"));
			System.out.println(hs.get('s'));
			System.out.println(hs.get(2.5));
			System.out.println(hs.get(5.5));
//		System.out.println(hs.get(null));
//		System.out.println(hs.get("empty"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("this is an error" + e);
		}
		try {
			System.out.println("HashMap:__________");
			HashMap<Object, Object> hm = new HashMap<Object, Object>();
			hm.put(123, "Chiripi");
			hm.put(456, "Reddy");
			hm.put(987, "nagasubba reddy");
			hm.put(999, "Venkatalakshmi reddy");
			hm.put(null, "xxxxx");
			hm.put("empty", null);
			hm.put(null, null);
			System.out.println(hm.get(123));
			System.out.println(hm.get(456));
			System.out.println(hm.get(987));
			System.out.println(hm.get(999));
			System.out.println(hm.get(null));
			System.out.println(hm.get("empty"));
			System.out.println(hm.get(null));
			System.out.println(hm.get(147));
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("HahMap exception" + ex);
		} 

		System.out.println("File Create and FileReader:________________");
		try {
			File fl = new File("E:/scrap.txt");
			FileWriter fwr = new FileWriter(fl);
			BufferedWriter bwr = new BufferedWriter(fwr);
			bwr.write(" seshu tou are the best employee");
			bwr.newLine();
			bwr.write(" you can do work properly you should get a certificate ");
			bwr.newLine();
			bwr.flush();
			bwr.write(" congratulations you got best employee certificate");
			bwr.newLine();
			bwr.flush();
			bwr.write(" the certificate anounced by manager ");
			bwr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n FileReader:_______________________");
		try {
			File file = new File("E:/scrap.txt");
			FileReader freader = new FileReader(file);
			BufferedReader bread = new BufferedReader(freader);
			String read = "";
			read = bread.readLine();
			System.out.println(bread.readLine());
			System.out.println(bread.readLine());
			System.out.println(bread.readLine());

		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println("FileReader Exception" + ioe);
		}
		System.out.println("\nproperties handling:_______________________");
		try {
			System.out.println(System.getProperty("user.dir"));
			FileReader fread = new FileReader(System.getProperty("user.dir")+"\\scraps.properties");
			BufferedReader buff = new BufferedReader(fread);
			Properties prop = new Properties();
			prop.load(buff);
			System.out.println(prop.getProperty("impression"));
			System.out.println(prop.getProperty("suggestion"));
			System.out.println(prop.getProperty("got"));
			System.out.println(prop.getProperty("anounced"));
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		try {
			FileReader wfr = new FileReader("E:\\Testing\\weekdays\\hello.properties");
			BufferedReader rw = new BufferedReader(wfr);
			Properties pp = new Properties();
			pp.load(rw);
			System.out.println(pp.getProperty("friend"));
			System.out.println(pp.getProperty("love"));
			System.out.println(pp.getProperty("sister"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		try {
			File files = new File("E:\\reddy.txt");
			FileWriter filewriter = new FileWriter(files);
			BufferedWriter buf = new BufferedWriter(filewriter);
			buf.write("oye seshu reddy");
			buf.newLine();
			buf.write("hello jyothsna");
			buf.newLine();
			buf.write("hey wrong");
			buf.newLine();
			buf.write("in seshu");
			buf.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader filere = new FileReader("E:\\reddy.txt");
			BufferedReader bufr = new BufferedReader(filere);
			System.out.println(bufr.readLine());
			System.out.println(bufr.readLine());
			System.out.println(bufr.readLine());
			System.out.println(bufr.readLine());
			
//			String line;
//			while((line = bufr.readLine()) != null){
//			    //process the line
//			    System.out.println(line);
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.print("Name: ");
		String name=input.nextLine();
		System.out.print("ID number: ");
		int age=input1.nextInt();
		System.out.print("Villege: ");
		String villege=input.nextLine();
		System.out.print("mandal: ");
		String mandal=input.nextLine();
		System.out.print("distric: ");
		String distric= input.nextLine();
		System.out.print("@# successful #@");
	
//	
//		File file = new File("E:/properties/propertyFile.txt");
//		try {
//			FileWriter fwriter = new FileWriter(file);
//			BufferedWriter bwriter = new BufferedWriter(fwriter);
//			bwriter.write("nagaseshareddy ");
//			bwriter.newLine();
//			bwriter.write("nagasubba reddy");
//			bwriter.newLine();
//			bwriter.flush();
//			bwriter.write("venkata lakshmi");
//			bwriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	
	}
}
