package fileHandling;

import java.io.*;

public class Program5 {
	
	public static void main(String[] args) {
		String filePath	= "d:\\abc.java";
		File f1 = new File(filePath);
		try {
			   f1.createNewFile();
			   System.out.println("file is Created!!");
		}
		catch(Exception e) {
			System.out.println("File is not Created!!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ends");
	}

}
