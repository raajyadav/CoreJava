package parametrizedConstructor;

public class Car {
	String name;
	String color;
	double price;
	
	Car(String name, String color, double price){
	  this.name=name;
	  this.color=color;
	  this.price=price;
	}

	public String getDetails() {
		 return "Name is: "+name+"\nColor is : "+color+"\nPrice is : "+price+"\n=================================";
	}
}
