package exceptionHandling;

public class Program12 {

	public static void main(String[] args) {
		
		try {
			int a=100 , b=0 , c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();  /* It print everything about Exception */
//			System.out.println(ae);
//			System.out.println(ae.toString());
//			System.out.println(ae.getMessage());
		}
	}
}
