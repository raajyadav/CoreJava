package fileHandling;
import java.io.*;

public class Program3 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("d:\\abc.txt"); ){
			
			System.out.println("try block");
			System.out.println("File created");
		}catch(Exception e) {
			System.out.println("catch block");
//		 	e.printStackTrace();
		    System.out.println(e.getMessage());	
		}
	}
}
