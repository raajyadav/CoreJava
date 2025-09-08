package hasArelationShip;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car("TATA",new Engine());
		System.out.println("Car object is: "+c1);
		System.out.println("Car Engine Object: "+c1.e);
		System.out.println("Car name is: "+c1.name);
        c1.openGate();
        c1.e.start();
	}
}
