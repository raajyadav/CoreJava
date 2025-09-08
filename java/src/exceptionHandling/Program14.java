package exceptionHandling;

import java.util.Scanner;

public class Program14 {
	
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a:");
	 int a =sc.nextInt();
	 System.out.println("Enter b:");
	 int b = sc.nextInt();
	 System.out.println(a+"+"+b+"="+(a+b)); 
	 System.out.println(a+"-"+b+"="+(a-b)); 
	 try {
		 System.out.println("Try block start");
		 System.out.println(a+"/"+b+"="+(a/b));
		 System.out.println("Try block end");
	 }
	 catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println(e); 
		System.out.println("Message is:"+e.getMessage());
		System.out.println("=======================");
		e.printStackTrace();
		System.out.println("=================");
		System.out.println(a+"/"+b+"= Infinity");
		
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 System.out.println(a+"*"+b+"= "+(a*b));
	 System.out.println("Program Ends");
}
	
}
