package excelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Facebook_id_pass {

	public static void main(String[] args) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		FileOutputStream output = new FileOutputStream("E:\\poi\\loginfile.xlsx");
		Sheet sheet = workbook.createSheet("facebook_login");
		sheet.createRow(0).createCell(0).setCellValue("username");
		sheet.getRow(0).createCell(1).setCellValue("password");
		sheet.createRow(1).createCell(0).setCellValue("9515599998");
		sheet.getRow(1).createCell(1).setCellValue("darling12345");
		
			workbook.write(output);
			workbook.close();
			
			Excelinput ei = new Excelinput(null);
			
//			Workbook workbookin = new XSSFWorkbook();
//			FileInputStream filein= new FileInputStream("E:\\poi\\loginfile.xlsx");
//			Sheet sht = workbookin.getSheet("facebook_login");
//			System.out.println(sht.getRow(0).getCell(0).getStringCellValue());
//		//	System.out.println(value);
//			workbookin.close();
			
		

	}

}
