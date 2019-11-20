package excelHandling;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelOutput {
	
	
	public static void main(String[] args) throws Exception {
		Workbook wb = new XSSFWorkbook();
		OutputStream fileOut = new FileOutputStream("E://excel1.xlsx");
		Sheet s = wb.createSheet("A");
		s.createRow(0).createCell(0).setCellValue("ID");
		s.getRow(0).createCell(1).setCellValue("PASSWORD");
		s.getRow(0).createCell(2).setCellValue("LOGIN_BUTTON");
		s.createRow(1).createCell(0).setCellValue("nagaseshareddy99");
		s.getRow(1).createCell(1).setCellValue("darling143");
		s.getRow(1).createCell(2).setCellValue("log");
		
		s.createRow(2).createCell(0).setCellValue(002);
		s.getRow(2).createCell(1).setCellValue("jyothsna reddy");
		s.getRow(2).createCell(2).setCellValue("anantapur");
		
		s.createRow(3).createCell(0).setCellValue(003);
		s.getRow(3).createCell(1).setCellValue("jyothi reddy");
		s.getRow(3).createCell(2).setCellValue("anantapur");
		
		s.createRow(4).createCell(0).setCellValue(004);
		s.getRow(4).createCell(1).setCellValue("siri");
		s.getRow(4).createCell(2).setCellValue("anantapur");
		
		
//		Row r =s.createRow(0);
//		Cell c = r.createCell(2);
//		r.createCell(1).setCellValue("apple");
//		r.createCell(2).setCellValue("orange");
//		r.createCell(3).setCellValue("hello");
//		r.createCell(4).setCellValue("hi");
//		r.createCell(5).setCellValue("hey");
		wb.write(fileOut); 	// it is like flush 
		wb.close();	// it is stop coding
		
		
			
			}
		
	
	
}
