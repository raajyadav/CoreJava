package exceptionHandling;
import java.io.*;

public class Program9 {

public static void main(String[] args) {
		
		String path = "f:\\abcd.txt";
		File f1 = new File(path);
		try {
			f1.createNewFile();
			System.out.println("File is created");
		}catch (Exception e) {
			System.out.println("File is not created");
			System.out.println(e.getMessage());
		}
	
		System.out.println("================Program Ends==============");
	}

}
