package finalNonStaticVariable;

public class Car {
	
	final static String brand;
	final String car_no;
	double price;
	String color;
	static {
		brand = "TATA";
	}
	
	Car(String car_no){
		this.car_no=car_no;
	}
	Car(double price, String car_no){
		this.price = price;
		this.car_no = car_no;	
	}
	Car(String car_no, String color, double price){
		this.color = color;
		this.price = price;
		this.car_no = car_no;
		
	}

}
