package factoryPattern;

import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FastFoodFactory fastFoodFactory=new FastFoodFactory();
		System.out.println("Enter the Fast food You want: ");
		String fastFood=sc.nextLine();
		
		try {
			FastFood f=fastFoodFactory.takeRequestAndGive(fastFood);
			f.printDetails();
		} catch (NoSuchItemFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends");
	}

}