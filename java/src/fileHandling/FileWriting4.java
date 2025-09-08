package fileHandling;
import java.io.*;
import java.util.Scanner;

public class FileWriting4 {
	
	public static void main(String[] args) {
		String filePath = "d:\\user2.txt";
		File f1 = new File(filePath);
		
		try(FileOutputStream fos = new FileOutputStream(f1,true);
		    Scanner sc = new Scanner(System.in);
			  ){
			
			fos.write(65);
			fos.write("abcd\n".getBytes());
			System.out.println("ENter the Name: ");
			String name=sc.nextLine();
			System.out.println("Enter the Age: ");
			int age=sc.nextInt();
			System.out.println("ENter the Weight: ");
			double weight=sc.nextDouble();
			fos.write(("Name is: "+name+"\n").getBytes());
			fos.write(("Age is: "+age+" Years\n").getBytes());
			fos.write(("Weight is: "+weight+" Kg\n").getBytes());
			fos.write("==========================\n".getBytes());
			System.out.println("File writing is Completed");
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
