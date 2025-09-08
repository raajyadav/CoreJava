package abstractionInterface;

public class Bike implements Vehicle,Transport{
     
	@Override
	public void start() {
		System.out.println("Bike Start");
	}
	@Override
	public void stop() {
		System.out.println("Bike stop");
		
	}
	
	public void kick() {
		System.out.println("Bike start with kick");
	}
	public  void load() {
		System.out.println("Bike can load");
	}
}
