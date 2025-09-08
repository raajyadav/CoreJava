package fileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReading1 {
	
	public static void main(String[] args) {
		String filePath="d:\\abc.java";
		File f1 = new File(filePath);
		
		try(FileReader fr = new FileReader(f1) ){
			System.out.println(fr.read());      //fr ony show AASCI value 
			System.out.print((char)fr.read());   //type cast shows character
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.println((char)fr.read());
			System.out.print(fr.read()+" "); 
			System.out.print(fr.read()+" ");
			System.out.println(fr.read()+" ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("============Program Ends===============");
	}

}
