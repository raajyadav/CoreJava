package exceptionHandling;

public class Program19 {

	public static void main(String[] args) {
		Program19 p = new Program19();
		System.out.println("Program Start");
		try {
			p.divide();	
		}
	    catch(ArithmeticException e) {
	    	e.printStackTrace();
//	    	System.out.println("Exception is : "+e.getMessage());
	    }
		System.out.println("Program End");
	}
	
	void divide() {
	    	int a=100, b=0,c;
	    	c=a/b;
	    	System.out.println(c);
		
		
	}
	
}
