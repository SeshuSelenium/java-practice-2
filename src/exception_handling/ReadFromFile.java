package exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileReader fr= new FileReader("E:/files.txt");
			BufferedReader br= new BufferedReader(fr);
			String text="";
			String line= br.readLine();
			while(line != null) { 
				text += line;
			line=br.readLine();
			
			}
			
				System.out.println(text);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
			System.out.println("this is an exception"+ioe);
			
		}

	}

}
