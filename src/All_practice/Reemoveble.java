package All_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reemoveble {
	public static void main(String[] args) throws Exception {

		ArrayList<Object> list = new ArrayList<Object>();
		list.add("seshu");
		list.add("jyoyhsna");
		list.add("priya");
		list.add(11);
		list.add(22);
		list.add(33);
		list.add('a');
		list.add('b');
		list.add('c');
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "seshu");
		hm.put(2, "reddy");
		hm.put(3, "sowji");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
	
		File f = new File("E://sowji.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("i am nagasesha reddy ");
		bf.newLine();
		bf.write("She is sowji");
		bf.newLine();
		bf.write("jyothi is my sister");
		bf.flush();
		
		
		FileReader fr = new FileReader("E:sowji.txt");
		BufferedReader br= new BufferedReader(fr);
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		br.close();
		
		
		XSSFWorkbook w = new XSSFWorkbook();
		OutputStream out = new FileOutputStream("E://sowji.xlsx");
		Sheet s = w.createSheet("A");
		Row r = s.createRow(2);
		Cell ce = r.createCell(1);
		ce.setCellValue("nagasesha");
		w.write(out);
		w.close();
		
		
		
		InputStream input = new FileInputStream("E://sowji.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(input);
		Sheet sh = wb.getSheet("A");
		Row ro = sh.getRow(2);
		Cell cel = ro.getCell(1);
		String x = cel.getStringCellValue();
		System.out.println(x);
		
		System.out.println("\n prime numbers \n");
		
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (j==i) {
					System.out.println(i);
				}
				if (i%j==0) {
					break;
				}
			}
		}
		
		String name = "seshu";
		String reverse="";
		for (int i = 0; i < name.length(); i++) {
			reverse = reverse+name.charAt(i);
			
			
		}
		System.out.println(reverse);
		
		
	}
}

