
package properties;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_reader {

	public static void main(String[] args) {
		try {
			//FileInputStream fs = new FileInputStream("E:\\javaFileHandiling\\hai.properties");
			System.out.println(System.getProperty("user.dir"));
			FileReader fr = new FileReader("E:\\java selenium\\Practice\\Hello.properties\\class.properties");
			BufferedReader br = new BufferedReader(fr);
			Properties p = new Properties();
			p.load(br);
			System.out.println(p.getProperty("name"));
			System.out.println(p.getProperty("villege"));
			System.out.println(p.getProperty("distric"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		
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

	
			
	}

}
