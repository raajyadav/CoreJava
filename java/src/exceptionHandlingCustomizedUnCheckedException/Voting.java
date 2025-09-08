package exceptionHandlingCustomizedUnCheckedException;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		try {
		     if(age <= 18) {
			     throw new UnderAgeException(" You are not elligle for vote, required age must be greater than or equal to 18");
		     }
		     else {
			    System.out.println("You are elligle for vote");
		    }
		}
		catch(UnderAgeException e) {
			System.out.println("Your age is :"+age+ " So" +e.getMessage());;
		}
		System.out.println("Program ends");
		
	}
}
