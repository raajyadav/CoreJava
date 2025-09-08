package constructorChainingPractise;

public class Car {
	
	String name;
	double price;
	String color;
	int hp;
	
	Car (){
		
	}
	Car(String name){
		this.name=name;
	}
	Car(String name, double price){
		this(name);
		this.price=price;
	}
	Car(String name, double price, String color){
		this(name,price);
		this.color=color;
	}
	Car(String name, double price, String color, int hp){
		this(name,price,color);
		this.hp=hp;
	}
	
	public String getDetails() {
		return "Name is : "+name+"\nColor is : "+color+"\nPrice is : "+price+"\nHorse Power is : "+hp+"\n============================";
	}

}
