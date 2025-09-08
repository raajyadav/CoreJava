package abstraction;

public class Driver {
	
	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar();
		ElectricCar e1=(ElectricCar)v1;
		e1.start();
		e1.run();
		e1.play();
		e1.charge();
		
		System.out.println("=============================");
		
		Bike b1 = new Bike();
		b1.start();
		b1.run();
		b1.play();
		
	}

}
