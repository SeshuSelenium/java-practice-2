package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_facebook_excel {
	public String username; 
	public String password;

	public static void main(String[] args) throws IOException {
		Read_facebook_excel r = new Read_facebook_excel();
		FileInputStream filein= new FileInputStream("E:\\poi\\loginfile.xlsx");
		Workbook workbookin = new XSSFWorkbook(filein);
		Sheet sht = workbookin.getSheet("facebook_login");
		r.username = sht.getRow(1).getCell(0).getStringCellValue();
		r.password = sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(r.password);
	 	System.out.println(r.username);
		workbookin.close();

	}

}
