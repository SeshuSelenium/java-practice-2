package exception_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import excelHandling.Excelinput;

public class Checked_exception {

	public static void main(String[] args) {
		
		//String gmailID = null;
		Excelinput e = new Excelinput(null);
		System.out.println(e.gmailID);
		// checked exception: an exception can
		try {
			File f = new File("E:weekdays.txt");

			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			 BufferedWriter br = new BufferedWriter(fw);
			// br.write("seshu");

			
			 br.write("hello");
			 br.write("hi");
			 br.flush();
			 br.write("oye");

			pw.println("seshu");
			pw.println("hello");
			pw.println("hi");
			pw.flush();
			pw.println("oye");
		} catch (Exception ex) {
			
			ex.printStackTrace();
			System.out.println("this is an error");
		}

	}

}
