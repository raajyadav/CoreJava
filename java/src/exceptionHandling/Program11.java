package exceptionHandling;

public class Program11 {
  
	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(2);
			int a=100, b=0, c;
//			int a=100, b=0, c;
			System.out.println(3);
			c=a/b;
			System.out.println(c);
			System.out.println(4);
		}catch(ArithmeticException  e) {
			System.out.println(5);
			System.out.println("You cannot divide by zero");
			System.out.println(6);
		}
		System.out.println("Program Ends");
	}
}
