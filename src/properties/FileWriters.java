package properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import com.sun.xml.bind.v2.runtime.property.Property;

public class FileWriters {

	

	public static void main(String[] args) throws Exception {
		try {
		//File file = new File("E:\\java selenium\\Practice\\Hello.properties\\class1.properties");
		FileWriter filewriter = new FileWriter("E:\\java selenium\\Practice\\Hello.properties\\class1.properties");
		BufferedWriter buffered = new BufferedWriter(filewriter);
		buffered.write("nagasesha reddy");
		buffered.newLine();
		buffered.write("nagasesh REDDY");
		buffered.flush();
	
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader= new FileReader("E:\\java selenium\\Practice\\Hello.properties\\class1.properties");
			BufferedReader buffered1 = new BufferedReader(reader);
//			Properties p = new Properties();
//			p.load(buffered1);
			
			System.out.println(buffered1.readLine());
			System.out.println(buffered1.readLine());
			buffered1.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
