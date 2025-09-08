package anonymousClassProgram;

public class VehicleDriver {
	
	public static void main(String[] args) {
		 Vehicle car = new Vehicle() {
			 public  void start() {
				 System.out.println("Car start");
			 }
			 
			 public void drive() {
				 System.out.println("Car drive");
			 }
		 };
		 
		 Vehicle bike = new Vehicle() {
			 public void start() {
				 System.out.println("Bike start");
			 }
			 
			 public void drive() {
				 System.out.println("Bike drive");
			 }
		 };
		 
		 car.start();
		 car.drive();
		 System.out.println("=====================");
		 bike.start();
		 bike.drive();
	}

}
