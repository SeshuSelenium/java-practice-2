package exception_handling;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Practice_checked {
public static void main(String[] args) {
	

	
		
		BufferedWriter bw= null;
		try {
			String mycontent ="hello hai seshu "+" ya tell me what do you want ";
			String apple= " seshu ";
			String orange= " jyo ";
			File f = new File("E:/files.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			if (!f.exists()) {
				f.createNewFile();
				
			}
			
			bw =new BufferedWriter(fw);
			pw.println(mycontent);
			//bw.write(mycontent);
			bw.write(apple);
			bw.newLine();
			bw.write(orange);
			
		}catch (IOException ioe) {
			// TODO: handle exception
			System.out.println(" this is an error"+ioe);
		}
		finally
		{
			try {
				if(bw!=null)
					bw.close();
				
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("error in closing BufferedWriter"+ex);
			}
		}
		}

	}


