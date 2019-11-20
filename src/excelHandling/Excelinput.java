package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelinput {
	 public static String gmailID;
	public static String gmailpass;
	
	public Excelinput(String gmailID) {
		 gmailID= this.gmailID;
	}

	public static void main(String[] args) throws Exception {
		//Excelinput ex = new Excelinput(gmailID);
		 InputStream input = new FileInputStream("E://excel1.xlsx");
		Workbook wb = new XSSFWorkbook(input);
		Sheet s = wb.getSheet("A");
		gmailID =s.getRow(1).getCell(0).getStringCellValue();
		gmailpass = s.getRow(1).getCell(1).getStringCellValue();
//		Row r = s.getRow(0);
//		Cell c = r.getCell(2);
//		c= r.getCell(1);
//		c= r.getCell(20);
//		String str = c.getStringCellValue();
//		String str1= c.getStringCellValue();
//		String str2 = c.getStringCellValue();
		
		System.out.println(gmailID);
		System.out.println(gmailpass);
		
		
		wb.close();

	}
	public static void mi() {
		System.out.println(gmailID);
	}
	

}
