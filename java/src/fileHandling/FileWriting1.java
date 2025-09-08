package fileHandling;
import java.io.*;

public class FileWriting1 {
	
	public static void main(String[] args) {
		String filePath="d:\\pqr.txt";
		File f1 = new File(filePath);
		
		try(FileWriter fw = new FileWriter(f1);) {
			
			fw.write('A'+"\n");
			fw.write("65"+"\n");
			fw.write('c'+"\n");
			fw.write("Raj is a good boy"+"\n");
			fw.write("Raju is a good boy");
			System.out.println("File writing is created");
			
		} catch (IOException e) {
			
		System.out.println(e.getMessage());
		}
		
		System.out.println("=======Program Ends=========");
	}

}
