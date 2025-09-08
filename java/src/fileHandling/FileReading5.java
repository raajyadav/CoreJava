package fileHandling;

import java.io.*;

public class FileReading5 {
	
	public static void main(String[] args) {
		String filePath ="d:\\Factorial.java";
		File f1 = new File(filePath);
		
		try(FileInputStream fis = new FileInputStream(f1)){
			
			int x=fis.read();
			while(x!=-1) {
				System.out.print((char)x);
			 x=fis.read();	
			}
			
			System.out.println("==========================FileInputStream is completed ===============================");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("============================Application Ends=================================");
	}

}
