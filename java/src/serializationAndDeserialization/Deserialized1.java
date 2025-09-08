package serializationAndDeserialization;

import java.io.*;

public class Deserialized1 {
	
	public static void main(String[] args) {
		File f1 = new File("d:\\Emp.ser");
		
		try(FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
			
			Employ e1 = (Employ)ois.readObject();
			Employ e2 = (Employ)ois.readObject();
			System.out.println("Employ1 Details: "+e1.getDetails());
			System.out.println("Employ2 Details: "+e2.getDetails());
			
			System.out.println("====Deserialization is completed=====");	
			
		}catch(Exception e) {
		
			System.out.println(e);
		
		}
		
		System.out.println("========Application Ends=====");
	}

}
