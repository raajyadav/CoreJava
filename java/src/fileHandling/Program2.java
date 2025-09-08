package fileHandling;
import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);
				//Resource2 r2=new Resource2();
		  ){
			System.out.println("Enter 1st number");
			int a =sc.nextInt();
			System.out.println("Enter 2nd number");
			int b =sc.nextInt();
			System.out.println("Sum is: "+(a+b));
			System.out.println("Quotient is: "+(a/b));
			System.out.println("Product is: "+(a*b));
			
		}catch(Exception e) {
			System.out.println("Infinity");
//			e.printStackTrace();
		}
		System.out.println("Program ends");
	}

}
