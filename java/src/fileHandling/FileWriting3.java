package fileHandling;
import java.io.*;
import java.util.Scanner;

public class FileWriting3 {
	
	public static void main(String[] args) {
		
		String filePath = "d:\\user1.txt";
		File f1 = new File(filePath);
		
		try(FileWriter fw = new FileWriter(f1,true);
			BufferedWriter bw = new BufferedWriter(fw);	
			Scanner sc =new Scanner(System.in);	
			){
			
			  System.out.println("Enter your name:");
			  String name = sc.nextLine();
			  System.out.println("Enter your age");
			  int age = sc.nextInt();
			  System.out.println("Enter your Weight");
			  double weight = sc.nextDouble();
			  bw.write("Name is: "+name+"\n");
				bw.write("Age is: "+age+" Years\n");
				bw.write("Weight is: "+weight+" Kg\n");
				bw.write("==========================\n");
				System.out.println("File writing is Completed");
			  
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============Program Ends===============");
	}

}
