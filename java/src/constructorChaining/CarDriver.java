package constructorChaining;

public class CarDriver {
	
	public static void main(String[] args) {
		 Car c1 = new Car("Maruti");
		 Car c2 = new Car("Maruti",2983393);
		 Car c3 = new Car("Maruti" , 48384848, "White");
		 Car c4 = new Car("Maruti",44244444 , "White", 450);
		 Car c5 = new Car("BMW", 244244444, "Blue",550);
		 Car c6 = new Car("Thar" , 1434448, "Black", 530);
		 
		 System.out.println(c1.getDetails());
		 System.out.println(c2.getDetails());
		 System.out.println(c3.getDetails());
		 System.out.println(c4.getDetails());
		 System.out.println(c5.getDetails());
		 System.out.println(c6.getDetails());
	}

}
