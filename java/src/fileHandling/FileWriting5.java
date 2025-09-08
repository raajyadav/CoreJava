package fileHandling;

import java.io.*;
import java.util.Scanner;

public class FileWriting5 {
	
	public static void main(String[] args) {
		
		String filePath ="d:\\user3.txt";
		File f1 = new File(filePath);
		
		try(FileOutputStream fos = new FileOutputStream(f1,true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				Scanner sc = new Scanner(System.in);
			){
			
			    System.out.println("Enter your name");
			    String name =sc.nextLine();
			    System.out.println("Enter your age");
			    int age = sc.nextInt();
			    System.out.println("Enter your Weight");
			    double weight =sc.nextDouble();
			    bos.write(("Name is: "+name+"\n").getBytes());
			    bos.write(("Age is: "+age+"\n").getBytes());
			    bos.write(("Weight is: "+weight+"\n").getBytes());
			    bos.write(("===================\n").getBytes());
			    System.out.println("File Writing is Completed");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("============Program Ends============");
		
	}

}
