package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program Start");
		
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("I am in Finally block");
		}
		System.out.println("Program End");
	}
}
