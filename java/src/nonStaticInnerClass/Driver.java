package nonStaticInnerClass;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.x);
		c1.test();
		
		Car.Engine e= c1.new Engine();
		System.out.println(e.y);
		e.start();
	   
		
	}
}
