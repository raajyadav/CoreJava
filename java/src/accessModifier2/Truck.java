package accessModifier2;
import accessModifier.Car;

public class Truck extends Car{

	public static void main(String[] args) {
	  
		Car.run();  //come from another package like accessModifier.Car package 
		System.out.println(Car.b);
	}
}
