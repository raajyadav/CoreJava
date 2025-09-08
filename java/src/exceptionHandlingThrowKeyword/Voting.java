package exceptionHandlingThrowKeyword;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age =sc.nextInt();
		try {
		     if(age >= 18) {
			 System.out.println("You can vote");
		     }
		     else {
			 throw new YoungerAgeException("You are not elligle for vote");
		     }
		}
		catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}
}
