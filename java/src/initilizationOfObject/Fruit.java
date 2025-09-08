package initilizationOfObject;

public class Fruit {

	String name;
	String color;
	double price;
	
	public void setDetails(String name , String color , double price) {
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	
	public String getDetails() {
		return "Name is: "+name+"\nColor is : "+color+"\nPrice is : "+price+"\n=================================";
	}
	
}
