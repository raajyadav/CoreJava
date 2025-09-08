package fileHandling;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("sum is : "+(a+b));
		
		try {
		      System.out.println("Quotient is: "+(a/b));
		      
		}catch(Exception e) {
			System.out.println("Infinity");
			System.out.println(10/0);
		
	    }
		finally {
			System.out.println("Scanner is closing now");
			sc.close();
			System.out.println("Scanner is closed");
		}
		System.out.println("Product is : "+a*b);
		System.out.println("========Program Ends======");
		
	}

}
