package constructorOverloadingPractise;

public class Car {
	String name;
	double price;
	String color;
	int hp;
	
	Car(){
		
	}
	Car(String name){
	  this.name=name;	
	}
	Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	Car(String name, double price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	Car(String name, double price, String color,int hp){
		this.name=name;
		this.price=price;
		this.color=color;
		this.hp=hp;
	}
	
	public String getDetails() {
		return "Name is: "+name+"\nPrice is: "+price+"\nColor is: "+color+"\nHorse Power is: "+hp+"\n=============================";
	}

}
