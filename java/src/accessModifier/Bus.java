package accessModifier;

public class Bus {

	 public static int a=10;

	 
	 public static void drive() {
		 System.out.println("Drive Bus");
	 }
	
	 public static void main(String[] args) {
		  drive();
		  System.out.println("a: "+a); //come from same package and same class
		  Car.run();  //come from same package but from diiferent class
	}
	 
	
}
