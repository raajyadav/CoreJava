package constructor;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);
		Car.test();
		c1.drive();
		
	   Car c2 = new Car();
	   System.out.println(c2);
	}
}
