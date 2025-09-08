package serializationAndDeserialization;

import java.io.*;
import java.util.Scanner;

public class Serialized1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employ1 details");
		System.out.println("Enter Name: ");
		String name1=sc.nextLine();
		System.out.println("Enter UID: ");
		String uid1=sc.nextLine();
		System.out.println("Enter PWD: ");
		String pwd1=sc.nextLine();
		System.out.println("Enter Age: ");
		int age1=sc.nextInt();
		System.out.println("Enter Salary: ");
		double salary1=sc.nextDouble();
		
		System.out.println("Enter employ2 details");
		System.out.println("Enter Name: ");
		sc.nextLine();
		String name2=sc.nextLine();
		System.out.println("Enter UID: ");
		String uid2=sc.nextLine();
		System.out.println("Enter PWD: ");
		String pwd2=sc.nextLine();
		System.out.println("Enter Age: ");
		int age2=sc.nextInt();
		System.out.println("Enter Salary: ");
		double salary2=sc.nextDouble();
		
		Employ e1=new Employ(name1, uid1, pwd1, age1, salary1);
		Employ e2=new Employ(name2, uid2, pwd2, age2, salary2);
		//serialization code
		
		File f1=new File("d:\\Emp.ser");
		try(FileOutputStream fos=new FileOutputStream(f1, true);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			){
				oos.writeObject(e1);
				oos.writeObject(e2);
				System.out.println("===Serialization is Completed====");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Message is : "+e.getMessage());
		}
		System.out.println("=====Application Ends=======");
	}

}


