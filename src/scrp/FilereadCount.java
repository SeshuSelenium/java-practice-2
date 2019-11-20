package scrp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilereadCount {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:\\sheshu.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		int x = 0;
		while ((str=br.readLine())!=null) {
			x++;
			if (str.contains("Experience")) {
				
				System.out.println(x + " : " +str);
			}
		}
	}

}
