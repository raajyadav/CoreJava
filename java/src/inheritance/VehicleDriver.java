package inheritance;

public class VehicleDriver {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Electric",23344444,14,"TATA", 340);
		Car c3 = new Car("Diesel", 3483848, 15, "Maruti", 450);
		
	    System.out.println(c1.getCarDetails());
		System.out.println(c2.getCarDetails());
		System.out.println(c3.getCarDetails());
//		System.out.println(c2.getVehicleDetails());
	}

}
