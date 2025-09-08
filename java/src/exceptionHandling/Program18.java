package exceptionHandling;

public class Program18 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
		int a = 100, b=0, c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Ends");
	}
}
