package fileHandling;
import java.io.*;
import java.util.Scanner;

public class FileWriting2 {

	public static void main(String[] args) {
		String filePath = "d:\\user.txt";
		File f1 = new File(filePath);
		
		try(FileWriter fw = new FileWriter(f1,true);
			Scanner sc= new Scanner(System.in);	
			){
			
			    System.out.println("Enter your name:");
			    String name = sc.nextLine();
			    System.out.println("Enter your age:");
			    int age = sc.nextInt();
			    System.out.println("Enter the weight:");
			    double weight = sc.nextDouble();
			    fw.write("Name is: "+name+"\n");
			    fw.write("Age is: "+age+"\n");
			    fw.write("Weight is: "+weight+"Kg\n");
			    fw.write("=========================\n");
				System.out.println(f1.length());
			    System.out.println("File writing is Completed");
			    
			    
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends");
		
	}
}


