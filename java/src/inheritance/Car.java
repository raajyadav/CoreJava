package inheritance;

public class Car extends Vehicle {
	String name;
	double hp;
	
	Car(){
		
	}
	Car(String type, double amount, double roi,String name,double hp){
		super(type,amount,roi);
		this.name=name;
		this.hp=hp;
	}
	public String getCarDetails() {
		return super.getVehicleDetails()+"Name is: "+name+"\nHorse Power is: "+hp+"\n==========================";
	}

}
