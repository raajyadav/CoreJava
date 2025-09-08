package fileHandling;

import java.io.*;

public class FileReading6 {

	public static void main(String[] args) {
		String filePath="d:pic.jpg";
		File f1 = new File(filePath);
		
		try(FileInputStream fis = new FileInputStream(f1);){
			
			byte[] x=fis.readNBytes(5);
			for(byte p:x)
				System.out.println(p);
			
			System.out.println("===================Reading is Completed===================");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=========================Application Ends==========================");
	}
}
