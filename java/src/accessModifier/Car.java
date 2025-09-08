package accessModifier;

public class Car {

	protected static int b=20;
	
	 protected static void run() {
		 System.out.println("Car run");
	 }
	 
	 public static void main(String[] args) {
		Bus.drive();
	}
	
	
}
