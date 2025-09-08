package fileHandling;

import java.io.*;

public class FileReading4 {
	
	public static void main(String[] args) {
		String filePath="d:\\Factorial.java";
		File f1 = new File(filePath);
		
		try(FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			){
			
			String s = br.readLine();
			while(s!=null) {
				System.out.println((String)s);
			s=br.readLine()	;
			}
			System.out.println("========================BufferedReader is Completed==============");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("======================Application Ends===============================");

	}
}
