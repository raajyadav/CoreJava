package abstractionInterface;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar();
		v1.start();
		v1.stop();
		System.out.println("==============");
		
		Car c1 = (Car)v1;
		c1.start();
		c1.stop();
		c1.load();
		c1.openGate();
		System.out.println("========================");
		
		ElectricCar e1 =(ElectricCar)v1;
		e1.charge();
		System.out.println("========================");

		Vehicle v2 = new Bike();
		Bike b1 =(Bike)v2;
		b1.stop();
		b1.start();
		b1.kick();
		b1.load();

	} 
	
}
