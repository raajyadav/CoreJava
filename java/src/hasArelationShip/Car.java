package hasArelationShip;

public class Car {
	
	String name;
	Engine e;
	
	Car(){
		
	}
	Car(String name, Engine e){
		this.name=name;
		this.e=e;
	}
	
	public void openGate() {
		System.out.println("openGate in car");
	}

}
