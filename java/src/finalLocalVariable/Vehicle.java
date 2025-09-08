package finalLocalVariable;

public class Vehicle {
	
	public static void main(String[] args) {
		
		final int x = 12;
//		         x=28; //--->Error
		         
		final int b ;
		          b = 35;
		       
		       System.out.println(x);
		       System.out.println(b);
	}

}
