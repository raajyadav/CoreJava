package copyConstructorPractise;

public class Driver {
	
	public static void main(String[] args) {
      
		  Car c1 = new Car("Tayota",34233.3,"Red",200);
	      Car c2 = new Car("MG", 73847.4,"Black", 120);
	      Car c3 = new Car("Audi", 3749347.4, "White",130);
	      
	      Car c4 = new Car(c1);
	      Car c5 = new Car(c2);
	      Car c6 = new Car(c3, 222222.8);
	      
	      
	      System.out.println(c1.getDetails());
	      System.out.println(c2.getDetails());
	      System.out.println(c3.getDetails());
	      System.out.println(c4.getDetails());
	      System.out.println(c5.getDetails());
	      System.out.println(c6.getDetails());
	      
		

	}

}
