package copyConstructor;

public class Car {
	
	String name;
	double price;
	int hp;
	
	Car(){
		System.out.println("Car object is Created");
	}
	Car(String name, double price,int hp){
		 this.name = name;
	     this.price = price;
	     this.hp=hp;
	}
	Car(Car p){
	   this(p.name, p.price, p.hp);	
	}
	Car(Car p, double price){
		this.price = price; 
	}
	
	public String getDetails(){
        return "Name : "+name+"\nPrice :"+price+"\nHorse Power:"+hp+"\n=========================";
    }

}
