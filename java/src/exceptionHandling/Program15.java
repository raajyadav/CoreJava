package exceptionHandling;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a =sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println(a+"+"+b+"= "+(a+b));
		System.out.println(a+"-"+b+"= "+(a-b));
		try{
			System.out.println("Try blocks Start");
			System.out.println(a+"/"+b+"= "+(a/b));
			System.out.println("Try blocks End");
		}
		catch(ArithmeticException e) {
			System.out.println("Message is:"+e.getMessage());
			System.out.println(10/0);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Starts");
			System.out.println(a+"*"+b+"= "+(a*b));
			sc.close();
			System.out.println("Finally Ends!");
		}
		System.out.println("Program Ends");
	}
}
