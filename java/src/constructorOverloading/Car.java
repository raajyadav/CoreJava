package constructorOverloading;

public class Car {

	String name;
	String color;
	double price;
	int hp;
	
	Car(){
		
	}
	Car(String name){
		this.name=name;
	}
	Car(String name, String color){
		this.name=name;
		this.color=color;
	}
	Car(String name, String color, double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	Car(String name, String color, double price, int hp){
		this.name=name;
		this.color=color;
		this.price=price;
		this.hp=hp;
	}
	
	public String getDetails() {
		return "Name is : "+name+"\nColor is : "+color+"\nPrice is : "+price+"\nHorse Power is : "+hp+"\n============================";
	}
	
}
