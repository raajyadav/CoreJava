package exceptionHandlingCustomizedCheckedException;
import java.util.Scanner;
public class Voting {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
		    if(age < 18) {
			   throw new UnderAgeException("You are not elligle for vote , age must be 18");
		    }
		    else {
			   System.out.println("You are elligle for vote");
		    }
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}

}
