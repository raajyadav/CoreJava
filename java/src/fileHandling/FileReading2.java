package fileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReading2 {
	
	 
		public static void main(String[] args) {
			
			String filePath="d:\\Factorial.java";
			File f1 = new File(filePath);
			
			try(FileReader fr = new FileReader(f1) ){
				
				int x=fr.read();
				while(x!=-1) {
					System.out.print((char)x);
				x=fr.read();	
				}
				
				System.out.println("============================File Reading is Completed");
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("======================Application Ends=================");
		}
			

	


}
