package exception_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.PushbackReader;

public class CheckedClass {

	public static void main(String[] args) {
		try {
			File f= new File("E:/class.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			BufferedWriter bw = new BufferedWriter(pw);
//			pw.println("seshu");
//			pw.println("sudha");
//			pw.println("naveen");
//			pw.println("nagamalla");
//			pw.println("jyothi");
//			pw.println("reddy");
			
			
			bw.write("seshu");
			bw.newLine();
			bw.write("sudha");
			bw.newLine();
			bw.write("naveen");
			bw.newLine();
			bw.write("reddy");
			bw.newLine();
			bw.flush();
			bw.write("nagamalla");
			bw.newLine();
			bw.write("jyothi");
			bw.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("this is an exception"+e);
		}
		try {
			File f = new File("E:/class.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String tex="";
			String line= br.readLine();
			
			while(line != null) { 
				tex += line;
			line=br.readLine();
			
			}
				System.out.println(tex+"\n");
			
//			txt=br.readLine();
//			System.out.println(txt);
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
			System.out.println("this is an exception"+ioe);
		}
		

	}

}
