package fileHandling;

import java.io.BufferedReader;
import java.io.*;

public class FileReading3 {
	
	public static void main(String[] args) {
		String filePath="d:\\Factorial.java";
		File f1 = new File(filePath);
		
		try(FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr)	){
			
			int x=br.read();
			while(x!=-1) {
				System.out.print((char)x);
			x=br.read();	
			}
		System.out.println("==============================Read Buffered is Completed=================");	
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=====================Application Ends===============================");
	}

}
