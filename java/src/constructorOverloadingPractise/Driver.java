package constructorOverloadingPractise;

public class Driver {
	
	public static void main(String[] args) {
		Car c1 = new Car("Maruti");
		Car c2 = new Car("Maruti",232322.33);
		Car c3 = new Car("Maruti", 2323223.44,"Red");
		Car c4 = new Car("MAruti",3432434.22,"White",340);
		Car c5 = new Car();
		Car c6 = new Car("BMW",3334444,"Red",550);
		Car c7 = new Car("Audi",2344232.33,"Black",440);
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println(c4.getDetails());
		System.out.println(c5.getDetails());
		System.out.println(c6.getDetails());
		System.out.println(c7.getDetails());
	}

}
