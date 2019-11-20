package exception_handling;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class New {
	
	
	
	public static void main(String[] args) {
		

		
			
			BufferedWriter bw= null;
			try {
				String mycontent ="this is my string world"+"the specified file";
				File f = new File("E:/file.txt");
				FileWriter fw = new FileWriter(f);
				
				if (f.exists()) {
					f.createNewFile();
					
				}
				
				bw =new BufferedWriter(fw);
				bw.write(mycontent);
			}catch (IOException ioe) {
				// TODO: handle exception
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



