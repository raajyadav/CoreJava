package copyConstructor;

public class CarDriver {
	
	 public static void main(String[] args) {
	        Car c1 = new Car("MG",34233.3,200);
	        Car c2 = new Car("BMW", 73847.4, 120);
	        Car c3 = new Car("Audi", 3749347.4, 130);
	

	        Car c4 = new Car(c2);
	        Car c5 = new Car(c3);
	        Car c6 = new Car(c3, 32342.4);
	        
	         
	        System.out.println(c1.getDetails());
	        System.out.println(c2.getDetails());
	        System.out.println(c3.getDetails());
	        System.out.println(c4.getDetails());
	        System.out.println(c5.getDetails());
	        System.out.println(c6.getDetails());
	    }
}
