package parametrizedConstructor;

public class CarDriver {
	
	public static void main(String[] args) {
		Car c1 = new Car("BMW","Yellow",2083938);
		Car c2 = new Car("Maruti", "White", 3487944);
		Car c3 = new Car("Tesla","Black",4734944);
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
	}

}
