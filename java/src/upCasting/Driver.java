package upCasting;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		
		v1.start();
//		v1.stop();//we can't access child type data
	}
}
