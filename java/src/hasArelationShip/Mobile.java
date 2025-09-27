package hasArelationShip;

public class Mobile {

	String name;
	Processor p;
	
	Mobile(String name, Processor p){
		this.name=name;
		this.p=p;
	}
	public void vedioCall() {
		System.out.println("Vedio call start");
	}
}
