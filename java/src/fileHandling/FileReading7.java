package fileHandling;

import java.io.*;

public class FileReading7 {
	
	public static void main(String[] args) {
		String filePath ="d:\\Factorial.java";
		File f1 = new File(filePath);
		
		try(FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);	
			){
			
			int x=bis.read();
			while(x!=-1) {
				System.out.print((char)x);
			x=bis.read();	
			}
			
			System.out.println("===================Reading is Completed===================");

			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================Application Ends==========================");

	}

}
