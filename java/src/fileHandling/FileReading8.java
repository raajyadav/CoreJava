package fileHandling;

import java.io.File;
import java.util.Scanner;


public class FileReading8 {
	
	public static void main(String[] args) {
		String filePath = "d:\\Factorial.java";
		File f1 = new File(filePath);
		
		try(Scanner sc =new Scanner(f1)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
