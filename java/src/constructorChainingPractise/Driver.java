package constructorChainingPractise;

public class Driver {

	public static void main(String[] args) {
		  Car c1 = new Car("Maruti");
		  Car c2 = new Car("Audi", 2.3894774E7);
		  Car c3 = new Car("MG", 2.3894774E7, "Red");
		  Car c4 = new Car("Maruti",242224.09,"Red",330);
		  Car c5 = new Car("TATA", 7.456453457E8, "Red", 210);
	      Car c6 = new Car("Maruti", 487645.5, "Blue", 120);
		 
			
			System.out.println(c1.getDetails());
			System.out.println(c2.getDetails());
			System.out.println(c3.getDetails());
			System.out.println(c4.getDetails());
			System.out.println(c5.getDetails());
			System.out.println(c6.getDetails());
		  
		
	}
}
