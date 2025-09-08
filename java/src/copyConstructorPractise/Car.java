package copyConstructorPractise;

public class Car {
	
	 String name;
     double price;
     String color;
     int hp;

     Car(){
       System.out.println("Car object is created"); 
     }

     Car(String name, double price, String color, int hp){
            this.name = name;
            this.price = price;
            this.color = color;
            this.hp = hp;
     }
     Car(Car p){
    	 this(p.name, p.price, p.color, p.hp);
     }
     Car(Car p , double price){
    	 this.price=price;
     }
     
     public String getDetails(){
        return "Name is:" +name+"\nPrice is: "+price+"\nColor is: "+color+"\nHorse Power is: "+hp+"\n==================***********==================";
     }

}
