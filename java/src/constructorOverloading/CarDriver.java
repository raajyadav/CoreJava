package constructorOverloading;

public class CarDriver {
	
	public static void main(String[] args) {
		Car c1 = new Car("Maruti");
		Car c2 = new Car("Maruti", "White");
		Car c3 = new Car("Maruti","white",434344);
		Car c4 = new Car("Maruti","White",434839,220);
		Car c5 = new Car("BMW", "Yellow", 8348348, 420);
		Car c6 = new Car("Lamborgini", "Blue", 34757939, 530);
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println(c4.getDetails());
		System.out.println(c5.getDetails());
		System.out.println(c6.getDetails());
	}

}
