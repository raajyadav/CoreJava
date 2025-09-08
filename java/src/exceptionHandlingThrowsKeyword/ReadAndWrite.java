package exceptionHandlingThrowsKeyword;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class ReadAndWrite {
	
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
		//more statment
	}
	
	void saveFile() throws FileNotFoundException {
		String text="this is saveFile method";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
	}

}
