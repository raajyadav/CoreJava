package downCasting;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Car c1 =(Car)v1;
		c1.start();
		c1.stop();
		c1.openGate();
	}
	
}
