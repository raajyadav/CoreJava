package multiThreading;

public class VehicleDriver {
	
	public static void main(String[] args) {
		System.out.println("==================Main start=============");
		Vehicle v1 = new Vehicle("Car",10);
		Vehicle v2 = new Vehicle("Bus",20);
		Vehicle v3 = new Vehicle("Bike",5);
		Vehicle v4 = new Vehicle("Auto",7);
	
//		Here it run one by one . here is not used MultiTreading
//		v1.drive();
//		v2.drive();
//		v3.drive();
//		v4.drive();
	
		
//		Here is used Thread method start() . it run dynamically
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		System.out.println("==================Main start=============");	
	}

}
