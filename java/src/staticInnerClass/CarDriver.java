package staticInnerClass;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println(Car.x);
		Car.test();
		
		System.out.println(Car.Engine.y);
		Car.Engine.start();
	}
}
